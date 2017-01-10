package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
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

        spisok.remove(2);

        for (int i = 0; i < spisok.size(); i++)
        {
            System.out.println(spisok.get(spisok.size() - 1 - i));
        }

    }
}
