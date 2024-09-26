package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {
    @Override
    public String getModelName() {
        return "Honda Model";
    }

    @Override
    public String getRegistrationNumber() {
        return "XYZ789";
    }

    @Override
    public String getOwnerName() {
        return "Owner Name";
    }

    public int getSpeed() {
        return 70; // Example speed
    }

    public void cdplayer() {
        System.out.println("CD Player is on");
    }
}
