package com.javarush.test.level14.lesson08.bonus03;


public abstract class Singleton
{
private static Singleton singleton;
    public static Singleton getInstance(){

        return singleton;
    }

    private Singleton()
    {
    }
}
