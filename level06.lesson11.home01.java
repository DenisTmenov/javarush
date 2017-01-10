package com.javarush.test.level06.lesson11.home01;

/* Класс Cat и статическая переменная catCount
В классе Cat создай статическую переменную public int catCount.
Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat) статическая переменная
catCount увеличивается на 1. Создать 10 объектов Cat и вывести значение переменной catCount на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Cоздай тут 10 объектов Cat
        /*Cat cat01 = new Cat();
        Cat cat02 = new Cat();
        Cat cat03 = new Cat();
        Cat cat04 = new Cat();
        Cat cat05 = new Cat();
        Cat cat06 = new Cat();
        Cat cat07 = new Cat();
        Cat cat08 = new Cat();
        Cat cat09 = new Cat();
        Cat cat10 = new Cat();*/

        Cat[] cat = new Cat[10];  // сокращенный метод создания объектов
        for (int i = 0; i <10; i++)
        {
            cat[i] = new Cat();
        }

        //Выведи тут на экран catCount

        System.out.println(Cat.catCount);
        System.out.println(cat);
    }

    public static class Cat
    {
        //Cоздай тут статическую переменную
        static int catCount;

        //Создай тут конструктор
        Cat()
        {
            Cat.catCount++;   //увеличиваем значение статический переменной на 1
        }

    }

}
