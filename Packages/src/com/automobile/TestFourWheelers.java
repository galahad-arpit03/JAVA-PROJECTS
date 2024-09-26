package com.automobile;

import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;

public class TestFourWheelers {
    public static void main(String[] args) {
        Logan logan = new Logan();
        System.out.println("Logan Model: " + logan.getModelName());
        System.out.println("Logan Speed: " + logan.speed());
        System.out.println("Logan GPS: " + logan.gps());

        Ford ford = new Ford();
        System.out.println("Ford Model: " + ford.getModelName());
        System.out.println("Ford Speed: " + ford.speed());
        System.out.println("Ford Temp Control: " + ford.tempControl());
    }
}
