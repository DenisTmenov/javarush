package com.javarush.test.level09.lesson11.bonus03;
// НЕ РЕШЕНА!!!!!!!!!!!!!!!
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        System.out.println();
        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //напишите тут ваш код
        ArrayList<Integer> chisla = new ArrayList<Integer>(); // список для чисел
        ArrayList<String> slova = new ArrayList<String>(); // список для слов
        ArrayList<Integer> nomer = new ArrayList<Integer>(); // список для учета порядка вызова ( 1 = число, 0 = слово)
        for (int i =0; i < array.length; i++){
            if (isNumber(array[i])) // если это число
            {
                chisla.add(Integer.parseInt(array[i])); // добавляем число в список chisla
                nomer.add(1);
            }
            else {
                slova.add(array[i]); // добавляем слово в список slova
                nomer.add(0);
            }
        }
        slova_Alfovit(slova); // сортируем слова
        MAXtoMIN(chisla); // сортируем числа


        int j = 0;
        int z = 0;
        for (int i =0; i < nomer.size() ; i++)
        {
            if (nomer.get(i).equals(0) & j < slova.size()) // если первым вводилось слово
            {
                array[i] = slova.get(j);
                j++;
            }
            if (nomer.get(i).equals(1) & z < chisla.size()) // если первым вводилось число
            {
                array[i] = Integer.toString(chisla.get(z)); // !!!!!!!!!!!!! возникает ошибка
                z++;
            }
        }

        /*System.out.println("aaaaaa");
        for (String x : array)
        {
            System.out.println(x);
        }
        System.out.println("aaaaa");*/
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }

    public static void slova_Alfovit (ArrayList<String> slova) // сортировка для слов в алфовитном порядке
    {
        String min;
        //System.out.println("Зашли в метод slova_Alfovit"); //!!!!!!!!!!!!!!!!!!11
        for(int j = 0; j < slova.size(); j++)
        {
            int n1 = j;
            min = slova.get(j);
            for (int i = 0 + j; i < slova.size(); i++)
            {
                if (isGreaterThan(min, slova.get(i)))
                {
                    min = slova.get(i); // значение минимальной строки
                    n1 = i; // номер минимальной строки в массиве
                }
            }
            String n = slova.get(j);
            slova.set(j, min);
            slova.set(n1, n);
        }


        /*for (String x : slova)
        {
            System.out.println(x);
        }*/
    }

    public static void MAXtoMIN (ArrayList<Integer> chisla) // сортировка для чисел по убыванию
    {
        int max;

        for(int j = 0; j < chisla.size(); j++)
        {
            int n1 = j;
            max = chisla.get(j);
            for(int i = 0 + j; i < chisla.size(); i++)
            {
                if(chisla.get(i) > max)
                {
                    max = chisla.get(i); // значение максимального числа
                    n1 = i; // номер максимального числа в массиве
                }
            }
            int n = chisla.get(j);
            chisla.set(j, max);
            chisla.set(n1, n);
        }

        /*for (Integer x : chisla)
        {
            System.out.println(x);
        }*/
    }
}
