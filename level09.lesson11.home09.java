package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        Map<String, Cat> slovar = new HashMap<>();
        slovar.put("Vaska1", new Cat("Vaska1"));
        slovar.put("Vaska2", new Cat("Vaska2"));
        slovar.put("Vaska3", new Cat("Vaska3"));
        slovar.put("Vaska4", new Cat("Vaska4"));
        slovar.put("Vaska5", new Cat("Vaska5"));
        slovar.put("Vaska6", new Cat("Vaska6"));
        slovar.put("Vaska7", new Cat("Vaska7"));
        slovar.put("Vaska8", new Cat("Vaska8"));
        slovar.put("Vaska9", new Cat("Vaska9"));
        slovar.put("Vaska10", new Cat("Vaska10"));
        return slovar;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> mnojestvo = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            Cat value = pair.getValue();                  //значение

            mnojestvo.add(value);
        }
        return mnojestvo;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }


        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
