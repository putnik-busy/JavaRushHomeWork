package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ?
 и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException{
        //add your code here
        String myParam = init();
        parseParam(myParam);


    }

    public static String init () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String returnParam = "";
        String myURLinput = reader.readLine();
        if (myURLinput.indexOf("?") > -1) {
            returnParam = myURLinput.substring(myURLinput.indexOf("?") + 1);
        }
        return returnParam;
    }

    public static void parseParam (String paramaters) {
        StringTokenizer paramGroup = new StringTokenizer(paramaters, "&");
        ArrayList<String> myParameters = new ArrayList<String>();
        ArrayList<String> myValues = new ArrayList<String>();
        String valueParam = "";
        while (paramGroup.hasMoreTokens()) {
            StringTokenizer value = new StringTokenizer(paramGroup.nextToken(), "=");
            String myParam = value.nextToken();
            myParameters.add(myParam);
            if (myParam.equals("obj")) {
                valueParam = value.nextToken();
                myValues.add(valueParam);
            }
        }
        for (String s : myParameters) {
            System.out.print (s + " ");
        }
        System.out.println();
        for (String o : myValues) {
            try {
                Double myDouble = Double.parseDouble(o);
                alert(myDouble);
            }
            catch (NumberFormatException e) {
                String toPrint = o;
                alert (toPrint);
            }
        }
    }

    public static void alert(double value)
    {
        System.out.println("double " + value);
    }

    public static void alert(String value)
    {
        System.out.println("String " + value);
    }
}
