package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> Family = new ArrayList<Human>(); // создал список семья
        ArrayList<Human> List_Father = new ArrayList<Human>(); // создал список для отца !!!!!!!!!!!! нужно улучшить
        ArrayList<Human> List_Mother = new ArrayList<Human>(); // создал список для матери !!!!!!!!!!!! нужно улучшить
        ArrayList<Human> Children = new ArrayList<Human>(); // создал список дети

        Human child_1 = new Human("Vova", true, 6, new ArrayList<Human>());
        Human child_2 = new Human("Petr", true, 8, new ArrayList<Human>());
        Human child_3 = new Human("Lola", false, 4, new ArrayList<Human>());

        Children.add(child_1);
        Children.add(child_2);
        Children.add(child_3);

        Human Father = new Human("Nikolai", true, 38, Children);
        Human Mother = new Human("Anna", false, 36, Children);

        List_Father.add(Father);
        List_Mother.add(Mother);

        Human GrFather_1 = new Human("Adolf", true, 80, List_Father);
        Human GrFather_2 = new Human("Rudik", true, 78, List_Mother);

        Human GrMother_1 = new Human("Lilia", false, 76, List_Father);
        Human GrMother_2 = new Human("Adolf", false, 75, List_Mother);

        Family.add(child_1);
        Family.add(child_2);
        Family.add(child_3);
        Family.add(Father);
        Family.add(Mother);
        Family.add(GrFather_1);
        Family.add(GrFather_2);
        Family.add(GrMother_1);
        Family.add(GrMother_2);


        for (Human chelovek : Family)
        {
            System.out.println(chelovek.toString());
        }
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, ArrayList<Human> human)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            if (human != null)
            {
                this.children = human;
            }
            else
            {
                this.children = new ArrayList<Human>();
            }
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }


            return text;
        }
    }

}
