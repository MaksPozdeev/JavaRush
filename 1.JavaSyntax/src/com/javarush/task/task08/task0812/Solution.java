package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            s = reader.readLine();
            arrayList.add(Integer.parseInt(s));
        }

//        arrayList.add(1);arrayList.add(1);arrayList.add(1);
//        arrayList.add(4);arrayList.add(4);arrayList.add(4);
//        arrayList.add(4);arrayList.add(4);arrayList.add(4);arrayList.add(4);

//        for (Integer a : arrayList) { System.out.println(a + " "); }

        int count = 0;
        int countNow = 0;
        int j = 0;

        for (int i = 0; i < 9; i++) {

            if (j == 10){
                if (countNow > count) {
                    count = countNow;
                }
                break;
            }

            for (j = i; j < 10; j++) {

                if (arrayList.get(i).equals(arrayList.get(j))) {
                    countNow++;
                }
                else {
//                    System.out.println(countNow);
                    if (countNow > count) count = countNow;
                    countNow = 0;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}