package com.javarush.task.task06.task0614;

import java.util.ArrayList;
import java.util.List;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
//        cats.add(this);
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat();cats.add(cat1);
        Cat cat2 = new Cat();cats.add(cat2);
        Cat cat3 = new Cat();cats.add(cat3);
        Cat cat4 = new Cat();cats.add(cat4);
        Cat cat5 = new Cat();cats.add(cat5);
        Cat cat6 = new Cat();cats.add(cat6);
        Cat cat7 = new Cat();cats.add(cat7);
        Cat cat8 = new Cat();cats.add(cat8);
        Cat cat9 = new Cat();cats.add(cat9);
        Cat cat10 = new Cat();cats.add(cat10);

        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for (Cat cat: cats ) {
            System.out.println(cat);
        }
    }
}
