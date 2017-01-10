package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.Scanner;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        //String name1 = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min = b;
        int max = a;
        int sr = 0;

        if (a <= b)
            max = b;

        if (max <= c)
            max = c;

        if (a <= b)
            min = a;

        if (min >= c)
            min = c;


        if (max == a)
        {
            if (min == b)
                sr = c;
            if (min == c)
                sr = b;
        }

        if (max == b)
        {
            if (min == a)
                sr = c;
            if (min == c)
                sr = b;
        }

        if (max == c)
        {
            if (min == a)
                sr = b;
            if (min == b)
                sr = a;
        }


        System.out.println(sr);

    }
}