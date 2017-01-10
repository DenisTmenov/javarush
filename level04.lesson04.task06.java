package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда»,
«четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
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
        if (chi1 >= 1 & chi1 <= 7)
        {
            if (chi1 == 1)
                System.out.println("понедельник");
            if (chi1 == 2)
                System.out.println("вторник");
            if (chi1 == 3)
                System.out.println("среда");
            if (chi1 == 4)
                System.out.println("четверг");
            if (chi1 == 5)
                System.out.println("пятница");
            if (chi1 == 6)
                System.out.println("суббота");
            if (chi1 == 7)
                System.out.println("воскресенье");
        }
        if (chi1 < 1 | chi1 > 7)
            System.out.println("такого дня недели не существует");


    }

}