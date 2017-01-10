package com.javarush.test.level04.lesson16.home03;

import java.io.*;
import java.util.Scanner;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String num = null;
        int sum = 0;
        while (true)
        {
            num = scanner.nextLine();
            int chislo = 0;
            if (num.equals("-1") )
            {
                break;
            }
            else
            {
                chislo = Integer.parseInt(num);
                sum = sum + chislo;
            }
        }
        sum = sum -1;
        System.out.println(sum);
    }
}
