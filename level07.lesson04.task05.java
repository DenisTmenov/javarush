package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        int[] masInt = new int[20]; // массив чисел

        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < masInt.length; i++) // заполнение массива числами введенными с клавиатуры
        {
            masInt[i] = Integer.parseInt(reader.readLine());
        }

        int[] masIntLittle_1 = new int[10]; // массив чисел
        int[] masIntLittle_2 = new int[10]; // массив чисел

        for (int i = 0; i < masInt.length / 2; i++) // заполнение массива числами введенными с клавиатуры
        {
            masIntLittle_1[i] = masInt[i];
            masIntLittle_2[i] = masInt[10 + i];
        }

        for (int i = 0; i < masIntLittle_2.length; i++) // вывод на экран
        {
            System.out.println(masIntLittle_2[i]);
        }

    }
}
