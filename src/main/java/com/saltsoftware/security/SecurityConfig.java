package com.saltsoftware.security;

//Sakeena Francis, 215006097, Security Configuration, with and without encryption.
//Create users, roles, and passwords for authorization and access


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String BASIC_ROLE = "BASIC_USER";
    private static final String SUPER_ROLE = "SUPER_USER";

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("SUPER")
                //.password("{noop}5555") without encryption
                .password(encoder().encode("5555")) //with encryption (plus bean configuration)
                .roles(BASIC_ROLE, SUPER_ROLE)
                .and()

                .withUser("BASIC")
                //.password("{noop}3333") without encryption
                .password(encoder().encode("3333")) //with encryption (plus bean configuration)
                .roles(BASIC_ROLE);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/saltBookingManagementApp/**/create", "/saltBookingManagementApp/**/delete/**").hasRole(SUPER_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/**/read/**","/saltBookingManagementApp/**/all").hasRole(BASIC_ROLE)
                .and()

                //Abduragmaan Frank
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/saltBookingManagementApp/employee/create").hasRole(SUPER_ROLE)
                .antMatchers(HttpMethod.POST, "/saltBookingManagementApp/employee/update").hasRole(SUPER_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/employee/read").hasRole(BASIC_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/employee/all").hasRole(BASIC_ROLE)
                .antMatchers(HttpMethod.DELETE, "/saltBookingManagementApp/employee/delete").hasRole(SUPER_ROLE)
                .and()

                //Noluthando Nqwelo 215029003 Role endpoint authorization on endpoints
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/saltBookingManagementApp/role/create").hasRole(SUPER_ROLE)
                .antMatchers(HttpMethod.POST, "/saltBookingManagementApp/role/update").hasRole(SUPER_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/role/read").hasRole(BASIC_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/role/all").hasRole(BASIC_ROLE)
                .antMatchers(HttpMethod.DELETE, "/saltBookingManagementApp/role/delete").hasRole(SUPER_ROLE)
                .and()

                //Sakeena Francis 215006097 EmployeeRoleController Authorization on endpoints
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/saltBookingManagementApp/employeeRole/create").hasRole(SUPER_ROLE)
                .antMatchers(HttpMethod.POST, "/saltBookingManagementApp/employeeRole/update").hasRole(SUPER_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/employeeRole/read").hasRole(BASIC_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/employeeRole/all").hasRole(BASIC_ROLE)
                .antMatchers(HttpMethod.DELETE, "/saltBookingManagementApp/employeeRole/delete").hasRole(SUPER_ROLE)
                .and()

                //Heinrich Arends 217166792 PatientPaymentController Authorization on endpoints
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/saltBookingManagementApp/paymenttype/create").hasAuthority(SUPER_ROLE)
                .antMatchers(HttpMethod.PUT,"/saltBookingManagementApp/paymenttype/**/update").hasAuthority(SUPER_ROLE)
                .antMatchers(HttpMethod.DELETE,"/saltBookingManagementApp/paymenttype/delete").hasAuthority(SUPER_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/paymenttype/read").hasRole(BASIC_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/paymenttype/**/all").hasRole(BASIC_ROLE)
                .and()

                //Bathi Ntshinga 214198227 Authorization setting for Patient Controller
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/saltBookingManagementApp/patient/create").hasAuthority(SUPER_ROLE)
                .antMatchers(HttpMethod.PUT,"/saltBookingManagementApp/patient/update").hasRole(SUPER_ROLE)
                .antMatchers(HttpMethod.DELETE,"/saltBookingManagementApp/patient/delete").hasAuthority(SUPER_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/patient/read").hasRole(BASIC_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/patient/**/all").hasRole(BASIC_ROLE)
                .and()

                //Junade Frizlar 208046402 CostController Authorization on endpoints
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/saltBookingManagementApp/cost/create").hasAuthority(SUPER_ROLE)
                .antMatchers(HttpMethod.POST,"/saltBookingManagementApp/cost/update").hasRole(SUPER_ROLE)
                .antMatchers(HttpMethod.DELETE,"/saltBookingManagementApp/cost/delete").hasAuthority(SUPER_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/cost/read").hasRole(BASIC_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/cost/**/all").hasRole(BASIC_ROLE)
                .and()

                //Letsoha Lebusa 216059186 securing the ServiceCostController endpoints based on the level of access given to a user in the database
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/saltBookingManagementApp/servicecost/create").hasAuthority(SUPER_ROLE)
                .antMatchers(HttpMethod.POST,"/saltBookingManagementApp/servicecost/update").hasRole(SUPER_ROLE)
                .antMatchers(HttpMethod.DELETE,"/saltBookingManagementApp/servicecost/delete").hasAuthority(SUPER_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/servicecost/read").hasRole(BASIC_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/servicecost/**/all").hasRole(BASIC_ROLE)
                .and()

                //Linton Appollis 216182484 Setting Authorization For Patient Payment Record (11-01-2020)
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/saltBookingManagementApp/PatientPaymentRecord/create").hasAuthority(SUPER_ROLE)
                .antMatchers(HttpMethod.POST,"/saltBookingManagementApp/PatientPaymentRecord//update").hasRole(SUPER_ROLE)
                .antMatchers(HttpMethod.DELETE,"/saltBookingManagementApp/PatientPaymentRecord//delete").hasAuthority(SUPER_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/PatientPaymentRecord/read").hasRole(BASIC_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/PatientPaymentRecord/**/all").hasRole(BASIC_ROLE)
                .and()

                //Craig Carr 204111307 BookingScheduleController Authorization on endpoints
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/saltBookingManagementApp/bookingschedule/create").hasAuthority(SUPER_ROLE)
                .antMatchers(HttpMethod.POST,"/saltBookingManagementApp/bookingschedule/update").hasRole(SUPER_ROLE)
                .antMatchers(HttpMethod.DELETE,"/saltBookingManagementApp/bookingschedule/delete").hasAuthority(SUPER_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/bookingschedule/read").hasRole(BASIC_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/bookingschedule/**/all").hasRole(BASIC_ROLE)
                .and()

                 //Abram Rakgotho 215031393 configuring endpoint
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/saltBookingManagementApp/service/create").hasRole(SUPER_ROLE)
                .antMatchers(HttpMethod.POST, "/saltBookingManagementApp/service/update").hasRole(SUPER_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/service/read").hasRole(BASIC_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/service/**all**").hasRole(BASIC_ROLE)
                .antMatchers(HttpMethod.DELETE, "/saltBookingManagementApp/service/delete").hasRole(SUPER_ROLE)
                .and()
                .csrf().disable()
                .formLogin().disable();
    }

    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder();

    }
}
