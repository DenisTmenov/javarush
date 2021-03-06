package com.javarush.test.level07.lesson04.task01;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

/* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        //Инициализируйте (создайте и заполните) массив тут
        int[] massiv = new int[20]; // массив из 20 элементов

        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < massiv.length; i++) // заполнение массива числами введенными с клавиатуры
        {
            massiv[i] = Integer.parseInt(reader.readLine());
        }
        return massiv;
    }

    public static int max(int[] array) {
        //Найдите максимальное значение в этом методе
        int maximum = array[0];
        for (int i = 0; i < array.length; i++)
            if (maximum < array[i])
            {
                maximum = array[i];
            }

        return maximum;
    }
}
