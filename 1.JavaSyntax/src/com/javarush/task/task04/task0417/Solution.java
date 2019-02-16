package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scann = new Scanner(System.in);
        int a = scann.nextInt();
        int b = scann.nextInt();
        int c = scann.nextInt();

        if ((a == b) && (b == c)) System.out.println(a + " " + b + " " + c);
        else {
            if (a == b) System.out.println(a + " " + b);
            if (b == c) System.out.println(b + " " + c);
            if (a == c) System.out.println(a + " " + c);
        }
    }
}