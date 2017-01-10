package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        int N = Integer.parseInt(reader.readLine()); // число вводимых чисел
        int maximum = 0;
        int a = Integer.parseInt(reader.readLine());
        for (int n = 1; n < N; n++)
        {
            int b = Integer.parseInt(reader.readLine());
            a = max(a, b);
        }
        maximum = a;
        System.out.println(maximum);
    }

    public static int max(int a, int b)
    {
        return a > b ? a : b;
    }
}
