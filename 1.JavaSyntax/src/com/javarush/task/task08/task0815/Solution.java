package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Иванов1","Олег");
        hashMap.put("Иванов2","Антон");
        hashMap.put("Иванов3","Саня");
        hashMap.put("Орлов1","Саня");
        hashMap.put("Орлов2","Саня");
        hashMap.put("Орлов3","Олег");
        hashMap.put("Петров1","Саня");
        hashMap.put("Петров2","Олег");
        hashMap.put("Петров3","Пётр");
        hashMap.put("Петров4","Антон");
        return hashMap;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for(Map.Entry<String, String> entry : map.entrySet()){
            if (entry.getValue().equals(name))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for(Map.Entry<String, String> entry : map.entrySet()){
            if (entry.getKey().equals(lastName))
                count++;
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
