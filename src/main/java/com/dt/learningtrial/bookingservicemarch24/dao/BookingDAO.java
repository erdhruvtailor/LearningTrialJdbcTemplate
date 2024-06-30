package com.dt.learningtrial.bookingservicemarch24.dao;

import com.dt.learningtrial.bookingservicemarch24.common.SqlQueries;
import com.dt.learningtrial.bookingservicemarch24.model.Bookings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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

        /*
            if we dont use ORM, we need to use either RowMapper or BeanPropertyRowMapper
        */


        /*
            // Use of StringBuilder and StringBuffer, use same instance for adding attributes functionality

            StringBuilder query = new StringBuilder(SqlQueries.getBookingQuery);
            query.append(SqlQueries.categoryWhereClause);
        */


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

        List<Bookings> bookings= jdbcTemplate.query(SqlQueries.getBookingQuery, bookingRowMapper);
        return bookings;


            /*
            // BeanPropertyRowMapper
            List<Bookings> bookings_a2 = jdbcTemplate.query(getBookingQuery, new BeanPropertyRowMapper<Student>(Bookings.class));
            return bookings;
            */


        /*
            we use hibernate to avoid above headache
        */
    }

    public void addBooking(Bookings bookings) {

        int numberOfRowAffected = jdbcTemplate.update(SqlQueries.insertBooking, bookings.getBooingId(), bookings.getCategory(), bookings.getName());
        System.out.println("Number Of Row Affected:"+numberOfRowAffected);


    }
}
