package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human grandFather_1 = new Human();
        grandFather_1.name = "Ded";
        grandFather_1.sex = true;
        grandFather_1.age = 80;

        Human grandFather_2 = new Human();
        grandFather_2.name = "Ded_2";
        grandFather_2.sex = true;
        grandFather_2.age = 83;

        Human grandMother_1 = new Human();
        grandMother_1.name = "Babka_1";
        grandMother_1.sex = false;
        grandMother_1.age = 79;

        Human grandMother_2 = new Human();
        grandMother_2.name = "Babka_2";
        grandMother_2.sex = false;
        grandMother_2.age = 81;

        Human Mother = new Human();
        Mother.name = "Anna";
        Mother.sex = false;
        Mother.age = 34;
        Mother.father = grandFather_1;
        Mother.mother = grandMother_1;

        Human Father = new Human();
        Father.name = "Gena";
        Father.sex = true;
        Father.age = 37;
        Father.father = grandFather_2;
        Father.mother = grandMother_2;

        Human Child_1 = new Human();
        Child_1.name = "Bob";
        Child_1.sex = true;
        Child_1.age = 18;
        Child_1.father = Father;
        Child_1.mother = Mother;

        Human Child_2 = new Human();
        Child_2.name = "Djulia";
        Child_2.sex = false;
        Child_2.age = 14;
        Child_2.father = Father;
        Child_2.mother = Mother;

        Human Child_3 = new Human();
        Child_3.name = "Mikel";
        Child_3.sex = true;
        Child_3.age = 6;
        Child_3.father = Father;
        Child_3.mother = Mother;

        System.out.println(grandFather_1);
        System.out.println(grandFather_2);
        System.out.println(grandMother_1);
        System.out.println(grandMother_2);
        System.out.println(Mother);
        System.out.println(Father);
        System.out.println(Child_1);
        System.out.println(Child_2);
        System.out.println(Child_3);
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
