package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Griffin", "Djustin");
        map.put("Dior", "Peter");
        map.put("Dwayn", "Djon");
        map.put("Sarkisyan", "Lois");
        map.put("Jackson", "Mikl");
        map.put("Dimond", "Lessy");
        map.put("Putin", "Vladimir");
        map.put("Poroshenko", "Petr");
        map.put("Girinivskii", "Vladimir");
        map.put("Balbesovich", "Balbes");

        return (HashMap<String, String>) map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
       /* List<String> list = new ArrayList<String>();
        // занесем все неповторяющиеся имена в список и если имя в списке, то удалим из словаря повторяющееся имя
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String name = pair.getValue();                  //значение
            if (!list.contains(name)) // если имени нет в списке list
            {
                list.add(name);
            }
            else
                {
                    map.remove(key);
                }
        }*/
        HashMap<String, String> copy = new HashMap<String, String>(map); // copy map
        for (String value : copy.values())
        {
            if (Collections.frequency(copy.values(), value) > 1) // check frequensy  колличество совпадений
                removeItemFromMapByValue(map, value);
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
