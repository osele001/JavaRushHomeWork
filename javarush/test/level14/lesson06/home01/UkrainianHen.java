package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Сергей on 08.04.2015.
 */
public class UkrainianHen extends Hen{

    @Override
    int getCountOfEggsPerMonth() {
        return 15;
    }
    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE+ ". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
