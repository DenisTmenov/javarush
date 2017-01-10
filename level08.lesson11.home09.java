package com.javarush.test.level08.lesson11.home09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("JANUARY 4 2015"));
    }

    public static boolean isDateOdd(String date)
    {

        Date aaa = new Date(date);
        //long today = new Date(date).getTime();

        int year = 1900 + aaa.getYear();
        String date1 = "JANUARY 1 " + year;
        Date firstDate = new Date(date1);
        long time = aaa.getTime() - firstDate.getTime();
        long msDay = 24 * 60 * 60 * 1000; //сколько миллисекунд в одних сутках
        int dayCount = (int)(time / msDay); //количество целых дней

        //System.out.println(dayCount);

        return (dayCount % 2 == 0);
    }
}
