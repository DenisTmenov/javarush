package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        public String FirstName;
        public String LastName;
        public int age;
        public boolean sex;
        public int height;
        public int weight;

        public Human(String firstName)
        {
        FirstName = firstName;
        }

        public Human(String firstName, String lastName)
        {
            FirstName = firstName;
            LastName = lastName;
        }

        public Human(String firstName, String lastName, int age)
        {
            FirstName = firstName;
            LastName = lastName;
            this.age = age;
        }

        public Human(String firstName, String lastName, int age, boolean sex)
        {
            FirstName = firstName;
            LastName = lastName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String firstName, String lastName, int age, boolean sex, int height)
        {
            FirstName = firstName;
            LastName = lastName;
            this.age = age;
            this.sex = sex;
            this.height = height;
        }

        public Human(String firstName, String lastName, int age, boolean sex, int height, int weight)
        {
            FirstName = firstName;
            LastName = lastName;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        public Human(String firstName, int age, boolean sex, int height)
        {
            FirstName = firstName;
            this.age = age;
            this.sex = sex;
            this.height = height;
        }

        public Human(String firstName, int age)
        {
            FirstName = firstName;
            this.age = age;
        }

        public Human(String firstName, int age, boolean sex, int height, int weight)
        {
            FirstName = firstName;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        public Human(String firstName, String lastName, boolean sex)
        {
            FirstName = firstName;
            LastName = lastName;
            this.sex = sex;
        }
    }
}
