package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String, String> hashmap = new HashMap<>();
            hashmap.put("A1", "A");
            hashmap.put("A2", "B");
            hashmap.put("A3", "C");
            hashmap.put("A4", "A");
            hashmap.put("A2", "D");
            hashmap.put("A6", "B");
            hashmap.put("A1", "E");
            hashmap.put("A8", "F");
            hashmap.put("A9", "G");
            hashmap.put("A10", "C");
        return hashmap;
    }

    public static void printPeopleList(Map<String, String> map) {
//        System.out.println(map.size());
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());

        }
    }
}