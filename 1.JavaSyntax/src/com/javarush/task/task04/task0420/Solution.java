package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arr = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i =0; i < 3; i++)
            arr[i] = scanner.nextInt();

        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 3; j++) {
                if (arr[i] < arr[j]) {
                    int w = arr[i];
                    arr[i] = arr[j];
                    arr[j] = w;
                }
            }
        }


        for (int a :arr) {
            System.out.print(a + " ");
        }

    }

//    public static int max(int a, int b){
//        int m = a;
//        if (a > b) m = a;
//        else m = b;
//        return m;


}
