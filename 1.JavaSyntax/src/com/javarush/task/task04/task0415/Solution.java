package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if ( (sum(b,c) > a) && (sum(a, c) > b) && (sum(a, b) > c))
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
    }

    public static int sum(int a, int b){
        int q= a+b;
        return q;
    }

}