package com.javarush.task.task04.task0435;

/* 
Четные числа
*/

import java.util.Timer;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

//        long stopTime = System.currentTimeMillis();
//        System.out.println("Time: " + (stopTime-startTime));
    }
}
