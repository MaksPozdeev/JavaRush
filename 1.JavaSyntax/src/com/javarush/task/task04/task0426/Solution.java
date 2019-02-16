package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        boolean polozh = true;
        boolean chetn = true;

        if (age == 0){
            System.out.println("ноль");
            return;
        }

        if (age < 0) polozh = false;
        if (age % 2 != 0) chetn = false;

        if (polozh && chetn)
            System.out.println("положительное четное число");
        if (polozh && !chetn)
            System.out.println("положительное нечетное число");
        if (!polozh && chetn)
            System.out.println("отрицательное четное число");
        if (!polozh && !chetn)
            System.out.println("отрицательное нечетное число");



    }
}
