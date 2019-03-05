package com.libin.data;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Copyright (c) 2019/02/20. xixi Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose : 集合类Demo
 */
public class GatherDemo {
    public static void main(String[] args) {
        // Hashtable 无法存入null值
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("", "");
        hashtable.put("null", "null");
        for (Map.Entry entry : hashtable.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        // HashMap
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("","");
        hashMap.put(null,null);
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        // LinkedHashMap
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("","");
        linkedHashMap.put(null,null);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
