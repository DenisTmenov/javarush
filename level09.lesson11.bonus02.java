package com.javarush.test.level09.lesson11.bonus02;

import java.io.*;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то
программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли, а уже потом считывать файл для записи.
*/



public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();

        if (!(new File(sourceFileName).exists())) // exists существует ли реально файл
        {
            System.out.println("Файл не существует.");
            sourceFileName = reader.readLine();
        }

        String destinationFileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);


        while (fileInputStream.available() > 0)
        {

            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}



// вариант рабочий, но не проходит тестирование
/*public class Solution
{
    public static FileInputStream fileName() throws IOException
{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try
    {
        String sourceFileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);
        return fileInputStream;
    }
    catch (IOException e)
    {
        System.out.println("Файл не существует.");
        //FileInputStream fileInputStream = fileName(); // так будет вводиться путь к файлу пока он не станет действительным
        String sourceFileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);
        return fileInputStream;
    }
}
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = fileName();


        String destinationFileName = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }


}*/