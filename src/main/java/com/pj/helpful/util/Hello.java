package com.pj.helpful.util;

import java.util.*;

public class Hello {
    public static void main(String[] args) {
//        Integer[] ar1={1,2,3,4,5};
//        int[] ar2=new int[ar1.length];
//        for (int i=0;i<ar1.length;i++){
//            ar2[i]=ar1[i];
//        }
//        for (int i=0;i<ar2.length;i++){
//            System.out.println(ar2[i]);;
//        }
        Map<String,Object> map1=new HashMap<>();
        Map<String,Object> map2=new HashMap<>();
        Map<String,Object> map3=new HashMap<>();
        List<Map<String,Object>> helo=new ArrayList<>();
        map1.put("count",123);
        map1.put("date","15:33:54");

        map2.put("count",183);
        map2.put("date","11:13:54");

        map3.put("count",113);
        map3.put("date","16:38:54");

        helo.add(map1);
        helo.add(map2);
        helo.add(map3);

        //排序前
        for (Map<String,Object> mp:helo) {
            System.out.println(mp);
        }
        Collections.sort(helo, new Comparator<Map<String, Object>>() {
            @Override
            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                Integer cn1= (Integer) o1.get("count");
                Integer cn2= (Integer) o2.get("count");
                return cn1.compareTo(cn2);
        }
        });
        System.out.println("排序后-----------------------");
        for (Map<String,Object> mp:helo) {
            System.out.println(mp);
        }
    }
}
