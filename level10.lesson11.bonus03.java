package com.javarush.test.level10.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: ввести с клавиатуры 30 чисел. Вывести 10-е и 11-е минимальные числа.
Пояснение:
Самое минимальное число – 1-е минимальное.
Следующее минимальное после него – 2-е минимальное
Пример:
1 6 5  7  1  15   63   88
Первое минимальное – 1
Второе минимальное – 1
Третье минимальное – 5
Четвертое минимальное – 6
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array)
    {
        //напишите тут ваш код
        int min;

        for(int j = 0; j < array.length; j++)
        {
            int n1 = j;
            min = array[j];
            for(int i = 0 + j; i < array.length; i++)
            {
                if(array[i] < min)
                {
                    min = array[i]; // значение максимального числа
                    n1 = i; // номер максимального числа в массиве
                }
            }
            int n = array[j];
            array[j] =  min;
            array[n1] = n;
        }

    }
}
