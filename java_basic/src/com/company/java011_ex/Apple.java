package com.company.java011_ex;

public class Apple {
    private String name;
    private String order;
    private int num;
    private int price;

    public Apple() {}
    public Apple(String name, String order, int num, int price) {
        this.name = name;
        this.order = order;
        this.num = num;
        this.price = price;
    }

    
    @Override
    public String toString() {
        return "Apple [name=" + name + ", order=" + order + ", num=" + num + ", price=" + price + "]";
    }
}
