package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(reader.readLine());
        int a2 = Integer.parseInt(reader.readLine());
        int a3 = Integer.parseInt(reader.readLine());
        int a4 = Integer.parseInt(reader.readLine());
        int a5 = Integer.parseInt(reader.readLine());

        int minimum = min(a1, a2, a3, a4, a5);
//        minimum = min(minimum, a3);
//        minimum = min(minimum, a4);
//        minimum = min(minimum, a5);

        System.out.println("Minimum = " + minimum);
    }


    public static int min( int b1, int b2, int b3, int b4,  int b5 ) {
        int m = b1 < b2 ? b1 : b2;
        m = b3 < m ? b3 : m;
        m = b4 < m ? b4 : m;
        m = b5 < m ? b5 : m;
        return m;
    }
}
