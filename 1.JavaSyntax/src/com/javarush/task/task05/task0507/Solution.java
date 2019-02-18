package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int count = 0;
        double summ = 0.0;

        Scanner scanner = new Scanner(System.in);
        int q;
        while (true){
            q = scanner.nextInt();
            if (q == -1){
                break;
            }
            count++;
            summ += q;

        }
        double sr = summ / count;
        System.out.println(sr);
    }
}

