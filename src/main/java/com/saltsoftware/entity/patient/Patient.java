package com.saltsoftware.entity.patient;

/* author: Bathi Ntshinga
/* std no:214198227
/* Description: Adding Annotations
 */

import com.saltsoftware.entity.employee.Employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Patient implements Serializable{

    @Id
    private String patientID;
    private String patientName;
    private String patientSurname;

    protected Patient(){}

    private Patient (Builder builder){
        this.patientID = builder.patientID;
        this.patientName = builder.patientName;
        this.patientSurname = builder.patientSurname;

    }

    public String getPatientID() {
        return patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientSurname() {
        return patientSurname;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientID='" + patientID + '\'' +
                ", \"patientSurname='\" + patientSurname + '\\'' +\n" +
                ", \" patientName='" + patientName + '\'' +
                '}';
    }

    public static class Builder{

        private String patientID;
        private String patientName;
        private String patientSurname;

        public Builder setPatientID(String patientID){
            this.patientID = patientID;
            return this;
        }

        public Builder setPatientName(String patientName){
            this.patientName = patientName;
            return this;
        }

        public Builder setPatientSurname(String patientSurname){
            this.patientSurname = patientSurname;
            return this;
        }
        public Builder copy(Patient patient){
            this.patientID = patient.patientID;
            this.patientName = patient.patientName;
            this.patientSurname = patient.patientSurname;
            return this;
        }
        public Patient build(){
            return new Patient(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Patient.Builder builder = (Patient.Builder) o;
            return patientID.equals(builder.patientID);
        }

        @Override
        public int hashCode() {
            return Objects.hash(patientID);
        }
    }
}
