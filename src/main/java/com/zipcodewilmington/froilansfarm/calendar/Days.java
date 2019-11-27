package com.zipcodewilmington.froilansfarm.calendar;

public enum Days {

    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String day;

    Days(String value) { this.day = value;}

    private String getDays() {return day;}
}
