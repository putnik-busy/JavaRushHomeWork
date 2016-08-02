package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        FileInputStream inputStream = new FileInputStream(input);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> relist = new ArrayList<Integer>();
        String output = "";
        while (inputStream.available() > 0)
        {
            list.add(inputStream.read());
        }
        int[] countMin = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            countMin[i] = 0;
            for (int j = 0; j < list.size(); j++)
            {
                if (list.get(i).equals(list.get(j))) countMin[i]++;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i1 : countMin)
        {
            if (i1 < min) min = i1;
        }

        for (int i = 0; i < list.size(); i++)
        {
            if (!relist.contains(list.get(i)) && countMin[i] == min)
                relist.add(list.get(i));
        }
        for (int s : relist)
        {
            output += s + " ";
        }
        System.out.println(output);
        reader.close();
        inputStream.close();
    }
}
