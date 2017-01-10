package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //напишите тут ваш код
   // private String name1 = null;
    //private int age = 0;
    //private String sex = null;


    public void initialize(String name)
    {
        String A = name;
    }

    public void  initialize(String name, int age)
    {
        String B = name + age;
    }

    public void  initialize(String name, int age, String sex)
    {
        String C = name + age + sex;
    }

}
