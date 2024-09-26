package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {
    @Override
    public String getModelName() {
        return "Ford Model";
    }

    @Override
    public String getRegistrationNumber() {
        return "UVW321";
    }

    @Override
    public String getOwnerName() {
        return "Owner Name";
    }

    public int speed() {
        return 90; // Example speed
    }

    public int tempControl() {
        return 1; // AC is on
    }
}
