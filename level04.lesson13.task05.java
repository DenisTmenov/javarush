package com.javarush.test.level04.lesson13.task05;

import java.io.*;
import java.util.Scanner;

/* Все любят Мамбу
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: [*имя* любит меня.]
Пример текста:
Света любит меня.
Света любит меня.
…
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        //int m = scanner.nextInt();
        //int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++)
            System.out.println(name1 + "  любит меня.");
    }
}