package com.saltsoftware.controller.bookingSchedule;

import com.saltsoftware.entity.bookingSchedule.BookingSchedule;
import com.saltsoftware.factory.bookingSchedule.BookingScheduleFactory;
import com.saltsoftware.service.bookingSchedule.impl.BookingScheduleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Created by :Craig Carr AKA Fish84
 * Student no: 204111307
 * Desc: BookingSchedule controller
 */

@RestController
@RequestMapping("/bookingSchedule")
public class BookingScheduleController {

    @Autowired
    private BookingScheduleServiceImpl bookingScheduleService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    //@PostMapping("/create")
    public BookingSchedule create(@RequestBody BookingSchedule bookingSchedule){
        BookingSchedule newBookingSchedule = BookingScheduleFactory.buildBookingSchedule(bookingSchedule.getBookingID());
        return bookingScheduleService.create(newBookingSchedule);
    }

    @GetMapping("/all")
    public Set<BookingSchedule> getall() {
        return bookingScheduleService.getAll();
    }

    //read
    @GetMapping("/read/{id}")
    @ResponseBody
    public BookingSchedule read(@PathVariable String id){
        return bookingScheduleService.read(id);
    }
    //Update method
    @PostMapping("/update")
    public BookingSchedule update(@RequestBody BookingSchedule bookingSchedule){
        return bookingScheduleService.update(bookingSchedule);
    }
    //Delete method
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){
        return bookingScheduleService.delete(id);

    }
}
