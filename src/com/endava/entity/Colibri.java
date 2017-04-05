package com.endava.entity;

import com.endava.abstractclasses.Bird;

/**
 * Created by vcerbu on 3/21/2017.
 */
public class Colibri extends Bird {
    @Override
    public void flies() {
        System.out.println("Flies backwards");
    }

    @Override
    public void eat() {
        System.out.println("Seeds");
    }

    @Override
    public void move() {
    }
}
