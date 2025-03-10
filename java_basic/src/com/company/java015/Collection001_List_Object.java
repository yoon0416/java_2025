package com.company.java015;

import java.util.ArrayList;
import java.util.List;

//1. DTO (데이터전달 : 생성자, toString, getters/setters)

class Milk {
    private int mno;
    private String name;
    private int mprice;

    public Milk(int mno, String name, int mprice) {
        this.mno = mno;
        this.name = name;
        this.mprice = mprice;
    }

    public int getMno() { return mno; }

    public void setMno(int mno) { this.mno = mno; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getMprice() { return mprice; }

    public void setMprice(int mprice) { this.mprice = mprice; }

    @Override
    public String toString() {
        return "Milk [mno=" + mno + ", name=" + name + ", mprice=" + mprice + "]";
    }
}

public class Collection001_List_Object {

    public static void main(String[] args) {
        //2. Milk 자료형으로 ArrayList 동적배열 만들기 milks
        List<Milk> milks = new ArrayList<>();

        //3. 데이터 넣기
        milks.add(new Milk(1, "white", 1200));
        milks.add(new Milk(2, "choco", 1200));
        milks.add(new Milk(3, "banana", 1200));

        //4. 출력 - Standard for loop
        for (int i = 0; i < milks.size(); i++) {
            Milk temp = milks.get(i);
            System.out.println(temp.getMno() + "/" + temp.getName() + "/" + temp.getMprice());
        }

        //5. 향상된 for문 (Enhanced for loop)
        for (Milk temp : milks) {
            System.out.println(temp.getMno() + "/" + temp.getName() + "/" + temp.getMprice());
        }
    }
}
