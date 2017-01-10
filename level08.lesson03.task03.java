package com.javarush.test.level08.lesson03.task03;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Коллекция HashMap из котов
Есть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }


            /*Date today = new Date();
            System.out.println("Current date: " + today);*/

            /*
            Вычисление разницы между двумя датами:
            Date currentTime = new Date();           //получаем текущую дату и время
            Thread.sleep(3000);                      //ждём 3 секунды – 3000 миллисекунд
            Date newTime = new Date();               //получаем новое текущее время

            long msDelay = newTime.getTime() - currentTime.getTime(); //вычисляем разницу
            System.out.println("Time distance is: " + msDelay + " in ms");*/

            /*Наступило ли уже некоторое время:
            Date startTime = new Date();

            long endTime = startTime.getTime() + 5000;   //    +5 секунд
            Date endDate = new Date(endTime);

            Thread.sleep(3000);              // ждем 3 секунды

            Date currentTime = new Date();
            if (currentTime.after(endDate))//проверяем что время currentTime после endDate
            {
                System.out.println("End time!");
            }*/



            /*Сколько прошло времени с начала сегодняшнего дня:
            Date currentTime = new Date();
            int hours = currentTime.getHours();
            int mins = currentTime.getMinutes();
            int secs = currentTime.getSeconds();

            System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);*/


            /*Сколько дней прошло с начала года:
            Date yearStartTime = new Date();
            yearStartTime.setHours(0);
            yearStartTime.setMinutes(0);
            yearStartTime.setSeconds(0);

            yearStartTime.setDate(1);      // первое число
            yearStartTime.setMonth(0);     // месяц январь, нумерация для месяцев 0-11

            Date currentTime = new Date();
            long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
            long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

            int dayCount = (int) (msTimeDistance/msDay); //количество целых дней
            System.out.println("Days from start of year: " + dayCount);*/




    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats)
    {
        //напишите тут ваш код
        HashMap<String, Cat> cotik = new HashMap<String, Cat>();


        for (int i = 0; i < cats.length; i++) // длинный вариант добавления в словарь
        {
            cotik.put(cats[i], new Cat(cats[i]));
        }

        /*for (String str : cats) // короткий вариант добавления в словарь
        {

            cotik.put(str, new Cat(str));
        }*/





        return cotik;
    }


    public static class Cat
    {
        String name;

        public Cat(String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
