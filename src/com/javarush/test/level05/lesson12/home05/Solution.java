package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int a=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (boolean isSumm = false; !isSumm;)
        {
            String s1 = reader.readLine();
           if (isSumm = s1.equals("сумма"))
           {
               System.out.println(a);
               break;
           } else
           {
               int n1 = Integer.parseInt(s1);
               a=a+n1;

           }

        }
    }
}

