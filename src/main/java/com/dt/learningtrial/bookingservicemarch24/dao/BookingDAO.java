package com.dt.learningtrial.bookingservicemarch24.dao;

import com.dt.learningtrial.bookingservicemarch24.model.Bookings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

// Stereotype Annotation of @Component
@Repository
public class BookingDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Bookings> getAllBookings() {

        String getBookingQuery = "SELECT * FROM bookings";

        RowMapper<Bookings> bookingRowMapper=new RowMapper<Bookings>() {
            @Override
            public Bookings mapRow(ResultSet rs, int rowNum) throws SQLException {
                Bookings booking = new Bookings();
                booking.setBooingId(rs.getInt("BOOKING_ID"));
                booking.setCategory(rs.getString("CATEGORY"));
                booking.setName(rs.getString("NAME"));
                return booking;
            }
        };

        List<Bookings> bookings= jdbcTemplate.query(getBookingQuery, bookingRowMapper);
        return bookings;
    }
}
