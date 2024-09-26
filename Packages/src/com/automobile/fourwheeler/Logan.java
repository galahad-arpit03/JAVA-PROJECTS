package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {
    @Override
    public String getModelName() {
        return "Logan Model";
    }

    @Override
    public String getRegistrationNumber() {
        return "LMN456";
    }

    @Override
    public String getOwnerName() {
        return "Owner Name";
    }

    public int speed() {
        return 80; // Example speed
    }

    public int gps() {
        return 1; // GPS is on
    }
}
