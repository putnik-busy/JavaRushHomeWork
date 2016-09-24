package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args)
    {
        int count = 0;
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
            while (bufferedReader.ready())
            {
                String s = bufferedReader.readLine().toLowerCase();
                char[] chars = s.toCharArray();
                for (char aChar : chars)
                {
                    if (aChar >= 'a' && aChar <= 'z')
                    {
                        count++;
                    }
                }
            }
            bufferedReader.close();
            System.out.println(count);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
