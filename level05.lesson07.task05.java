package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
 Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //напишите тут ваш код
    private int left = 0;
    private int top = 0;
    private int width = 0;
    private int height = 0;


    public void initialize(int left, int top, int width, int height)
    {
        int A = left;
        int B = top;
        int C = width;
        int D = height;
    }

    public void initialize(int left, int top)
    {
        int A = left;
        int B = top;
    }

    public void initialize(int left, int top, int width)
    {
        int A = left;
        int B = top;
        int C = width;
        int D = C;
    }

    public void initialize(Rectangle rect)
    {
        rect = this;
    }

}
