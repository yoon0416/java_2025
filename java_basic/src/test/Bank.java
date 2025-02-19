package test;
import java.util.Scanner;
// 수정할 거 private를 배열 3명잡고 만들기 메인 안으로 넣기`
// 메소드 말고 제어문으로 음.. 모르겠다

public class Bank {
    private static String id;     // 아이디 전역변수
    private static String pw;     // 비번 전역변수
    private static int age;       //나이 전역변수
    private static int money;     //잔액 전역변수
    private static String idinput; //사용자한테 입력받은 아디 전역변수
    private static String pwinput; //사용자한테 입력받은 비번 전역변수

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        while (true) { //기본으로 은행서비스 선택하는 창과 입력값 무한반복
            System.out.println("======BANK======");
            System.out.println("* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력>>>");

            int input = sc.nextInt(); //은행서비스를 뭐 쓸꺼냐?
            
            if(input <=2 && input <6) {
            	
            }
            switch (input) {
                case 1: //추가 아이디 비번, 추가
                    System.out.println("아이디 입력 : ");  // 아디설정
                    id = sc.next();
                    System.out.println("비밀번호 입력 : "); // 비번설정
                    pw = sc.next();
                    System.out.println("나이 입력 : "); // 나이설정
                    age = sc.nextInt();
                    System.out.println("잔액 입력 :"); // 잔액
                    money = sc.nextInt();
                    break; //끝났으니 반복문으로 나가기
                
                case 2: //조회
                    System.out.println("id : "); //아디 비번 입력받기 (로그인)
                    idinput = sc.next();
                    System.out.println("pw : "); 
                    pwinput = sc.next();
                    
                    if (idinput.equals(id) && pwinput.equals(pw)) { //문자열 비교할 땐 equals가 ==보다 ㄱㅊ
                        System.out.println("계좌조회"); //만약 입력한 아이디 기존아이디 && 입력한 비번이랑 기존비번이 같아서 true라면
                        System.out.println("id : " + id);
                        System.out.println("pw : " + pw);
                        System.out.println("나이 : " + age);
                        System.out.println("잔액 : " + money);
                    } else { //아니라면 비번 틀렸다고 하기 그리고 break문을 사용하여 반복문 탈출 후 다시 while문으로 가기
                        System.out.println("다시 확인해주세요.");
                    }
                    break; //if문 끝났으면 빠져나가기 while무한루프
                
                case 3: //입금
                    System.out.println("id : "); //아디 비번 입력받기 (로그인)
                    idinput = sc.next();
                    System.out.println("pw : ");
                    pwinput = sc.next();

                    if (idinput.equals(id) && pwinput.equals(pw)) { //case 2에서부터 한 아디비번확인
                        System.out.println("입금할 금액 : ");
                        int plus = sc.nextInt();  //기존 금액에 추가로 입금할 금액 입력
                        money += plus; //기존 돈 money = money + plus(입금금액)
                        System.out.println("==입금완료\n잔액: " + money);
                    } else {
                        System.out.println("다시 확인해주세요.");
                    }
                    break; //끝났으면 빠져나가기 while무한루프
                
                case 4: //출금
                    System.out.println("id : "); //아디 비번 입력받기 (로그인)
                    idinput = sc.next();
                    System.out.println("pw : ");
                    pwinput = sc.next();

                    if (idinput.equals(id) && pwinput.equals(pw)) { //case 2에서부터 한 아디비번확인
                        System.out.println("출금할 금액 : ");
                        int minus = sc.nextInt(); //출금할 금액을 마이너스에 넣고
                        if (minus <= money) { //만약 기존 금액이 출금 금액보다 높다면 (잔액 많다면)
                            money -= minus; // money = money - minus
                            System.out.println("출금 완료! 현재 잔액: " + money);
                        } else { //돈 없다면 잔액 부족하다고 말해주기
                            System.out.println("잔액이 부족합니다.");
                        }
                    } else { //아디비번 틀렸을 때
                        System.out.println("다시 확인해주세요.");
                    }
                    break; //if문 끝났으면 빠져나가기 while무한루프

                case 5: //계좌 삭제
                    System.out.println("id : "); //아디 비번 입력받기 (로그인)
                    idinput = sc.next();
                    System.out.println("pw : ");
                    pwinput = sc.next();

                    if (idinput.equals(id) && pwinput.equals(pw)) { //case 2에서부터 한 아디비번확인
                       System.out.println("계좌를 삭제하시겠습니까? (Y / N)");
                       String YN = sc.next();
                       if(YN.equals("y") || YN.equals("Y")) { //y눌렀다면 삭제절차 equals 안쓰고 == 했다고 실행 안하는거봐 싸가지 
                    	   id = null; //기존 id null값으로 다음에 계좌 추가해도 값 안겹치게
                           pw = null; //비번도
                           age = 0; //0살로 만들기
                           money = 0; //텅장으로 만들기
                           System.out.println("계좌가 삭제되었습니다.");
                       }
                       else { //n이던 뭐던 y아니면 나가기
                    	   break;
                       }
                    	
                    } else {
                        System.out.println("다시 확인해주세요.");
                    }
                    break; //if문 끝났으면 빠져나가기 while무한루프
                
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
// 문자열 비교는 equals()로 이유는 ==연산자는 두 문자열의 주소가 같은지 비교, equals()는 두 문자열의 내용을 비교. 스캐너를 쓰는 우리는 equals를 써야함
// 스캐너로 비교군과 같은 입력값을 넣어도 주소가 다르기 때문에 ==이 안먹음 이걸로 30분 날림
