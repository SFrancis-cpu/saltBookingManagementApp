package com.saltsoftware.service.bookingSchedule;

import com.saltsoftware.entity.bookingSchedule.BookingSchedule;
import com.saltsoftware.service.IService;

import java.util.Set;

public interface BookingScheduleService extends IService<BookingSchedule, String> {
    Set<BookingSchedule> getAll();

    //unique business logic
}
