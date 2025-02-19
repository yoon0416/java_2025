package test;
import java.util.Scanner;
// 수정할 거 private를 배열 3명잡고 만들기 메인 안으로 넣기` > 완료
// 메소드 말고 제어문으로 음.. 모르겠다
//이제 전에 했던거랑 코드 중복 주석 안함

// if문을 사용해서 만약 case 2,3,4,5면  중복코드 넣기(로그인과정) 이건가

public class Bank2 {
    public static void main(String[] args) {
    	
    	String[] id = new String[3]; //사용자 id 배열 3칸 선언
    	String[] pw = new String[3]; //사용자 비번 배열 3칸 선언
    	int[] age = new int[3]; 	 //사용자 나이 배열 3칸 선언
    	int[] money = new int[3];    //사용자 잔액 배열 3칸 선언
    	
    	
        Scanner sc = new Scanner(System.in);

        while (true) { //기본으로 은행서비스 선택하는 창과 입력값 무한반복
            System.out.println("======BANK======");
            System.out.println("* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력>>>");

            int input = sc.nextInt(); //은행서비스를 뭐 쓸꺼냐?
            
            switch (input) {
	            case 1: // 추가: 아이디, 비밀번호, 나이, 잔액 입력
	                System.out.println("아이디 입력 : ");
	                String newId = sc.next();
	                System.out.println("비밀번호 입력 : ");
	                String newPw = sc.next();
	                System.out.println("나이 입력 : ");
	                int newAge = sc.nextInt();
	                System.out.println("잔액 입력 : ");
	                int newMoney = sc.nextInt();
	                
	                
	                for(int i=0; i<3; i++) { 			//for문으로 배열안에 값넣기
	                	if(id[i] == null) {				 //만약 id[i]값이 없다면
	                		id[i] = newId;				 //id[i]에 방금 받은 새아이디 넣기
	                		pw[i] = newPw; 				//pw[i]에 방금 받은 비번 넣기
	                        age[i] = newAge; 			//age[i]에 방금 받은 나이 넣기
	                        money[i] = newMoney; 		//money[i]에 방금 받은 잔액 넣기
	                        break;
	                	}
	                }
                    break; //case1 나가기
                    
                case 2: //조회
                	 System.out.println("아이디 입력 : ");
                     String idInput = sc.next(); 				//저장된 아디랑 입력받은 아디랑 비교를 위해 idInput 생성
                     System.out.println("비밀번호 입력 : ");
                     String pwInput = sc.next(); 				//저장된 비번이랑 입력받은 비번이랑 비교를 위해 pwInput 생성

                     boolean fine = false; // 아디비번 맞았을 때 true 틀렸을 때 false 초기값을 flase를 준 이유는 아디비번이 맞고 그때 true를 주면 나머지경우는 다 flase라 그 뒤 코드가 편함
                     
                    // 기존 비번 아디랑 맞는 배열(id[i] 등등) 찾기
                     for (int i = 0; i < 3; i++) { // 배열이니 초기값 0, 3칸짜리니까 i<3, i++
                         if (id[i] != null && id[i].equals(idInput) && pw[i].equals(pwInput)) { //만약 id[i]가 비어있지 않고 아디비번이 같다면
                             System.out.println("계좌 조회");              //조회서비스 시작
                             System.out.println("아이디 : " + id[i]);
                             System.out.println("비밀번호 : " + pw[i]);
                             System.out.println("나이 : " + age[i]);
                             System.out.println("잔액 : " + money[i]);
                             fine = true; //그리고 찾았으니 fine = true로 바꿔주기 안그러면 밑에서 아디비번 잘못되었다고 말함 그럴거 같음 해보지는 않음
                             break; //반복문 나가기
                         }
                     }

                     if (!fine) { //만약 fine가 위 if문에 통과 못하여 true 설정이 안되어있다면
                         System.out.println("아이디 또는 비밀번호가 잘못되었습니다."); // 아디비번 다시 잘못되었다고 알려주기
                         break;
                     }
                     break; //case 2 나가기
                
                case 3: //입금
                	System.out.println("아이디 입력 : ");
                    idInput = sc.next();
                    System.out.println("비밀번호 입력 : ");
                    pwInput = sc.next();

                    fine = false;
                  
                    for (int i = 0; i < 3; i++) { //이제 Bank.java 했던거랑 코드 중복 주석 안함
                        if (id[i] != null && id[i].equals(idInput) && pw[i].equals(pwInput)) {
                            System.out.println("입금할 금액 : ");
                            int plus = sc.nextInt();
                            money[i] += plus; // 입금 처리
                            System.out.println("입금 완료! 현재 잔액 : " + money[i]);
                            fine = true;
                            break;	
                        }
                        if (!fine) { //만약 fine가 위 if문에 통과 못하여 true설정이 안되어있다면
                            System.out.println("아이디 또는 비밀번호가 잘못되었습니다."); // 아디비번 다시 잘못되었다고 알려주기
                        }
                        break; //브레이크
                    }
                    break;
                    
                case 4: //출금
                	System.out.println("아이디 입력 : ");
                    idInput = sc.next();
                    System.out.println("비밀번호 입력 : ");
                    pwInput = sc.next();

                    fine = false;
                  
                    for (int i = 0; i < 3; i++) {
                        if (id[i] != null && id[i].equals(idInput) && pw[i].equals(pwInput)) {
                        	System.out.println("출금할 금액 : ");
                            int minus = sc.nextInt(); 
                            if (minus <= money[i]) { 
                            	money[i] -= minus; 
                                System.out.println("출금 완료! 현재 잔액: " + money[i]);
                            } else {
                                System.out.println("잔액이 부족합니다.");
                            }
                            fine = true;
                            break;	
                        }
                        if (!fine) { 
                            System.out.println("아이디 또는 비밀번호가 잘못되었습니다."); 
                        }
                        break;
                    }
                    break;
                case 5: //계좌 삭제
                	System.out.println("아이디 입력 : ");
                    idInput = sc.next();
                    System.out.println("비밀번호 입력 : ");
                    pwInput = sc.next();

                    fine = false;
                  
                    for (int i = 0; i < 3; i++) { //이제 전에 했던거랑 코드 중복 주석 안함
                        if (id[i] != null && id[i].equals(idInput) && pw[i].equals(pwInput)) {
                        	System.out.println("계좌를 삭제하시겠습니까? (Y / N)");
                        	String YN = sc.next();
                        	if(YN.equals("y") || YN.equals("Y")) {
                        		id[i] = null;
                                pw[i] = null;
                                age[i] = 0;
                                money[i] = 0;
                                System.out.println("계좌가 삭제되었습니다.");
                        	}
                        	 
                            fine = true;
                            break;	
                        }
                        if (!fine) {
                            System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
                        }
                        break;
                    }
                    break;
                
                case 9: //종료
                    System.out.println("프로그램을 종료합니다.");
                    sc.close(); //입력 이제 안받음
                    return; // 종료 시 프로그램 종료
                
                default: //입력값 이상하면
                    System.out.println("제대로 된 입력값을 넣으세요.");
            }
        }
    }
}
