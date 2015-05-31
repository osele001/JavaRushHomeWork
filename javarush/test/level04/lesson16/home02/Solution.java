package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(reader.readLine()), n1=Integer.parseInt(reader.readLine()), n2=Integer.parseInt(reader.readLine());
        if((n>n1 && n<n2)||(n<n1 && n>n2))
            System.out.println(n);
        if((n1>n && n1<n2)||(n1<n && n1>n2))
            System.out.println(n1);
        if((n2>n && n2<n1)||(n2<n && n2>n1))
            System.out.println(n2);







    }
}
