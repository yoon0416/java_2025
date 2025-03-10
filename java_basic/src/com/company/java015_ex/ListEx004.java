package com.company.java015_ex;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

class Fruits {
    private int no;
    private String name;
    private int price;

    public Fruits() {
        super();
    }

    @Override
    public String toString() {
        return "번호 : " + no + ", 이름 : " + name + ", 가격 : " + price;
    }

    public Fruits(int no, String name, int price) {
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

public class ListEx004 {

    public static void main(String[] args) {
        List<Fruits> fu = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        fu.add(new Fruits(1, "apple", 2000));
        fu.add(new Fruits(2, "banana", 2500));
        fu.add(new Fruits(3, "coconut", 4500));

        
        for (int i = 0; i < fu.size(); i++) {
            Fruits f = fu.get(i);
            System.out.println(f.getNo() + f.getName() + f.getPrice());
        }
        System.out.println("--------------");
        for (Fruits f : fu) {
            System.out.println(f.getNo() + f.getName() + f.getPrice());
        }

       
        System.out.println("--------------");
        String[] fruitinfo = {"사과는 빨갛다", "바나나는 노랗다", "코코넛은 코코하다"};
        
        System.out.println("1,2,3 과일정보를 입력하시오.");
        int inputnum = sc.nextInt();

        try {
            switch (inputnum) {
                case 1:
                    System.out.println(fu.get(inputnum - 1));
                    System.out.println(fruitinfo[inputnum - 1]);
                    break;

                case 2:
                    System.out.println(fu.get(inputnum - 1));
                    System.out.println(fruitinfo[inputnum - 1]);
                    break;

                case 3:
                    System.out.println(fu.get(inputnum - 1));
                    System.out.println(fruitinfo[inputnum - 1]);
                    break;

                default:
                    System.out.println("1부터 3까지 숫자를 넣어주세요");
            }
        } catch (NumberFormatException e) {
            
            System.out.println("잘못된 입력입니다. 숫자만 입력해주세요.");
        }
        
        String userInput = JOptionPane.showInputDialog("1부터 3까지 숫자 하나를 입력하세요: ");
        
    }//end psvm
}//end class
