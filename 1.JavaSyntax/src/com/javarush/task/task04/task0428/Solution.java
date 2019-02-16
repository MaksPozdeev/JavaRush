package com.javarush.task.task04.task0428;

/* 
Положительное число
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

        int count =0;
        for (int i = 0; i<3; i++)
            if (arr[i]>0) count++;

        System.out.println(count);
    }
}
