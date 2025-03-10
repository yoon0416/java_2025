package com.company.java015_ex;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

class Fruits1 {
    private int no;
    private String name;
    private int price;

    public Fruits1() {
        super();
    }

    @Override
    public String toString() {
        return "번호 : " + no + ", 이름 : " + name + ", 가격 : " + price;
    }

    public Fruits1(int no, String name, int price) {
        this.no = no;
        this.name = name;
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class ListEx004_2 {

    public static void main(String[] args) {
        List<Fruits1> fu = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        fu.add(new Fruits1(1, "apple", 2000));
        fu.add(new Fruits1(2, "banana", 2500));
        fu.add(new Fruits1(3, "coconut", 4500));

        String[] fruitinfo = {"사과는 빨갛다", "바나나는 노랗다", "코코넛은 코코하다"};
        String userInput = JOptionPane.showInputDialog("1,2,3 과일정보를 입력하시오. ");        
        
        
        try {
            // 기본적으로 문자열이라 인티저로 숫자로 변환
            int inputnum = Integer.parseInt(userInput);
            
            String message = fu.get(inputnum - 1) + "\n" + fruitinfo[inputnum - 1];
            JOptionPane.showMessageDialog(null, message);

        } catch (NumberFormatException NotNum) {
            // 숫자가 아닌 값을 입력했을 경우 처리
            JOptionPane.showMessageDialog(null, "잘못된 입력입니다. 숫자만 입력해주세요.");
        }
    }//end psvm
}//end class
