package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Сергей on 01.01.2016.
 */
public class Mouse implements  CompItem
{
    @Override
    public String getName()
    {
        return  this.getClass().getSimpleName();
    }
}
