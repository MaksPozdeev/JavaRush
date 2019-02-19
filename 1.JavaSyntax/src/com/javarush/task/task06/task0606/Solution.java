package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even; //chet
    public static int odd;  //nechet

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char ch;
        int w;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            w = Integer.parseInt(String.valueOf(ch));
            if (w % 2 == 0) even++;
            else if (w % 2 != 0) odd++;
        }

        System.out.println("Even: " + even + " Odd: " + odd);

    }
}
