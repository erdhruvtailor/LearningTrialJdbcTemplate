package com.dt.learningtrial.bookingservicemarch24.common;

public interface SqlQueries {

    String getBookingQuery = "SELECT * FROM bookings";

    String categoryWhereClause = "WHERE category = ?";

    String insertBooking = "INSERT INTO bookings VALUES (?, ?, ?)";

}
