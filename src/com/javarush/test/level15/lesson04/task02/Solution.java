package com.javarush.test.level15.lesson04.task02;

/* ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами.
 В итоге должно получиться 10 различных методов printMatrix.
*/

public class Solution
{
    public static void main(String[] args)
    {
        printMatrix(2, 3, "8");
    }

    //1
    public static void printMatrix(int m, int n, String value)
    {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    //2
    public static void printMatrix(int m, int n, Object value)
    {
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(value);
            }
            System.out.println();
        }
    }
//3
    public static void printMatrix(double m, double n, String value)
    {
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    //4
    public static void printMatrix(short m, short n, String value)
    {
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    //5
    public static void printMatrix(int m, short n, String value)
    {
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    //6
    public static void printMatrix(double m, short n, String value)
    {
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    //7
    public static void printMatrix(Object m, short n, String value)
    {
        System.out.println(m.getClass().getSimpleName());
            for (int j = 0; j < n; j++)
            {
                System.out.print(value);
            }
            System.out.println();

    }
    //8
    public static void printMatrix(int m, Object n, String value)
    {
        for (int i = 0; i < m; i++)
        {
            System.out.println(n.getClass().getSimpleName());
                System.out.print(value);

            System.out.println();
        }

    }
    //9
    public static void printMatrix(int m, Object n, Object value)
    {
        for (int i = 0; i < m; i++)
        {
            System.out.println(n.getClass().getSimpleName());
            System.out.print(value);
            System.out.println();
        }

    }
    //10
    public static void printMatrix(Object m, Object n, Object value)
    {
        System.out.println(m.getClass().getSimpleName());
            System.out.println(n.getClass().getSimpleName());
            System.out.print(value);

            System.out.println();


    }
}
