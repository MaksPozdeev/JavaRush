package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("fam1", 100);
        hashMap.put("fam2",700);
        hashMap.put("fam3",200);
        hashMap.put("fam4",800);
        hashMap.put("fam5",300);

        hashMap.put("fam6",600);
        hashMap.put("fam7",100);
        hashMap.put("fam8",500);
        hashMap.put("fam9",300);
        hashMap.put("fam10",400);

        return hashMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator itr = map.entrySet().iterator();
        Map.Entry pair;
        Integer a;
        while (itr.hasNext()){
            pair = (Map.Entry) itr.next();
            a = (Integer)pair.getValue();
            if (a.compareTo(500)== -1)
                itr.remove();
        }
    }

    public static void main(String[] args) {
//        HashMap<String, Integer> hm =  createMap();
//        for (Map.Entry <String, Integer> pair : hm.entrySet())
//            System.out.println(pair.getKey()+" "+pair.getValue());
//
//        System.out.println();
//        removeItemFromMap (hm);
//
//        for (Map.Entry <String, Integer> pair : hm.entrySet())
//            System.out.println(pair.getKey()+" "+pair.getValue());

    }
}