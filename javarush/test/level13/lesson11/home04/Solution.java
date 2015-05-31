package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        OutputStream outputStream=new FileOutputStream(reader.readLine());


        while (true){
            String s=reader.readLine();


            outputStream.write(s.getBytes());
            if (s.equals("exit")) break;
            outputStream.write("\r\n".getBytes());


        }
        outputStream.close();
        reader.close();
    }
}