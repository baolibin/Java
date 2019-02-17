package com.libin.data;

import java.util.ArrayList;

/**
 * Copyright (c) 2019/02/17. xixi Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose :
 */
public class StringDemo {
    public static void main(String[] args) {
        // format
        System.out.println(String.format("this is %s", "demo"));
        // join
        ArrayList<String> list = new ArrayList<String>();
        list.add("村");
        list.add("头");
        list.add("干");
        list.add("活");
        list.add("那");
        list.add("小");
        list.add("伙");
        System.out.println(String.join(",", list));
        // matches
        String str = "demo";
        System.out.println("this is my demo".matches("(.*)" + str));

    }
}
