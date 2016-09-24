package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    private static int counter = 0;

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileReader readerFile = new FileReader(reader.readLine());
        reader.close();

        String name = "";
        while (readerFile.ready())
        {
            char currentChar = (char) readerFile.read();
            name += currentChar;
        }

        String splitString[] = name.replaceAll("\\p{P}", " ").toLowerCase().replaceAll("\\s", " ").split(" ");
        for (String x : splitString)
        {
            if (x.equals("world"))
            {
                counter++;
            }
        }

        System.out.println(counter);
        readerFile.close();
    }
}
