package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        String filename2 = reader.readLine();
        FileInputStream inputStreamReader = new FileInputStream(filename);
        FileOutputStream inputStreamReader2 = new FileOutputStream(filename2);
        byte[] buffer = new byte[inputStreamReader.available()];

        for (int i = inputStreamReader.read(buffer); i > 0; i--)
        {
            inputStreamReader2.write(buffer[i-1]);
        }
        reader.close();
        inputStreamReader.close();
        inputStreamReader2.close();

    }
}
