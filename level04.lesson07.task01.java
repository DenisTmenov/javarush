package com.javarush.test.level04.lesson07.task01;

/* Строка - описание
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» - если число отрицательное и четное,
«отрицательное нечетное число» - если число отрицательное и нечетное,
«нулевое число» - если число равно 0,
«положительное четное число» - если число положительное и четное,
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
//        String name1 = scanner.nextLine();
        int a = scanner.nextInt();

        double ch1 = 2.0000;

        if ((a < 0) && (a / 2 == a / ch1))
            System.out.println("отрицательное четное число");
        if ((a < 0) && (a / 2 != a / ch1))
            System.out.println("отрицательное нечетное число");
        if (a == 0)
            System.out.println("нулевое число");
        if ((a > 0) && (a / 2 == a / ch1))
            System.out.println("положительное четное число");
        if ((a > 0) && (a / 2 != a / ch1))
            System.out.println("положительное нечетное число");

    }
}