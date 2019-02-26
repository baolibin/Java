package com.libin.data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Copyright (c) 2019/02/26. xixi Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose : 基于LinkedHashMap实现Lru
 */

class LruMapCache extends LinkedHashMap<String, String> {
    LruMapCache(boolean accessOrder) {
        // true 设置缓存为访问排序，即最新访问节点都排在队列的最后，最前面的都是最久未被使用的节点
        super(16, (float) 0.75, accessOrder);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
        return size() > 3;
    }
}

public class LruLinkedMap {
    public static void main(String[] args) {
        LruMapCache lruMapCache = new LruMapCache(true);
        lruMapCache.put("1", "hadoop1");
        lruMapCache.put("2", "hadoop2");
        lruMapCache.put("3", "hadoop3");
        lruMapCache.put("4", "hadoop4");
        lruMapCache.put("5", "hadoop5");
        for (Map.Entry<String, String> entry : lruMapCache.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
        lruMapCache.put("1", "hadoop1");
        lruMapCache.put("3", "hadoop3");
        for (Map.Entry<String, String> entry : lruMapCache.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }
}
