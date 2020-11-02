package com.saltsoftware.service.bookingSchedule.impl;

import com.saltsoftware.entity.bookingSchedule.BookingSchedule;
import com.saltsoftware.repository.bookingSchedule.BookingScheduleRepository;
import com.saltsoftware.repository.bookingSchedule.impl.BookingScheduleRepositoryImpl;
import com.saltsoftware.service.bookingSchedule.BookingScheduleService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by :Craig Carr AKA Fish84
 * Student no: 204111307
 * Desc: Create BookingScheduleServiceImpl similar to repository without DB access
 */
@Service
public class BookingScheduleServiceImpl implements BookingScheduleService {


    //Constructor

    private static BookingScheduleService bookingScheduleService = null;
    private BookingScheduleRepository bookingScheduleRepository;


    private BookingScheduleServiceImpl() {
        this.bookingScheduleRepository = BookingScheduleRepositoryImpl.getBookingScheduleRepository();
    }

    public static BookingScheduleService getBookingScheduleService() {
        if (bookingScheduleService == null)

            bookingScheduleService = new BookingScheduleServiceImpl();
        return bookingScheduleService;
    }

    @Override
    public Set<BookingSchedule> getAll() {
        return this.bookingScheduleRepository.getAll();
    }

    @Override
    public BookingSchedule create(BookingSchedule bookingSchedule) {
        return this.bookingScheduleRepository.create(bookingSchedule);
    }

    @Override
    public BookingSchedule read(String s) {
        return this.bookingScheduleRepository.read(s);
    }

    @Override
    public BookingSchedule update(BookingSchedule bookingSchedule) {
        return this.bookingScheduleRepository.update(bookingSchedule);
    }

    @Override
    public boolean delete(String s) {
        return this.bookingScheduleRepository.delete(s);
    }
}
