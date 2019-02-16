package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int y = scanner.nextInt();
        int i = 1;
        while (i <= y){
            System.out.println(s);
            i++;
        }

    }
}
