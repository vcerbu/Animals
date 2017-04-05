package com.endava.entity;

import com.endava.interfaces.Dog;

/**
 * Created by vcerbu on 3/21/2017.
 */
public class Dalmatian implements Dog {
    @Override
    public void eat() {
        System.out.println("I am not a vegan. I like meat!");
    }

    @Override
    public void move() {
        System.out.println("Runs faster");
    }

    public void barks() {
        System.out.println("Barks louder");
    }

    public void hasDots() {
        System.out.println("Black and white dots");
    }

}
