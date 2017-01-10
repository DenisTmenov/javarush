package com.javarush.test.level04.lesson10.task03;

import java.io.*;
import java.util.Scanner;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        int a = scanner.nextInt();
        int num = 0;
        while (num < a)
        {
            System.out.println(name1);
            num++;
        }
    }
}
