package com.javarush.test.level07.lesson04.task04;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        int[] masInt = new int[10]; // массив чисел

        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < masInt.length; i++) // заполнение массива числами введенными с клавиатуры
        {
            masInt[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < masInt.length / 2; i++) // обратный порядок в массиве
        {
            int a = masInt[i];
            int b = masInt[9 - i];
            masInt[i] = b;
            masInt[9 - i] = a;

        }


        for (int i = 0; i < masInt.length; i++) // вывод на экран
        {
            System.out.println(masInt[i]);
        }
    }
}
