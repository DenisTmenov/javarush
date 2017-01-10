package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    public void initialize(String name)
    {
        String A = name;
    }

    public void  initialize(String name, int height)
    {
        String B = name + height;
    }

    public void  initialize(String name, int height, String color)
    {
        String C = name + height + color;
    }

}
