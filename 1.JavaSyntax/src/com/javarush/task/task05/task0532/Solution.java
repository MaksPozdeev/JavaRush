package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int maximum =-2147483648;
        int maximum = Integer.MIN_VALUE;
        String s;
        int n, q;

        //напишите тут ваш код
        while (true){
            s = reader.readLine();
            n = Integer.parseInt(s);
            if (n > 0) break;
        }

        for (int i = 0; i < n; i++) {
            s = reader.readLine();
            q = Integer.parseInt(s);
            if (q > maximum) maximum = q;
        }

        System.out.println(maximum);
    }
}
