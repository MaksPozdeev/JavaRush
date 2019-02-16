package com.javarush.task.task04.task0441;


/* 
Как-то средненько
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

        int indx = -1;
        if (arr[0] == arr[1] && arr[1] == arr[2]) indx = 0;
        else if (arr[0] == arr[1]) indx = 0;
        else if (arr[0] == arr[2]) indx = 0;
        else if (arr[1] == arr[2]) indx = 1;
        else if (arr[0] > arr[1] && arr[0] < arr[2]) indx = 0; // 5 3 7
        else if (arr[0] < arr[1] && arr[0] > arr[2]) indx = 0; // 5 7 3
        else if (arr[0] < arr[1] && arr[1] < arr[2]) indx = 1; // 3 5 7
        else if (arr[0] > arr[1] && arr[1] > arr[2]) indx = 1; // 7 5 3
        else if (arr[2] > arr[0] && arr[2] < arr[1]) indx = 2; // 3 7 5
        else if (arr[2] < arr[0] && arr[2] > arr[1]) indx = 2; // 7 3 5

        System.out.println(arr[indx]);
    }
}
