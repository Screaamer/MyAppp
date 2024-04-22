package com.example.myapplication;

public class Apartment {
    public String id, landlord, address;
    public int maxAmount;
    public Apartment(){

    }

    public Apartment(String id, String landlord, String address, int maxAmount) {
        this.id = id;
        this.landlord = landlord;
        this.address = address;
        this.maxAmount = maxAmount;
    }
}
