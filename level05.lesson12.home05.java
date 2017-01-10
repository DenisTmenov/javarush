package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма».
Вывести на экран полученную сумму.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String num = null;
        int sum = 0;
        while (true)
        {
            num = scanner.nextLine();
            int chislo = 0;
            if (num.equals("сумма") )
            {
                break;
            }
            else
                {
                chislo = Integer.parseInt(num);
                sum = sum + chislo;
                }
        }
        System.out.println(sum);
    }
}
