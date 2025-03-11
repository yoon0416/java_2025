package com.company.java016_ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class Cook {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("피구왕", "통키");
        map.put("제빵왕", "김탁구");
        map.put("요리왕", "비룡");

        System.out.println("==============================");
        System.out.println(" KING   NAME ");
        System.out.println("==============================");
        
       
        for (Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            System.out.println("---------------------");
        }
        
        
        System.out.println("킹의 정보를 읽고 있습니다.");
        Scanner sc = new Scanner(System.in);
        String king1 = sc.next();
        

        if (map.containsKey(king1)) {
            System.out.println("□" + king1 + " : " + map.get(king1));
        } else {
            System.out.println("해당 왕을 찾을 수 없습니다.");
        }

    } // end psvm

} // end class
