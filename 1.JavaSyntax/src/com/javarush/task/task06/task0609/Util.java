package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double q = 0.0;
        q = Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
        return q;
    }

    public static void main(String[] args) {

    }
}
