package com.endava.entity;

import com.endava.interfaces.Cat;

/**
 * Created by vcerbu on 3/21/2017.
 */
public class Siamese implements Cat {
    @Override
    public void eat() {
    }

    @Override
    public void move() {
        System.out.println("Runs fast!");
    }

    @Override
    public void scratch() {
    }
}
