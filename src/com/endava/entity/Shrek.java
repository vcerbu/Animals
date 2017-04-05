package com.endava.entity;

import com.endava.interfaces.AlienAnimal;

/**
 * Created by vcerbu on 3/21/2017.
 */
public class Shrek implements AlienAnimal {
    @Override
    public void eat() {
        System.out.println("...");
    }

    @Override
    public void move() {
    }

    @Override
    public void horrifies() {
    }

    public void isGreen() {
        System.out.println("I am green!");
    }
}
