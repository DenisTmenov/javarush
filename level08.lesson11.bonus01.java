package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        String text = "";
        text += Character.toString(month.charAt(0)).toUpperCase();
        for (int i = 1; i < month.length(); i++)
        {
            text += Character.toString(month.charAt(i)).toLowerCase();
        }

        String upMonth = month.toUpperCase();
        //System.out.println(month);
        HashMap<String, Integer> slovarMonth = new HashMap<>();
        slovarMonth.put("JANUARY", 1);
        slovarMonth.put("FEBRUARY", 2);
        slovarMonth.put("MARCH", 3);
        slovarMonth.put("APRIL", 4);
        slovarMonth.put("MAY", 5);
        slovarMonth.put("JUNE", 6);
        slovarMonth.put("JULY", 7);
        slovarMonth.put("AUGUST", 8);
        slovarMonth.put("SEPTEMBER", 9);
        slovarMonth.put("OCTOBER", 10);
        slovarMonth.put("NOVEMBER", 11);
        slovarMonth.put("DECEMBER", 12);

        System.out.println(text + " is " + slovarMonth.get(upMonth) + " month" );




    }

}
