package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        boolean q;
        if (this.strength * this.weight / this.age > anotherCat.strength * anotherCat.weight / anotherCat.age) q = true;
        else q = false;
        return q;
    }

    public static void main(String[] args) {

    }
}
