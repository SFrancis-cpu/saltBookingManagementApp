package com.saltsoftware.entity.bookingSchedule;

import java.io.Serializable;

/**
 * Created by :Craig Carr AKA Fish84
 * Student no: 204111307
 * Desc: Create BookingSchedule Builder
 */

public class BookingSchedule implements Serializable {
    private String bookingID, patientID;
    private BookingSchedule(){}

    //constructor
    private BookingSchedule(Builder builder) {
        this.bookingID = builder.bookingID;
        this.patientID = builder.patientID;
    }

    //inner builder class
    public String getBookingID() {
        return bookingID;
    }

    public String getPatientID() {
        return patientID;
    }

    //toString
    @Override
    public String toString() {
        return "BookingSchedule{" +
                "bookingID=" + bookingID +
                ", patientID=" + patientID +
                '}';
    }


    //inner builder class
    public static class Builder {
        private String bookingID, patientID;
        //inner class constructor
        public Builder setBookingID(String bookingID) {
            this.bookingID = bookingID;
            return this;
        }

        public Builder setPatientID(String patientID) {
            this.patientID = patientID;
            return this;
        }


            //getters
            public Builder copy (BookingSchedule bookingSchedule){
                this.bookingID = bookingSchedule.bookingID;
                this.patientID = bookingSchedule.patientID;
                return this;
            }

            //builder method
            public BookingSchedule build () {

                return new BookingSchedule(this);
            }
        }
    }
