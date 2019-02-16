package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int a4 = scanner.nextInt();
        int m = max(max(a1, a2), max(a3, a4));
        System.out.println(m);
    }

    public static int max(int a, int b){
        int m = a;
        if (a > b) m = a;
            else m = b;
        return m;
    }
}
