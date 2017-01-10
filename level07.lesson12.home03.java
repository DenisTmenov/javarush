package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum;
        int  minimum;

        //напишите тут ваш код

        int[] massiv = new int[20];

        for (int i = 0; i < 20; i++) // добавление чисел в массив
        {
            massiv[i] = Integer.parseInt(reader.readLine());
        }

        maximum = massiv[0];
        minimum = massiv[0];

        for (int i = 0; i < massiv.length; i++) // нахождение максимума и минимума
        {
            if (maximum < massiv[i])
            {
                maximum = massiv[i];
            }
            if (minimum > massiv[i])
            {
                minimum = massiv[i];
            }
        }

        System.out.print(maximum + " ");
        System.out.println(minimum);
    }
}
