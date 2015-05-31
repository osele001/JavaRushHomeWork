package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1=new Man("Mike", 21, "Mikkeli");
        Woman woman1=new Woman("Stefani", 20, "Pietari");


        sout(man1);
        sout(woman1);
    }

    public static class Man{
        public String name, address;
        public int age;

        public Man(String name, int age, String address){
            this.name=name;
            this.address=address;
            this.age=age;
        }
    }
    public static class Woman{
        public String name, address;
        public int age;

        public Woman(String name, int age, String address){
            this.name=name;
            this.address=address;
            this.age=age;
        }
    }

    public static void sout(Woman x){
        System.out.println(x.name+" "+x.age+" "+x.address);
    }
    public static void sout(Man x){
        System.out.println(x.name+" "+x.age+" "+x.address);
    }
}
