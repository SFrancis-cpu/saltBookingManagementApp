package com.saltsoftware.repository.bookingSchedule;

import com.saltsoftware.entity.bookingSchedule.BookingSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by :Craig Carr AKA Fish84
 * Student no: 204111307
 * Desc: Create BookingScheduleRepository
 */
@Repository
public interface BookingScheduleRepository extends JpaRepository<BookingSchedule, String>{

}
