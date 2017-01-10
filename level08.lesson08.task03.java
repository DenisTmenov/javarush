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

        Map<String, String> map = new HashMap<String, String>();

        map.put("Griffin", "Djustin");
        map.put("Dior", "Peter");
        map.put("Dwayn", "Djon");
        map.put("Sarkisyan", "Lois");
        map.put("Jackson", "Mikl");
        map.put("Dimond", "Lessy");
        map.put("Putin", "Vladimir");
        map.put("Poroshenko", "Petr");
        map.put("Girinivskii", "Vladimir");
        map.put("Balbesovi4", "Balbes");

        return (HashMap<String, String>) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код

        int countFirstName = 0;

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            //String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            if (value.equals(name))
            {
                countFirstName++;
            }
        }
            return countFirstName;


    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код

        int countLastName = 0;
        if (map.containsKey(lastName))
        {
            countLastName++;
        }


        return countLastName;


    }
}
