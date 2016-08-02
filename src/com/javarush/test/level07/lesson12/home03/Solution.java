package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{   final static  int n=20;
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        int  max=0;
        int  min=0;
        for(int i=0;i<n;i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }

        //напишите тут ваш код
        max=list.get(0);
        min=list.get(0);
        for(int i=1;i<n;i++)
        {

                if (max<list.get(i))
                {
                    max=list.get(i);
                }
            else
                if (min>list.get(i))
                {
                    min=list.get(i);
                }
        }

        System.out.print(max+ " "+ min);
    }
}
