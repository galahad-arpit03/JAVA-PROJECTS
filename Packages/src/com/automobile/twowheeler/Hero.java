package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {
    @Override
    public String getModelName() {
        return "Hero Model";
    }

    @Override
    public String getRegistrationNumber() {
        return "ABC123";
    }

    @Override
    public String getOwnerName() {
        return "Owner Name";
    }

    public int getSpeed() {
        return 60; // Example speed
    }

    public void radio() {
        System.out.println("Radio is on");
    }
}
