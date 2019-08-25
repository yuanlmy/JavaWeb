package com.jp;

import java.util.HashMap;

/**
 * @author lmy
 * @create 2019-08-25 13:27
 */
public class DeBugTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name","tom");
        map.put("age","12");
        map.put("school","Tsinghua");
        map.put("major","computer");

        String age = map.get("age");

        System.out.println("age = " + age);

        map.remove("major");

        System.out.println(map);
    }
}
