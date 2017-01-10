package com.javarush.test.level04.lesson06.task05;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        int age1 = scanner.nextInt();

        People nameP1 = new People();
        nameP1.name = name1;
        nameP1.age = age1;

        if (nameP1.age < 18)
            System.out.println("Подрасти еще");
    }

    public static class People
    {
        public String name;
        public int age;


    }
}
