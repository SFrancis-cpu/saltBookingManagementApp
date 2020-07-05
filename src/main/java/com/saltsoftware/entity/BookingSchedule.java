package com.saltsoftware.entity;

//Created by: Craig Carr
//Student Number: 204111307

public class BookingSchedule {
    private int bookingID;

    private BookingSchedule(Builder builder){
        this.bookingID = builder.bookingID;
    }

    public int getBookingID() {
        return bookingID;
    }

    @Override
    public String toString() {
        return "BookingSchedule{" +
                "bookingID=" + bookingID +
                '}';
    }


    public static class Builder{
        private int bookingID;

        public Builder setBookingID(int bookingID){
            this.bookingID = bookingID;
            return this;
        }

        public Builder copy(BookingSchedule bookingSchedule){
            this.bookingID = bookingSchedule.bookingID;
            return this;
        }

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
