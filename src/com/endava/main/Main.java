package com.endava.main;

import com.endava.entity.Colibri;
import com.endava.entity.Dalmatian;
import com.endava.entity.Shrek;
import com.endava.entity.Siamese;

/**
 * Created by vcerbu on 4/5/2017.
 */
public class Main {
    public static void main(String[] args) {
        //animals
        System.out.println("04. Animals");
        Colibri colibri = new Colibri();
        Dalmatian dalmatian = new Dalmatian();
        Shrek shrek = new Shrek();
        Siamese siamese = new Siamese();

        System.out.println("Colibri: ");
        colibri.flies();
        System.out.println("Dalmatian: ");
        dalmatian.hasDots();
        System.out.println("Shrek: ");
        shrek.isGreen();
        System.out.println("Siamese: ");
        siamese.move();
    }

}
