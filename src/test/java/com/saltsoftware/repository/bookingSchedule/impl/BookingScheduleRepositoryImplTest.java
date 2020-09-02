package com.saltsoftware.repository.bookingSchedule.impl;

import com.saltsoftware.entity.bookingSchedule.BookingSchedule;
import com.saltsoftware.factory.bookingSchedule.BookingScheduleFactory;
import com.saltsoftware.repository.bookingSchedule.BookingScheduleRepository;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by :Craig Carr AKA Fish84
 * Student no: 204111307
 * Desc: Create BookingScheduleRepositoryImplTest
 */

public class BookingScheduleRepositoryImplTest {
    private static BookingScheduleRepository repository = new BookingScheduleRepositoryImpl();
    private BookingSchedule bookingSchedule = BookingScheduleFactory.buildBookingSchedule("M124");

    //Create Method
    @Test
    public void a_create() {
        BookingSchedule created = repository.create(bookingSchedule);
        assertEquals(bookingSchedule.getBookingID(), created.getBookingID());
        System.out.println("Create: " + created);
    }

    //Read Method
    @Ignore
    public void b_read() {
        BookingSchedule read = repository.read(bookingSchedule.getBookingID());
        assertEquals(bookingSchedule.getBookingID(), read.getBookingID());
        System.out.println("Read: " + read);
    }

    //Update Method
    @Test
    public void c_update() {
        //BookingSchedule updated = new BookingSchedule.Builder().setBookingID("56865").build();
        BookingSchedule updated = new BookingSchedule.Builder().copy(bookingSchedule).setBookingID("56865").build();
        repository.update(updated);
        assertNotEquals(bookingSchedule.getBookingID(), updated.getBookingID());
        System.out.println("Update: " + updated);
    }

    //Delete Method
    @Test
    public void e_delete() {
        repository.delete(bookingSchedule.getBookingID());
    }

    //GetAll from the DB
    @Ignore
    public void d_getAll() {
        Set<BookingSchedule> bookingSchedule = repository.getAll();
        assertEquals(1, bookingSchedule.size());
        System.out.println(repository.getAll());
    }
}