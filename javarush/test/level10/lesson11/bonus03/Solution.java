package com.javarush.test.level10.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: ввести с клавиатуры 30 чисел. Вывести 10-е и 11-е минимальные числа.
Пояснение:
Самое минимальное число – 1-е минимальное.
Следующее минимальное после него – 2-е минимальное
Пример:
1 6 5  7  1  15   63   88
Первое минимальное – 1
Второе минимальное – 1
Третье минимальное – 5
Четвертое минимальное – 6
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Sheep> list=new ArrayList<Sheep>();



        list.add(new Sheep("First"));
        list.add(new Sheep("Second"));
        list.add(new Sheep("Third"));
        list.add(new Sheep("blabla"));
        list.add(new Sheep("Last"));

        for (Sheep sheep : list) {
            System.out.println(sheep.name);
        }


    }

    public static class Sheep{
        String name;

        public Sheep(String name) {
            this.name = name;
        }
    }
}
