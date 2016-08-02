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

import org.omg.CORBA.INTERNAL;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String fileName = reader.readLine();
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        ArrayList<Integer> list = new ArrayList<Integer>();

        while (br.ready())
        {
            int data =Integer.parseInt(br.readLine());
            if (data%2==0){
                list.add(data);
            }
        }
        reader.close();
        Collections.sort(list);
            for (int c:list)
            {
                System.out.println(c);
            }
        }

    }

