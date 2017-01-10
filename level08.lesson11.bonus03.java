package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[3]; // 20!!!!!!!!!!!!
        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //напишите тут ваш код
        /*String max;
        int n1 = 0;

        for(int j = 0; j < array.length; j++)
        {
            max = array[j];
            for(int i = 0 + j; i < array.length; i++)
            {
                if(isGreaterThan(array[i], max))
                {
                    max = array[i]; // значение максимальной строки
                    n1 = i; // номер максимальной строки в массиве
                }
            }
            String n = array[j];
            array[j] = max;
            array[n1] = n;
        }*/

        String min;

        for(int j = 0; j < array.length; j++)
        {
            int n1 = j;
            min = array[j];
            for (int i = 0 + j; i < array.length; i++)
            {
                if (isGreaterThan(min, array[i]))
                {
                    min = array[i]; // значение минимальной строки
                    n1 = i; // номер минимальной строки в массиве
                }
            }
            String n = array[j];
            array[j] = min;
            array[n1] = n;
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}
