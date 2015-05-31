package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        Arrays.sort(array);
        /*for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                char[] t2=array[j].toCharArray();
                char[] t1=array[j-1].toCharArray();
                String a=Character.toString(t2[0]), b=Character.toString(t1[0]);

                if (!isGreaterThen(a, b)){
                    String t;
                    t=array[j];
                    array[j]=array[j-1];
                    array[j-1]=t;
                }
            }
        }*/
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}
