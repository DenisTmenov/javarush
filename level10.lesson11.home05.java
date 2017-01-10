package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) //10!!!!!!!!!!!!!!
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        //напишите тут ваш код
        HashMap<Character, Integer> bukvi_Map = new HashMap<>(); // словарь для подсчета количества букв
        for (char bukva : alphabet)
        {
            bukvi_Map.put(bukva, 0);
        }

        for (String stroka : list)
        {
            // перевод строки в символы + занесли в список
            char[] simvoli = stroka.toCharArray();
            ArrayList<Character> bukvi_v_stroke = new ArrayList<>();
            for (int i = 0; i < stroka.length(); i++)
            {
                bukvi_v_stroke.add(simvoli[i]);
            }

            for (Character abcd : bukvi_v_stroke)
            {
                for (Map.Entry<Character, Integer> pair : bukvi_Map.entrySet())
                {
                    Character key = pair.getKey();                      //ключ
                    Integer value = pair.getValue();                  //значение

                    if (abcd.equals(key))
                    {
                        bukvi_Map.put(abcd, (bukvi_Map.get(abcd) + 1)); // подсчет символов
                    }
                }
            }
        }

        /*for (Map.Entry<Character, Integer> pair : bukvi_Map.entrySet())
        {
            Character key = pair.getKey();                      //ключ
            Integer value = pair.getValue();                  //значение
            System.out.println(key + " " + value);

        }*/
        for (Character www : alphabet){
            Integer value = bukvi_Map.get(www);
            System.out.println(www + " " + value);
        }

    }
}
