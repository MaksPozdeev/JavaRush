package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arr = new int[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i<3; i++)
            arr[i] = scan.nextInt();

        int count_min = 0;
        int count_pls = 0;
        for (int i = 0; i<3; i++) {
            if (arr[i] > 0) count_pls++;
            if (arr[i] < 0) count_min++;

        }

        System.out.println("количество отрицательных чисел: " + count_min);
        System.out.println("количество положительных чисел: " + count_pls);
    }
}
