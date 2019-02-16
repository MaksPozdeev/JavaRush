package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Scanner scan = new Scanner(System.in);
        double min = scan.nextDouble();
        if ((min % 5 >= 0) && (min % 5 < 3)) System.out.println("зелёный");// [0..3)
        if ((min % 5 >= 3) && (min % 5 < 4)) System.out.println("жёлтый"); //[3..4)
        if ((min % 5 >= 4) && (min % 5 < 5)) System.out.println("красный");//[4..5)

    }
}