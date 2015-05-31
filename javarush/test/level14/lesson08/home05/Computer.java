package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Сергей on 11.04.2015.
 */
public class Computer {
    private Mouse mouse=null;
    private Keyboard keyboard=null;
    private Monitor monitor=null;

    public Computer() {
        mouse=new Mouse();
        keyboard=new Keyboard();
        monitor=new Monitor();
    }

    public Computer(Mouse mouse, Keyboard keyboard, Monitor monitor) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }


}
