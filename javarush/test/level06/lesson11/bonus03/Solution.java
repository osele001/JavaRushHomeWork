package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        String s;
        int[] m=new int[5];
        int n;

        for (int i = 0; i < 5; i++) {
            m[i]=Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if(m[j-1]>m[j]){
                    n=m[j];
                    m[j]=m[j-1];
                    m[j-1]=n;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(m[i]);

        }
    }
}
