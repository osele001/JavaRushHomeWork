package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Сергей on 12.04.2015.
 */
public class Singleton {
    private static Singleton singleton=new Singleton();
    public static Singleton getInstance(){

        return singleton;
    }

    private Singleton() {
    }
}
