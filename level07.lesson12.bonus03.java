package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20]; //20
        for (int i = 0; i < 20; i++) // 20
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }

    }

    public static void sort(int[] array)
    {
        //напишите тут ваш код

        ArrayList<Integer> spisok = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++)
        {
            spisok.add(array[i]);
        }
        Collections.sort(spisok);
        Collections.reverse(spisok);

        for (int i = 0; i < array.length; i++)
        {
            array[i] = spisok.get(i);
        }

        /*for(int i = array.length - 1; i >= 2; i--)
        {
            boolean sorted = true;
            for (int j = 0; j < i; j++)//Напишите тут ваш код
                {
                    if (array[j] < array[j + 1])
                    {
                        int temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                        sorted = false;
                    }
                }
                if (sorted)
                    break;
        }*/
    }
}
