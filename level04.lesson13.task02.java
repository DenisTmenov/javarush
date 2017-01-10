package com.javarush.test.level04.lesson13.task02;

import java.io.*;
import java.util.Scanner;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
//        String name1 = scanner.nextLine();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 1; i <= m; i++ )
        {
            for (String str = "8"; str.length() <= n; str = str +"8")
            {

                if (str.length() == n)
                {
                    System.out.println(str);

                }

            }
        }



    }
}
