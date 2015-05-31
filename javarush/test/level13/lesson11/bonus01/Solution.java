package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader inputStream=new BufferedReader(new FileReader(reader.readLine()));

        ArrayList<Integer> array=new ArrayList<Integer>();
        String s=inputStream.readLine();
        while (s!=null){

            array.add(Integer.parseInt(s));
            s=inputStream.readLine();
        }
        Collections.sort(array);
        for (Integer integer : array) {
            if (integer%2==0) System.out.println(integer);
        }
    }



}
