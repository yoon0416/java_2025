package com.company.java009_ex;

class Student001 {
    String name;
    int no, kor, eng, math;

    void info() {
        int total = this.kor + this.eng + this.math;
        double aver = total / 3.0;
        System.out.printf("이름: %s\n학번: %d\n총점: %d\n평균: %.2f", this.name,this.no, total, aver);
    }
}

public class ClassEx001 {
    public static void main(String[] args) {
        Student001 s1 = new Student001();
        s1.name = "first";
        s1.no = 11;
        s1.kor = 100;
        s1.eng = 100;
        s1.math = 99;
        s1.info();
    }
}
/* 클래스는 설계도 - 인스턴스화( heep - new - 객체생성 )를 통해 - 객체(객체들 s1,s2,s3 뭉쳐서 표현) / 인스턴스(각각의 s1.name,s2.name) 
---------------------------------------------------------  [runtime data area]
[method:정보, static, final:공용정보]                      Student001.class / ClassEx001.class
----------------------------------------------------------
[heap:동적]                                       |[stack:잠깐빌리기]

19번째 줄 1번지 {name=first,no=11,kor=100,eng=100,math=100}     ←    s1 1번지
19번째 줄 1번지 {name=null,no=0,kor=0,eng=0,math=0}     ←    s1 1번지
								             	 |main
--------------------------------------------------------
*/