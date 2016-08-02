package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("Иванов","Петя");
        map.put("Сидоров","Саня");
        map.put("Спиридонов","Женя");
        map.put("Исаков","Веня");
        map.put("Газимов","Марат");
        map.put("Косякин","Артур");
        map.put("Козявочкин","Миша");
        map.put("Лункин","Иван");
        map.put("Лешайкин","Женя");
        map.put("Мушин","Виктор");

        getCountTheSameFirstName(map, "Виктор");
        getCountTheSameLastName(map,"Мушин");

        return (HashMap) map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int i=0;
        for(Map.Entry<String,String> pair:map.entrySet())
        {
            String value = pair.getValue();
            if (value.equals(name))
            {
                i++;
            }
        }

        return  i;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //напишите тут ваш код
        int i=0;
        for(Map.Entry<String,String> pair:map.entrySet())
        {
            String key = pair.getKey();
            if (key.equals(familiya))
            {
                i++;
            }
        }
        return  i;
    }
}
