package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.

Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
public static void main(String[] args) throws IOException
{
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

String dadName = reader.readLine();
Cat catDad = new Cat(dadName, null, null);

String babName = reader.readLine();
Cat catBab = new Cat(babName, null, null);

String PapName = reader.readLine();
Cat catPap = new Cat(PapName, catDad, null );

String motherName = reader.readLine();
Cat catMam = new Cat(motherName, null, catBab);

String sonName = reader.readLine();
Cat catSon = new Cat(sonName, catPap, catMam);

String daughterName = reader.readLine();
Cat catDaughter = new Cat(daughterName, catPap, catMam);

System.out.println(catDad);
System.out.println(catBab);
System.out.println(catPap);
System.out.println(catMam);
System.out.println(catSon);
System.out.print(catDaughter);

}

public static class Cat
{

private String name;
private Cat mother;
private Cat father;

Cat(String name)
{
this.name = name;
}

    public Cat(String name, Cat father, Cat mother)
{
this.name = name;
this.father = father;
this.mother = mother;
}




@Override
public String toString()
{
if (mother == null&& father==null)
{ return "Cat name is " + name + ", no mother" + ", no father";}

if (father==null||mother==null)
if (father==null)
return "Cat name is " + name + ", mother is " + mother.name + ", no father";
else
return "Cat name is " + name + ", no mother, father is " + father.name;
else return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
}
}

}