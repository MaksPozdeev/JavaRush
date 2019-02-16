package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scann = new Scanner(System.in);
        int a = scann.nextInt();
        int b = scann.nextInt();
        int min = a;
        if (a < b) min = a; else min = b;
        System.out.println(min);

    }
}