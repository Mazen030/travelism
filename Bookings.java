package com.example.tryui2;

public abstract class Bookings {
    protected double price=0.0;
    protected String description;
    public boolean equals(Bookings booking){
        if(booking.description.equals(this.description)){
            return true;
        }
        else
        {return false;}
    }
}