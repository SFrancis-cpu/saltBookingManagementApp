package com.saltsoftware.entity;

//Created by: Craig Carr
//Student Number: 204111307

public class BookingSchedule {
    private int bookingID;

    //constructor
    private BookingSchedule(Builder builder){
        this.bookingID = builder.bookingID;
    }

    //inner builder class
    public int getBookingID() {
        return bookingID;
    }

    //toString
    @Override
    public String toString() {
        return "BookingSchedule{" +
                "bookingID=" + bookingID +
                '}';
    }


    //inner builder class
    public static class Builder{
        private int bookingID;

        //inner class constructor
        public Builder setBookingID(int bookingID){
            this.bookingID = bookingID;
            return this;
        }

        //getters
        public Builder copy(BookingSchedule bookingSchedule){
            this.bookingID = bookingSchedule.bookingID;
            return this;
        }

        //builder method
        public BookingSchedule build(){

            return new BookingSchedule(this);
        }

    }
    public static void createBooking(){

    }
    public static void deleteBooking(){

    }
    public static void updateBooking(){

    }
    public static void viewBooking(){

    }
}
