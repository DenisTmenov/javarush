package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        for (String i = "8"; i.length() < 10; i = i + "8")
            System.out.print("8");
        for (String i = "8"; i.length() <= 11; i = i + "8")
            System.out.println("8");


    }
}
