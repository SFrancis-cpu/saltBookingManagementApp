package com.saltsoftware.repository.bookingSchedule;

import com.saltsoftware.entity.bookingSchedule.BookingSchedule;
import com.saltsoftware.repository.Repository;

import java.util.Set;

/**
 * Created by :Craig Carr AKA Fish84
 * Student no: 204111307
 * Desc: Create BookingScheduleRepository
 */

public interface BookingScheduleRepository extends Repository<BookingSchedule, String> {
    Set<BookingSchedule> getAll();
}
