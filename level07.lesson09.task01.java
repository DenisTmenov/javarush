package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран.
Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        ArrayList<Integer> spisok = new ArrayList<Integer>(); // создали список
        ArrayList<Integer> spisok_D_3 = new ArrayList<Integer>(); // создали список
        ArrayList<Integer> spisok_D_2 = new ArrayList<Integer>(); // создали список
        ArrayList<Integer> spisok_D_ALL = new ArrayList<Integer>(); // создали список

        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) // заполнение списка строками введенными с клавиатуры (5шт.)
        {
            int B = Integer.parseInt(reader.readLine());
            spisok.add(B); // в КОНЕЦ

            if (B % 3 == 0) // если делится на 3, добавляем в список spisok_D_3
            {
                spisok_D_3.add(B);
            }

            if (B % 2 == 0) // если делится на 2, добавляем в список spisok_D_2
            {
                spisok_D_2.add(B);
            }

            if (B % 3 != 0 && B % 2 != 0) // если не делится на 3 и на 2, добавляем в список spisok_D_ALL
            {
                spisok_D_ALL.add(B);
            }
        }

        printList(spisok_D_3);
        printList(spisok_D_2);
        printList(spisok_D_ALL);


    }

    public static void printList(List<Integer> list)
    {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
