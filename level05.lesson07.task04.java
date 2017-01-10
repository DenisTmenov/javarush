package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //напишите тут ваш код
    public void initialize(int centerX, int centerY, double radius)
    {
        double A = centerX + centerY + radius;
    }

    public void initialize(int centerX, int centerY, double radius, int width)
    {
        double B = centerX + centerY + radius + width;
    }

    public void initialize(int centerX, int centerY, double radius, int width, String color)
    {
        String C = centerX + centerY + radius + width + color;
    }


}
