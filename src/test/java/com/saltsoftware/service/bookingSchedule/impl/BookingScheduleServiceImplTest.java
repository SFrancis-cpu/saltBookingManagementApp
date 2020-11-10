package com.saltsoftware.service.bookingSchedule.impl;


import com.saltsoftware.entity.bookingSchedule.BookingSchedule;
import com.saltsoftware.factory.bookingSchedule.BookingScheduleFactory;
import com.saltsoftware.service.bookingSchedule.BookingScheduleService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by :Craig Carr AKA Fish84
 * Student no: 204111307
 * Desc: Create BookingScheduleServiceImplTest testing of21
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookingScheduleServiceImplTest {

    @Autowired
    private static BookingScheduleService bookingScheduleService;
    private static BookingSchedule bookingSchedule = BookingScheduleFactory.createBookingSchedule("10-02-2020", "13:00");

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
        assertEquals(bookingSchedule.getBookingID(), read.getBookingID());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update() {
        BookingSchedule updated = new BookingSchedule.Builder().copy(bookingSchedule).setBookingDate("22-02-2020").build();
        bookingScheduleService.update(updated);
        Assert.assertNotEquals(bookingSchedule.getBookingDate(), updated.getBookingDate());
        System.out.println("Update: " + updated);
    }

    @Test
    public void e_delete() {
        bookingScheduleService.delete(bookingSchedule.getBookingID());
    }
}