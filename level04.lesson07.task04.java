package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int countP = 0;
        int countM = 0;

        if (a >= 0)
            countP++;
        if (b >= 0)
            countP++;
        if (c >= 0)
            countP++;

        if (a < 0)
            countM++;
        if (b < 0)
            countM++;
        if (c < 0)
            countM++;

        System.out.println("количество отрицательных чисел: " + countM);
        System.out.println("количество положительных чисел: " + countP);

    }
}
