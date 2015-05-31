package com.javarush.test.level05.lesson05.task02;

public class Cat
{
    /*public static void main(String[] args)
    {
        Cat cat1=new Cat("Vasya",5,3,5);
        Cat cat2=new Cat("Masha",4,3,10);
        System.out.println(cat1.fight(cat2));
    }*/
    public String name;
    public int age;
    public int weight;
    public int strength;


    public Cat(/*String name, int age, int weight, int strength*/)
    {
        /*this.name=name;
        this.age=age;
        this.weight=weight;
        this.strength=strength;*/
    }

    public boolean fight (Cat anotherCat)
    {
        double stat=0;
        if(this.age<anotherCat.age)
            stat++;
        stat=stat+(this.strength-anotherCat.strength);
        stat=stat+(this.weight-anotherCat.weight)*0.3;
        if(stat>0)
            return true;
        else
            return false;

    }

}




