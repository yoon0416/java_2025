package com.company.java010_ex;
import java.util.Scanner;
//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)
//3. 생성자호출 초기화

class Tv{
	//상태 멤버함수 채널/볼륨
    String channel; int volume;
    
    //행위-멤버함수 채널, 볼륨입력 : input() / 출력: show() (메서드)
    void input() {
      //변수 - 입력 - 처리 - 출력
    	Scanner sc = new Scanner(System.in);
    	System.out.println("채널입력 ㄱ");
        channel = sc.next();
        System.out.println("볼륨입력 ㄱ");
        volume = sc.nextInt();
    }
    
    void show() { 
        System.out.println("채널은 " + channel + "이고, 볼륨은 " + volume + "입니다.");
    }

    //매개변수 있는 생성자 멤버변수 == 파라미터
    public Tv(String channel, int volume) { //생성자 파라미터에 외부값(input으로 받은 채널, 볼륨 넣기위한 코드) 
    	
        this.channel = channel; 
        this.volume = volume;
     
    }

    //기본생성자: tv() 컴파일러 기본자동생성
    public Tv() { //파라미터 없어서 디폴트 생성자 (원래라면 기본 자동생성 but 생성자를 개발자가 손대는 순간 자동생성 취소)
    	super(); // super()는 부모 찾는 아무튼 밑에 값? 이렇게 말하면 뭐 알아서 알아듣겠지 미래의 내가 아무튼 걔네보다 위에 있어야함 "순서대로 실행하니까" 나중에 구글링 합시다
        channel = "홈쇼핑"; 
        volume = 8;
    }
}//end Tv.class

public class ClassEx004 {
	public static void main(String[] args) {
        Tv t1 = new Tv(); 
        t1.input();      
        t1.show();       
        
    }//end psvm
    
}//end ClassEx004.class



/*
 * ------------------------------------  [runtime data area]
[method:정보, static, final:공용정보]
------------------------------------
[heap:동적]      |[stack:잠깐빌리기]
------------------------------------
 */

/*
 1. 메서드 영역에 Tv.class, ClassEx004.class 파일이 올라감
 2. main() 메서드를 만나 static이므로 static 메서드 영역에 main()이 호출됨
 3. main() 메서드 내에서 Tv 객체 t1이 생성되며 Tv() 생성자가 호출됨
 
 
 */

/* 
 -내가 이해한거
 
 @생성자
 객체.메소드 호출이라 객체의 기본값을 설정해준 생성자를 부르는데 지금 파라미터가 없는 기본생성자에서는 초기화 
 파라미터가 있는 생성자는 사용자가 원하는 값을 객체의 상태에 설정하는 역할 나중에 t1.input() t1.show() 같이 객체.메서드를 할 때 객체의 기본값을 메서드의 값에 대입해야함
 그래서 this.channel = channel;와 같은 코드로, 사용자가 제공한 값을 객체의 멤버 변수에 대입
 > 어짜피 String channel은 class에서 멤버함수를 정의한거고 메서드 안에서 정의한게 아니기 때문에 가능함
 마지막 void.show같은 경우 t1.show()이렇게 되어 있음 즉 객체의 기본값인 생성자의 파라미터값이 show()메서드에 대입됨 
 
 */

/*
 @this.
 파라미터가 있는 생성자에서는 객체의 멤버변수가 파라미터값이라 this.은 파라미터값을 뜻하고 
 파라미터가 없는 생성자에서는 파라미터가 없으니 클래스에 정의된 멤버 변수 자체를 가리키는 거
 결론: 기본생성자에서는 파라미터 안쓰니까 this 안써도 됨
 
 */










