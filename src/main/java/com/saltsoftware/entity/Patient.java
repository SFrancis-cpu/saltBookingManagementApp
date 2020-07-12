package com.saltsoftware.entity;
/* author: Bathi Ntshinga
/* std no:214198227
/* Description: Entity for Patient
 */

public class Patient{
    private String patientID;
    private String patientName;

    private Patient (Builder builder){
        this.patientID = builder.patientID;
        this.patientName = builder.patientName;

    }

    public String getPatientID() {
        return patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientID='" + patientID + '\'' +
                ", patientName='" + patientName + '\'' +
                '}';
    }

    public static class Builder{

        private String patientID;
        private String patientName;

        public Builder setPatientID(String patientID){
            this.patientID = patientID;
            return this;
        }

        public Builder setPatientName(String patientName){
            this.patientName = patientName;
            return this;
        }
        public Builder copy(Patient patient){
            this.patientID = patient.patientID;
            this.patientName = patient.patientName;
            return this;
        }
        public Patient build(){
            return new Patient(this);
        }
    }
}


