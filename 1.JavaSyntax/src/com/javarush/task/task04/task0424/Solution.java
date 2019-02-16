package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arr = new int[3];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <3; i++)
            arr[i] = scan.nextInt();

        int indx=-1;
        if (arr[0] == arr[1]) indx = 2;
        if (arr[0] == arr[2]) indx = 1;
        if (arr[1] == arr[2]) indx = 0;
        if (indx > -1) System.out.println(indx+1);
    }
}
