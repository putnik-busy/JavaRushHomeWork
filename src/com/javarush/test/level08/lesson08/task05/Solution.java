package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
      HashMap<String,String> mapCopy = new HashMap<String, String>(map);
    for(Map.Entry<String,String> pair:mapCopy.entrySet())
    {
        int count=0;
        for(Map.Entry<String,String> paiR:mapCopy.entrySet())
        {
            if (pair.getValue().equals(paiR.getValue()))
            {
                count++;
                if (count >1)
                {
                    map.remove(pair.getKey());
                }
            }
        }
    }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
