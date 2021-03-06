package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    public String name, color, address;
    public int weight, age;

    public void initialize(String name){
        this.name=name;
        this.weight=10;
        this.age=5;
        this.address=null;
    }
    public void initialize(String name, int weight, int age){
        this.name=name;
        this.weight=weight;
        this.age=age;
        this.address=null;
    }
    public void initialize(int weight,String color){
        this.weight=weight;
        this.color=color;
        this.name=null;
        this.address=null;
        this.age=5;
    }
    public void initialize(String name, int age){
        this.weight=10;

        this.name=name;
        this.address=null;
        this.age=age;
    }
    public void initialize(int weight, String color, String address){
        this.weight=weight;
        this.color=color;
        this.name=null;
        this.address=address;
        this.age=5;
    }
}
