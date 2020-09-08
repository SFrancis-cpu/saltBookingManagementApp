package com.saltsoftware.service.bookingSchedule.impl;


import com.saltsoftware.entity.bookingSchedule.BookingSchedule;
import com.saltsoftware.factory.bookingSchedule.BookingScheduleFactory;
import com.saltsoftware.service.bookingSchedule.BookingScheduleService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by :Craig Carr AKA Fish84
 * Student no: 204111307
 * Desc: Create BookingScheduleServiceImplTest testing of
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookingScheduleServiceImplTest {

    private static BookingScheduleService bookingScheduleService = BookingScheduleServiceImpl.getBookingScheduleService();
    private BookingSchedule bookingSchedule = BookingScheduleFactory.buildBookingSchedule("56865");

    @Test
    public void d_getAll() {
        Set<BookingSchedule> bookingSchedules = bookingScheduleService.getAll();
        assertEquals(1,bookingSchedules.size());
        System.out.println("All bookings: " + bookingSchedules);
    }

    @Test
    public void a_create() {
        BookingSchedule created = bookingScheduleService.create(bookingSchedule);
        assertEquals(bookingSchedule.getBookingID(), created.getBookingID());
        System.out.println("Created: " + created);
    }

    @Test
    public void b_read() {
        BookingSchedule read = bookingScheduleService.read(bookingSchedule.getBookingID());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update() {
        BookingSchedule updated = new BookingSchedule.Builder().copy(bookingSchedule).setBookingID("56865").build();
        updated = bookingScheduleService.update(updated);
        System.out.println("Update: " + updated);
    }

    @Test
    public void e_delete() {
        bookingScheduleService.delete(bookingSchedule.getPatientID());
    }
}