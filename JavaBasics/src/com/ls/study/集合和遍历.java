package com.ls.study;

import java.util.*;

public class 集合和遍历 {
    public static void main(String[] args) {
        test2();
    }

    public static void test1(){
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");

        Set<String> keySet = map.keySet();

        //迭代器
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            String value =  map.get(key);
            System.out.println(key + ":" + value);
        }
        System.out.println("============================");
        //增强for
        for (String key : keySet) {
            String value = map.get(key);
            System.out.println(key + ":" + value);
        }

    }

    public static void test2(){
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();


        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key +":"+ value);
        }
        System.out.println("============================");
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    public void test3(){
        Hashtable<String,String> hashtable = new Hashtable<String,String>();
        hashtable.put("1","a");
        hashtable.put("2","b");
    }
}
