package com.saltsoftware.factory.bookingSchedule;


import com.saltsoftware.entity.bookingSchedule.BookingSchedule;
import com.saltsoftware.factory.bookingSchedule.BookingScheduleFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotSame;

/**
 * Created by :Craig Carr AKA Fish84
 * Student no: 204111307
 * Desc: Create BookingSchedule Factory test cases
 */

public class BookingScheduleFactoryTest {

    @Before
    public void setUp(){
        //Test data
        BookingSchedule b = BookingScheduleFactory.createBookingSchedule();
    }

    @Test
    public void createBookingSchedule() {
        //Test data
        BookingSchedule b1 = BookingScheduleFactory.createBookingSchedule();
        BookingSchedule b2 = BookingScheduleFactory.createBookingSchedule();

        //Equality test
        assertEquals(b1.getBookingID(),b1.getBookingID());

        //Identity tests
        assertSame(b2.getBookingID(),b2.getBookingID());
        assertNotSame(b1.getBookingID(),b2.getBookingID());
    }

    @Test
    public void testFail(){
        //Fail test
        Assert.fail();
        System.out.println();
    }
}