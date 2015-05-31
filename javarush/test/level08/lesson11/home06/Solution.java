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

        Human dete1=new Human("Rebenok1", true, 10);
        Human dete2=new Human("Rebenok2", true, 15);
        Human dete3=new Human("Rebenok4", false, 19);
        Human parent1=new Human("Masha", false, 35);
        Human parent2=new Human("Oleg", true, 40);
        parent1.children.add(dete1);
        parent1.children.add(dete2);
        parent1.children.add(dete3);
        parent2.children.add(dete1);
        parent2.children.add(dete2);
        parent2.children.add(dete3);
        Human grandy1=new Human("Ded1", true, 66);
        Human grandy2=new Human("Ded2", true, 67);
        grandy1.children.add(parent1);
        grandy2.children.add(parent2);
        Human babushka1=new Human("Galina", true, 65);
        Human babushka2=new Human("Galina2", false, 65);
        babushka1.children.add(parent1);
        babushka2.children.add(parent2);

        System.out.println(grandy1+"\n"+grandy2+"\n"+babushka1+"\n"+ babushka2+"\n"+ parent1+"\n"+ parent2+"\n"+ dete1+"\n"+ dete2+"\n"+ dete3);
    }

    public static class Human
    {
        public String name;
        public Boolean sex;
        public int age;
        public ArrayList<Human> children=new ArrayList<Human>();

        public Human(String name, Boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, Boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
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
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
