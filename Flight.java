package com.example.tryui2;

import java.time.LocalDate;
import java.util.Date;

public class Flight extends Bookings{
    private LocalDate Departure_Date;
    private LocalDate Arriving_Date;
    private String aclass;
    private String Departure_Airport;
    private String Arriving_Airport;
    private boolean booked;
    private String airline;
    public Flight(LocalDate departure_Date, LocalDate arriving_Date, String flightno, String aClass, String departure_Airport, String arriving_Airport, boolean booked, String airline) {
        Departure_Date = departure_Date;
        Arriving_Date = arriving_Date;
        Flightno = flightno;
        Class = aClass;
        Departure_Airport = departure_Airport;
        Arriving_Airport = arriving_Airport;
        this.booked = booked;
        this.airline = airline;
    }

    private String Flightno;
    private String Class;

    public LocalDate getDeparture_Date() {
        return Departure_Date;
    }

    public void setDeparture_Date(LocalDate departure_Date) {
        Departure_Date = departure_Date;
    }

    public LocalDate getArriving_Date() {
        return Arriving_Date;
    }

    public void setArriving_Date(LocalDate arriving_Date) {
        Arriving_Date = arriving_Date;
    }

    public String getFlightno() {
        return Flightno;
    }

    public void setFlightno(String flightno) {
        Flightno = flightno;
    }
    public String getAclass()
    {
        return aclass;
    }

    public void setClass(String aClass) {
        Class = aClass;
    }

    public String getDeparture_Airport() {
        return Departure_Airport;
    }

    public void setDeparture_Airport(String departure_Airport) {
        Departure_Airport = departure_Airport;
    }

    public String getArriving_Airport() {
        return Arriving_Airport;
    }

    public void setArriving_Airport(String arriving_Airport) {
        Arriving_Airport = arriving_Airport;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }


}