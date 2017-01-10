package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        String[] masString = new String[10]; // массив строк
        int[] masInt = new int[10]; // массив чисел

        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < masString.length; i++) // заполнение массива строками введенными с клавиатуры
        {
            masString[i] = reader.readLine();
        }

        for (int i = 0; i < masInt.length; i++) // заполнение массива числом (длинна строки из массива строк)
        {
            masInt[i] = masString[i].length();
        }

        for (int i = 0; i < masInt.length; i++) // вывод на экран
        {
            System.out.println(masInt[i]);
        }

    }
}
