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
        public int age, height, weight;
        String name, job;
        Boolean sex;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, Boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, Boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(int age, int height, String name, Boolean sex) {
            this.age = age;
            this.height = height;
            this.name = name;
            this.sex = sex;
        }

        public Human(int age, int height, int weight, String name, Boolean sex) {
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.name = name;
            this.sex = sex;
        }

        public Human(int age, int height, int weight, String name, String job, Boolean sex) {
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.name = name;
            this.job = job;
            this.sex = sex;
        }

        public Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Human(String name, int age, int height, int weight) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(Boolean sex, int weight, int height, int age) {
            this.sex = sex;
            this.weight = weight;
            this.height = height;
            this.age = age;
        }

        public Human(String name, String job) {
            this.name = name;
            this.job = job;
        }
    }
}
