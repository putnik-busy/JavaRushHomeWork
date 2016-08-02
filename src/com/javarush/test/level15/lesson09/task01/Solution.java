package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }
   static {
       labels.put(2.1,"1");
       labels.put(3.1,"2");
       labels.put(4.1,"2");
       labels.put(5.1,"4");
       labels.put(6.1,"5");
   }
}
