package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        ArrayList<Character> glasn = new ArrayList<Character>();
        ArrayList<Character> soglasn = new ArrayList<Character>();

        /*for (int i = 0; i < text.length(); i++){
            char A = text.charAt(i);
            String B = " ";
            if (isVowel(A) ){
                glasn.add(A);
            }
            if (  A == B  ){
                soglasn.add(A);
            }

        }*/
       char[] AAA = text.toCharArray(); //перевод строки в массив символов
        for (int i = 0; i < AAA.length; i++){
            //если символ - "пробел"
            if (AAA[i] == ' '){}
            else {
                // если символ гласный
                if (isVowel(AAA[i])){
                    glasn.add(AAA[i]);
                }
                // если символ согласный
                else {
                    soglasn.add(AAA[i]);
                }
            }
        }

        for (char bukva : glasn){
        System.out.print(bukva + " ");
        }
        System.out.println();
        for (char bukva : soglasn){
            System.out.print(bukva + " ");
        }
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }


}
