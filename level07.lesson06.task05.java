package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        ArrayList<String> spisok = new ArrayList<String>(); // создали список

        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) // заполнение списка строками введенными с клавиатуры (5шт.)
        {
            spisok.add(reader.readLine()); // в КОНЕЦ
        }

        String A = null;
        for (int i = 0; i < 13; i++)
        {
            A = spisok.get(4);
            spisok.remove(4);
            spisok.add(0,A);
        }



        for (int i = 0; i < spisok.size(); i++) // вывод на экран
        {
            System.out.println(spisok.get(i));
        }

    }
}
