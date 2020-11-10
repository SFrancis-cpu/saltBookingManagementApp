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

                .antMatchers(HttpMethod.POST, "/saltBookingManagementApp/employee/create","/saltBookingManagementApp/employee/update", "/saltBookingManagementApp/employee/delete/**").hasRole(SUPER_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/employee/read/**","/saltBookingManagementApp/employee/all").hasRole(BASIC_ROLE)
                .antMatchers(HttpMethod.DELETE,"/saltBookingManagementApp/employee/delete").hasRole(SUPER_ROLE)
        // Noluthando Nqwelo Role
                .antMatchers(HttpMethod.POST, "/saltBookingManagementApp/role/create","/saltBookingManagementApp/role/update").hasRole(SUPER_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/role/read/**","/saltBookingManagementApp/role/all").hasRole(BASIC_ROLE)
                .antMatchers(HttpMethod.DELETE,"/saltBookingManagementApp/role/delete").hasAuthority(SUPER_ROLE)
                .and()
                .csrf().disable();

        //Heinrich Arends 217166792 PatientPaymentController Authorization on endpoints
        http.httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/saltBookingManagementApp/paymenttype/create").hasAuthority(SUPER_ROLE)
                .antMatchers(HttpMethod.POST,"/saltBookingManagementApp/paymenttype/update").hasRole(SUPER_ROLE)
                .antMatchers(HttpMethod.DELETE,"/saltBookingManagementApp/paymenttype/delete").hasAuthority(SUPER_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/paymenttype/read").hasRole(BASIC_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/paymenttype/**/all").hasRole(BASIC_ROLE)
                .and()
                .csrf().disable();

        //Linton Appollis 216182484 Setting Authorization For Patient Payment Record (11-01-2020)
        http.httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/saltBookingManagementApp/salt/create").hasAuthority(SUPER_ROLE)
                .antMatchers(HttpMethod.POST,"/saltBookingManagementApp/salt/update").hasRole(SUPER_ROLE)
                .antMatchers(HttpMethod.DELETE,"/saltBookingManagementApp/salt/delete").hasAuthority(SUPER_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/salt/read").hasRole(BASIC_ROLE)
                .antMatchers(HttpMethod.GET, "/saltBookingManagementApp/salt/**/all").hasRole(BASIC_ROLE)
                .and()
                .csrf().disable();
    }

    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder();

    }
}
