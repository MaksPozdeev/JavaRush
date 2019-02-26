package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("fam1", "name1");
        hashMap.put("fam2", "name1");
        hashMap.put("fam3", "name2");
        hashMap.put("fam4", "name2");
        hashMap.put("fam5", "name3");
        hashMap.put("fam6", "name4");
        hashMap.put("fam7", "name5");
        hashMap.put("fam8", "name6");
        hashMap.put("fam9", "name7");
        hashMap.put("fam10", "name8");

        return  hashMap;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        List<String> lst = new ArrayList<String>(map.values());

        int count;
        for (String str : lst) {
            count = 0;
            for (String str2 : lst) {
                if (str.equals(str2))
                    count++;
                if (count==2) removeItemFromMapByValue (map, str);
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<>(map);

        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//        HashMap<String, String> hm =  createMap();
//
//        for (Map.Entry <String,String> pair : hm.entrySet()) {
//            System.out.println(pair.getKey() + " " + pair.getValue());
//        }
//        System.out.println();
//
//        removeTheFirstNameDuplicates (hm);
//
//        for (Map.Entry <String,String> pair : hm.entrySet()) {
//            System.out.println(pair.getKey() + " " + pair.getValue());
//        }
    }
}
