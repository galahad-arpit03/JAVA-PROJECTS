package com.automobile;

import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class TestTwoWheelers {
    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println("Hero Model: " + hero.getModelName());
        System.out.println("Hero Speed: " + hero.getSpeed());
        hero.radio();

        Honda honda = new Honda();
        System.out.println("Honda Model: " + honda.getModelName());
        System.out.println("Honda Speed: " + honda.getSpeed());
        honda.cdplayer();
    }
}
