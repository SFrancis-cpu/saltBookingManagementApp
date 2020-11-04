/*
package com.saltsoftware.repository.bookingSchedule.impl;


import com.saltsoftware.entity.bookingSchedule.BookingSchedule;
import com.saltsoftware.factory.bookingSchedule.BookingScheduleFactory;
import com.saltsoftware.repository.bookingSchedule.BookingScheduleRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

import static org.junit.Assert.assertEquals;

*/
/**
 * Created by :Craig Carr AKA Fish84
 * Student no: 204111307
 * Desc: Create BookingScheduleRepositoryImplTest
 *//*

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookingScheduleRepositoryImplTest {

    @Autowired
    private static BookingScheduleRepository repository;
    private static BookingSchedule bookingSchedule = BookingScheduleFactory.buildBookingSchedule("3eesaf");

    //GetAll from the DB
    @Test
    public void d_getAll() {
        Set<BookingSchedule> bookingSchedule = repository.findAll();
        assertEquals(1, bookingSchedule.size());
        System.out.println(repository.getAll());
    }

    //Create Method
    @Test
    public void a_create() {
        BookingSchedule created = repository.create(bookingSchedule);
        assertEquals(bookingSchedule.getPatientID(), created.getPatientID());
        System.out.println("Created: " + created);
    }

    //Read Method
    @Test
    public void b_read() {
        BookingSchedule read = repository.read(bookingSchedule.getPatientID());
        System.out.println("Read: " + read);
    }

    //Update Method
    @Test
    public void c_update() {
        BookingSchedule updated = new BookingSchedule.Builder().copy(bookingSchedule).setPatientID("56865").build();
        updated = repository.update(updated);
        System.out.println("Update: " + updated);
    }

    //Delete Method
    @Test
    public void e_delete() {
        boolean deleted = repository.delete(bookingSchedule.getPatientID());

    }


}*/
