package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        Set<Integer> mn_Chisel = new HashSet<Integer>();
        for (int i = 0; i < 20; i++)
        {
            mn_Chisel.add(8 + i);
        }

        return (HashSet<Integer>) mn_Chisel;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        Iterator<Integer> iterator = set.iterator(); //получение итератора для списка

        while (iterator.hasNext())      //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            Integer chislo = iterator.next();
            if (chislo > 10)
            {
                iterator.remove();
            }


        }

        return set;
    }


   /* public static void main(String[] args)
    {
        System.out.println(createSet());
        System.out.println(removeAllNumbersMoreThan10(createSet()));

    }*/


}
