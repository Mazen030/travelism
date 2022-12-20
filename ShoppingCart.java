package com.example.tryui2;

import java.util.ArrayList;

class ShoppingCart {
    Double Total_price=0.0;
    ArrayList<Bookings> items=new ArrayList<Bookings>();
    ShoppingCart(){}
    void additem(Bookings booking){
        items.add(booking);
    }
    void deleteitem(Bookings booking){
        for(int i = 0; i<items.size();i++){
            if(booking.equals(items.get(i))){
                items.remove(items.get(i));
            }
        }
    }
    Bookings search(Bookings booking){
        for(int i = 0; i<items.size();i++){
            if(booking.equals(items.get(i))){
                return items.get(i);
            }
        }
        return null;
    }
}