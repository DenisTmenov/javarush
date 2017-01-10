package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
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
        int chi1 = scanner.nextInt();
        if (chi1 >= 0)
            System.out.println(chi1 * 2);
        if (chi1 < 0)
            System.out.println(chi1 + 1);



    }

}