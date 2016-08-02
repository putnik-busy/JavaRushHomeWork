package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int maximum;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        if (x < 0)
        {
            System.out.print("Вы ввели число < 0");
        }
        int input = Integer.parseInt(reader.readLine());
        maximum = input;
        for (int i = 1; i < x; i++)
        {
            input = Integer.parseInt(reader.readLine());
            maximum = max(maximum,input);
        }
        System.out.println(maximum);
    }
public static int max(int a,int b)
{
    if (a>b) return a;
    else return b;
}
        //напишите тут ваш код

    }
