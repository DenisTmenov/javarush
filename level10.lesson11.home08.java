package com.javarush.test.level10.lesson11.home08;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        ArrayList<String>[] arrayOfStringList = new ArrayList[3];// массив

        ArrayList<String> list_1 = new ArrayList<>();
        list_1.add("qwe");
        list_1.add("asd");

        ArrayList<String> list_2 = new ArrayList<>();
        list_2.add("wer");
        list_2.add("sdf");

        ArrayList<String> list_3 = new ArrayList<>();
        list_3.add("rty");
        list_3.add("fgh");

        arrayOfStringList[0] = list_1;
        arrayOfStringList[1] = list_2;
        arrayOfStringList[2] = list_3;



        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}