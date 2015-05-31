package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Сергей on 08.04.2015.
 */
class MoldovanHen extends Hen{

    @Override
    int getCountOfEggsPerMonth() {
        return 8;
    }
    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA+ ". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
