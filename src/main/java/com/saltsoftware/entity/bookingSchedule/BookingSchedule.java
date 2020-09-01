package com.saltsoftware.entity.bookingSchedule;

/**
 * Created by :Craig Carr AKA Fish84
 * Student no: 204111307
 * Desc: Create BookingSchedule Builder
 */

public class BookingSchedule {
    private String bookingID;

    //constructor
    private BookingSchedule(Builder builder){
        this.bookingID = builder.bookingID;
    }

    //inner builder class
    public String getBookingID() {
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
        private String bookingID;

        //inner class constructor
        public Builder setBookingID(String bookingID){
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
