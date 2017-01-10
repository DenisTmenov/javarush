package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
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
            spisok.add(reader.readLine());
        }

        int maxSize = 0; // нахождение самой длинной строки в списке
        for (int i = 0; i < spisok.size(); i++)
        {
           if (maxSize < spisok.get(i).length())
           {
               maxSize = spisok.get(i).length();
           }
        }

        ArrayList<String> spisokMAX = new ArrayList<String>(); // внесение самой длинной строки в новый список
        for (int i = 0; i < spisok.size(); i++)
        {
            if (maxSize == spisok.get(i).length())
            {
                spisokMAX.add(spisok.get(i));
            }
        }

        for (int i = 0; i < spisokMAX.size(); i++) // вывод на экран
        {
            System.out.println(spisokMAX.get(i));
        }
    }
}
