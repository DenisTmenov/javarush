package com.javarush.test.level03.lesson04.task05;

/* Сумма 10 чисел
Вывести на экран сумму чисел от 1 до 10 построчно (должно быть 10 строк):
1
1+2=3
1+2+3=6
1+2+3+4=10
...
Пример вывода:
1
3
6
10
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        a1 = 1;
        a2 = a1 + 2;
        a3 = a2 + 3;
        a4 = a3 + 4;
        a5 = a4 + 5;
        a6 = a5 + 6;
        a7 = a6 + 7;
        a8 = a7 + 8;
        a9 = a8 + 9;
        a10 = a9 + 10;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);
        System.out.println(a8);
        System.out.println(a9);
        System.out.println(a10);


    }
}
