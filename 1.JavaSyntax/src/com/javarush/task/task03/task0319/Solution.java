package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int a1 = Integer.parseInt(s1);
        int a2 = Integer.parseInt(s2);
        System.out.println(name + " получает "+ a1 +" через "+ a2 +" лет.");
    }
}
