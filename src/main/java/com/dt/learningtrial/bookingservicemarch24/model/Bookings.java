package com.dt.learningtrial.bookingservicemarch24.model;

/*
POJO
@Data: getter, setter, equal, hashcode, toString, require argument constructor
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bookings {

    private int booingId;
    private String category;
    private String name;

}
