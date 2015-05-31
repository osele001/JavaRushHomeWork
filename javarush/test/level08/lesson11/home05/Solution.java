package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char [] arr=s.toCharArray();

        if (!Character.toString(arr[0]).equals(" ")){
            arr[0]=Character.toUpperCase(arr[0]);
        }
        for (int i = 1; i < arr.length; i++)

        {

            if (Character.isWhitespace(arr[i-1]) && !Character.isWhitespace(arr[i])){
                arr[i]=Character.toUpperCase(arr[i]);
            }

        }

        s=new String(arr);
        System.out.print(s);
    }


}
