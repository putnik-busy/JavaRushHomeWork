package com.javarush.test.level14.lesson08.bonus01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here
        try
        {
            String[] array= new String[5];
            array[6]="123";
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            String[] array= new String[-2];
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            LinkedList list = new LinkedList();
            list.get(-1);
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            Object x = new Integer(0);
            System.out.println((String)x);
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            Object szStr[] = new String[10];
            szStr[0] = new Character('*');
        }

        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            int[] nNulArray = new int[5];
            nNulArray = null;
            int i = nNulArray.length;
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            String szShortString = "123";
            char chr = szShortString.charAt(10);
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            String s = "qwe";
            int i = Integer.parseInt(s);
            System.out.println("int value = " + i);
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try {


            throw new IllegalStateException("MyException");

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }



    }
}
