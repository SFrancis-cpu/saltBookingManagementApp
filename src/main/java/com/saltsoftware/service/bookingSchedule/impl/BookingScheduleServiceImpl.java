package com.saltsoftware.service.bookingSchedule.impl;

import com.saltsoftware.entity.bookingSchedule.BookingSchedule;
import com.saltsoftware.repository.bookingSchedule.BookingScheduleRepository;
import com.saltsoftware.service.bookingSchedule.BookingScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by :Craig Carr AKA Fish84
 * Student no: 204111307
 * Desc: Create BookingScheduleServiceImpl similar to repository without DB access
 */
@Service
public class BookingScheduleServiceImpl implements BookingScheduleService {


    //Constructor
    @Autowired
    private BookingScheduleRepository bookingScheduleRepository;

    @Override
    public Set<BookingSchedule> getAll() {
        return this.bookingScheduleRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public BookingSchedule create(BookingSchedule bookingSchedule) {
        return this.bookingScheduleRepository.save(bookingSchedule);
    }

    @Override
    public BookingSchedule read(String s) {
        return this.bookingScheduleRepository.findById(s).orElseGet(null);
    }

    @Override
    public BookingSchedule update(BookingSchedule bookingSchedule) {
        if (this.bookingScheduleRepository.existsById(bookingSchedule.getBookingID())) {
            return this.bookingScheduleRepository.save(bookingSchedule);
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        this.bookingScheduleRepository.deleteById(s);
        if (this.bookingScheduleRepository.existsById(s)) return false;
        else return true;
    }
}
