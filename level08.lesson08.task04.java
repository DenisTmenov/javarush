package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JANUARY 11 1967"));
        map.put("Stallone3", new Date("FEBRUARY 21 1997"));
        map.put("Stallone4", new Date("MARCH 5 1987"));
        map.put("Stallone5", new Date("JULY 13 1980"));
        map.put("Stallone6", new Date("AUGUST 1 1980"));
        map.put("Stallone7", new Date("JULY 1 1980"));
        map.put("Stallone8", new Date("MARCH 1 1987"));
        map.put("Stallone9", new Date("AUGUST 1 1980"));
        map.put("Stallone10", new Date("FEBRUARY 1 1987"));

        return map;

        //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        for(Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator(); it.hasNext(); )
        {
            Map.Entry<String, Date> pair = it.next();
            if(pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 || pair.getValue().getMonth() == 7)
            {
                it.remove();
            }
        }

        //System.out.println(map);

    }

    /*public static void main(String[] args)
    {
        System.out.println(createMap().entrySet());
        removeAllSummerPeople(createMap());



        //System.out.println(createMap());
        //System.out.println(removeAllNumbersMoreThan10(createSet()));

    }*/
}
