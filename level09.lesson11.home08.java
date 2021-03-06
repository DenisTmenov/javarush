package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        int[] massiv_5 = {5,5,5,5,5};
        int[] massiv_2 = {2,2};
        int[] massiv_4 = {4,4,4,4};
        int[] massiv_7 = {7,7,7,7,7,7,7};
        int[] massiv_0 = {};
        ArrayList<int[]> spisok = new ArrayList<>();
        spisok.add(massiv_5);
        spisok.add(massiv_2);
        spisok.add(massiv_4);
        spisok.add(massiv_7);
        spisok.add(massiv_0);

        return spisok;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
