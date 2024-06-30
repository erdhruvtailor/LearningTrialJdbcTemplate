package com.dt.learningtrial.bookingservicemarch24.model;

/*
POJO
@Data: getter, setter, equal, hashcode, toString, require argument constructor
@Builder: to create object, which can specify and configure value
*/

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Bookings {

    private int booingId;
    private String category;
    private String name;

}
