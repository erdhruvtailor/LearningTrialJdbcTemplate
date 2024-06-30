package com.dt.learningtrial.bookingservicemarch24;

import com.dt.learningtrial.bookingservicemarch24.dao.BookingDAO;
import com.dt.learningtrial.bookingservicemarch24.model.Bookings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class BookingServiceMarch24Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(BookingServiceMarch24Application.class, args);

		BookingDAO bookingDAO = applicationContext.getBean(BookingDAO.class);
		List<Bookings> allBookings = bookingDAO.getAllBookings();
		allBookings.forEach(System.out::println);
	}

}
