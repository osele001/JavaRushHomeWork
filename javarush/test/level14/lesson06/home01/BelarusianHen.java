package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Сергей on 08.04.2015.
 */
 class BelarusianHen extends Hen{

    @Override
    int getCountOfEggsPerMonth() {
        return 30;
    }
    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS+ ". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
