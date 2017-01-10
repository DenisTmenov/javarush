package com.javarush.test.level04.lesson04.task08;

/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        //String name = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < 0)
            a = a * -1;
        if (b < 0)
            b = b * -1;
        if (c < 0)
            c = c * -1;

        /*if ( ((a + b) < c) || ((a + c) < b )|| ((b + c) < a) )
            System.out.println("Треугольник не существует.");
        else
            System.out.println("Треугольник существует.");*/
        if ((a + b) > c)
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
    }
}