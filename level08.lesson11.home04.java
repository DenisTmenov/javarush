package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум
        int Min = array.get(0);
        for (Integer chislo : array)
        {
            if (chislo < Min)
            {
                Min = chislo;
            }
        }
        return Min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        //Тут создать и заполнить список

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine()); // число вводимых чисел
        List<Integer> list = new ArrayList<Integer>();
        for (int n = 0; n < N; n++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }
}