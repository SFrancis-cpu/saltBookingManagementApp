/*
package com.saltsoftware.repository.bookingSchedule.impl;


import com.saltsoftware.entity.bookingSchedule.BookingSchedule;
import com.saltsoftware.repository.bookingSchedule.BookingScheduleRepository;

import java.util.HashSet;
import java.util.Set;

*/
/**
 * Created by :Craig Carr AKA Fish84
 * Student no: 204111307
 * Desc: Create BookingScheduleRepositoryImpl
 *//*


public class BookingScheduleRepositoryImpl implements BookingScheduleRepository {

    //Constructor

    private static BookingScheduleRepository bookingScheduleRepository = null;
    private Set<BookingSchedule> BookingSchedulesDB;

    BookingScheduleRepositoryImpl() {
        this.BookingSchedulesDB = new HashSet<>();
    }

    public static BookingScheduleRepository getBookingScheduleRepository() {
        if (bookingScheduleRepository == null) bookingScheduleRepository = new BookingScheduleRepositoryImpl();
        return bookingScheduleRepository;
    }

    */
/**
     *
     * @param bookingSchedule
     * @return This method creates a Booking Schedule
     *//*

    public BookingSchedule create(BookingSchedule bookingSchedule) {
        this.BookingSchedulesDB.add(bookingSchedule);
        return bookingSchedule;
    }

    */
/**
     *
     * @param bookingID
     * @return This method reads from BookingSchedule database
     *//*

    public BookingSchedule read(String bookingID){
        BookingSchedule bookingSchedule = null;
        for(BookingSchedule b : this.BookingSchedulesDB) {
            if (b.getBookingID().equalsIgnoreCase(bookingID)){
                bookingSchedule = b;
                break;
            }
        }
        return bookingSchedule;
    }

    */
/**
     *
     * @param bookingSchedule
     * @return This method updates an existing bookingSchedule
     *//*

    public BookingSchedule update(BookingSchedule bookingSchedule){
        //get the object and update
        BookingSchedule oldBookingSchedule = read(bookingSchedule.getBookingID());
        if (oldBookingSchedule != null) {
            this.BookingSchedulesDB.remove(oldBookingSchedule);
            this.BookingSchedulesDB.add(bookingSchedule);
        }
        return bookingSchedule;
    }

    */
/**
     *
     * @param bookingID
     * This method removes and booking object
     * @return
     *//*

    public boolean delete(String bookingID){
        BookingSchedule bookingSchedule = read(bookingID);
        if (bookingSchedule != null) this.BookingSchedulesDB.remove(bookingSchedule);
        return false;
    }

    @Override
    public Set<BookingSchedule> getAll() {
        return this.BookingSchedulesDB;
    }
}

*/
