package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date data =new Date(reader.readLine());

        SimpleDateFormat time = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(time.format(data).toUpperCase());

        /*String day_S = "", mounth_S = "", year_S = ""; // переменные для строк
        // добавляем два первых символа в строку day_S
        for (int i = 0; i < 2; i++){
            day_S += Character.toString(data.charAt(i));
        }
        // добавляем два символа в строку mounth_S
        for (int i = 3; i < 5; i++){
            mounth_S += Character.toString(data.charAt(i));
        }
        // добавляем два символа в строку year_S
        for (int i = 6; i < 10; i++){
            year_S += Character.toString(data.charAt(i));
        }

        int day, mounth, year; // переменные для чисел
        // перевод строк в числа
        day = Integer.parseInt(day_S);
        mounth = Integer.parseInt(mounth_S);
        year = Integer.parseInt(year_S);

        Date Time = new Date(); // создаем объект типа Data
        Time.setDate(day);      // берем день равный day
        Time.setMonth(mounth - 1); // берем месяц равный mounth
        Time.setYear(year - 1900); // берем год равный year
        // паттерн для вывода даты
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        // изменяем data по шаблону (паттерну)
        data = dateFormat.format(Time).toString();

        String big_data = ""; // строка для перевода названия месяца в заглавные буквы
        for (int i = 0; i < data.length(); i++){
            if (i < 3){
                big_data += Character.toString(data.charAt(i)).toUpperCase();
            }
            else {
                big_data += Character.toString(data.charAt(i));
            }
        }
        System.out.println(big_data);*/

    }
}
