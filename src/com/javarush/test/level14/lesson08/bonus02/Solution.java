package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println(nod(a, b));
        System.out.println(nod2(a, b));

    }
//1 varaint
   private static int nod(int a, int b)
    {
            if (b == 0)
            {
                return a;
            } else
            {
               return nod(b, a % b);
            }
    }
    // 2 variant
    private static int nod2(int a,int b)
    {
        while (a!=0 && b!=0){
            if (a>b){
                a%=b;
            }else {
                b%=a;
            }
        }
        return a+b;
    }

}

