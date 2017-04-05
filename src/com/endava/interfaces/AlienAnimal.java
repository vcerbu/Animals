package com.endava.interfaces;

/**
 * Created by vcerbu on 3/21/2017.
 */
public interface AlienAnimal extends Animal {

    public default void horrifies() {
        System.out.println("!!!!");
    }

}
