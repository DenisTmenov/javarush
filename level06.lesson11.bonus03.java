package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{


    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int ch1 = Integer.parseInt(reader.readLine());
        int ch2 = Integer.parseInt(reader.readLine());
        int ch3 = Integer.parseInt(reader.readLine());
        int ch4 = Integer.parseInt(reader.readLine());
        int ch5 = Integer.parseInt(reader.readLine());

        ArrayList<Integer> spisok_chisel = new ArrayList<>(); // список из строк
        spisok_chisel.add(ch1); // добавляем число в список
        spisok_chisel.add(ch2); // добавляем число в список
        spisok_chisel.add(ch3); // добавляем число в список
        spisok_chisel.add(ch4); // добавляем число в список
        spisok_chisel.add(ch5); // добавляем число в список

        //System.out.println(spisok_chisel);

        Collections.sort(spisok_chisel);// сортировка списка

        //System.out.println(spisok_chisel);
        for (int i = 0; i < spisok_chisel.size(); i++)
        {
            System.out.println(spisok_chisel.get(i));
        }






    }

}
