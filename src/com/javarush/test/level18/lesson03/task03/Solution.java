package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> relist = new ArrayList<Integer>();
        FileInputStream inputStream = new FileInputStream(fileName);
        String res = "";
        while (inputStream.available() > 0)
        {
            list.add(inputStream.read());
        }
        int[] count = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            count[i] = 0;
            for (int j = 0; j < list.size(); j++)
            {
                if (list.get(i).equals(list.get(j))) count[i]++;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i : count)
        {
            if (i > max) max = i;
        }

        for (int i = 0; i < list.size(); i++)
        {
            if (!relist.contains(list.get(i)) && count[i] == max)
                relist.add(list.get(i));
        }
        for (int s : relist)
        {
            res = s + " ";
        }
        System.out.println(res);
        reader.close();
        inputStream.close();
    }
}
