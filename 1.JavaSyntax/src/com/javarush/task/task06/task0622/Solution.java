package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            arr[i] = Integer.parseInt(s);
        }

        Arrays.sort(arr);

        for (int a : arr) {
            System.out.println(a + " ");
        }
    }
}

/*
Числа по возрастанию
*/
