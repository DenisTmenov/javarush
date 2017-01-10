package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int N = Integer.parseInt(reader.readLine()); //число строк для ввода
        int M = Integer.parseInt(reader.readLine()); //

        ArrayList<String> spisok = new ArrayList<String>();

        for (int i = 0; i < N; i++) // вводим и заносим строки в список
        {
            spisok.add(reader.readLine());
        }

        for (int i = 0; i < M; i++)
        {
            spisok.add(spisok.get(0)); // переставляем первую строку в конец списка
            spisok.remove(0); //удаляем первую строку
        }

        for (int i = 0; i < spisok.size(); i++)
        {
            System.out.println(spisok.get(i));
        }



    }
}
