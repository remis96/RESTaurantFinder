package com.example.restaurantfinder.model;

public class OpeningHours {

    private Long id;

    private Integer openHour;

    private Integer openMinute;

    private Integer closeHour;

    private Integer closeMinute;

    private DAY dayOfWeek;

    private Boolean closed;

    public enum DAY {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

}
