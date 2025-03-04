//package com.company.java010_ex;
//
//class Sawon3{ 
//    int pay      =10000;    //인스턴스변수
//    static int su=10;      //클래스변수
//     
//    static int basicpay=pay;   //클래스변수 - 인스턴스변수 (클ㄹ스변수, 클래스메서드 - this, 인스턴스 사용불가)
//     
//    static int basicpay2;    
//    
//    public static void showSu() {   System.out.println(su);  }          
//    public static void showPay() {   System.out.println(this.pay);  }    //static 메서드안에선 this 사용불가
//  
//    public  void  showAll001() {   
//       System.out.println(su);  
//       System.out.println(this.pay);  
//    } 
//    public static  void  showAll002() {   
//        showAll001();    					//static으로 선언한 메서드이지만 showAll001 메서드는 인스턴스 메서드라 오류
//       System.out.println(this.pay);		//static 메서드안에선 this 사용불가
//    } 
//} 
//public class MemberVarEx001{
//  public static void main(String[] args) {
//   Sawon3 sola = new Sawon3();  
//   sola.showAll001();
//  }
//}
