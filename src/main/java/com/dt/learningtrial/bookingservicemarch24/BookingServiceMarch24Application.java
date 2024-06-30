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

		//	Bookings bookings = new Bookings(2, "bus", "Jagdish");

		//Using of @Builder Annotation
		Bookings bookings1 = Bookings.builder().booingId(2).category("Tram").name("Jayesh").build();
		bookingDAO.addBooking(bookings1);
		Bookings bookings2 = Bookings.builder().booingId(3).category("Tram").name("Lexzy").build();
		bookingDAO.addBooking(bookings2);

		List<Bookings> allBookings = bookingDAO.getAllBookings();
		allBookings.forEach(System.out::println);


	}

}
