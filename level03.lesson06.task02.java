package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {

        int a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 = 9, a10 = 10;

        System.out.println(umnojenie(1));
        System.out.println(umnojenie(2));
        System.out.println(umnojenie(3));
        System.out.println(umnojenie(4));
        System.out.println(umnojenie(5));
        System.out.println(umnojenie(6));
        System.out.println(umnojenie(7));
        System.out.println(umnojenie(8));
        System.out.println(umnojenie(9));
        System.out.println(umnojenie(10));


    }

    public static String umnojenie(int a)
    {
        int a1 = a * 1;
        int a2 = a * 2;
        int a3 = a * 3;
        int a4 = a * 4;
        int a5 = a * 5;
        int a6 = a * 6;
        int a7 = a * 7;
        int a8 = a * 8;
        int a9 = a * 9;
        int a10 = a * 10;
        String b = a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " + a6 + " " + a7 + " " + a8 + " " + a9 + " " + a10;
        return b;
    }
}
