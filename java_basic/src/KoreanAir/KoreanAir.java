package KoreanAir;
import java.util.Scanner;

public class KoreanAir {
	private static String ID; //id
	private static String PW; //pw
	private static String name; //이름
	private static String engname; //영문이름
	private static int brith; //생년월일
	private static int mafe; //성별
	private static String email; //email
	private static int number; //전번
	private static String passnum; //여권번호
	private static String con; //거주국가
//---------------------------------------------
	private static String inputid;
	private static String inputpw;

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        while (true) { //기본으로 은행서비스 선택하는 창과 입력값 무한반복
            System.out.println("====================================================================");
            System.out.println("1. 로그인      2. 회원가입      3. 회원탈퇴      9.종료");
            System.out.println("====================================================================");
            
            int input = sc.nextInt(); //로그인 회원가입 회원탈퇴 종료 뭐할꺼냐?
            
            switch(input) {
            case 1: //로그인
            	
            
            case 2: //회원가입 //추가할 거 : 아디중복확인
            	System.out.println("ID 입력 : ");  // 아이디
                ID = sc.next();
                //아이디 중복확인 해야하는데 이거 DB 써야하는거 아닌가? 아닌가 아닌가안아ㅣㄴ아니가미;ㄴ알만ㅇㄹ;ㅐ머ㅡㄴㅇ;
                
                System.out.println("PW 입력 : ");  // 비밀번호
                PW = sc.next();
                
                System.out.println("PW 다시 입력 : ");  // 비밀번호 재확인
                inputpw = sc.next();
                if(!inputpw.equals(PW)) {
                	 System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                     break;
                }
                
                System.out.println("이름 입력 : ");  // 이름
                name = sc.next();
                
                System.out.println("영문이름 입력 : ");  // 영문이름
                engname = sc.next();
                
                System.out.println("생년월일 : ");  // 생년월일
                brith = sc.nextInt();
                
                System.out.println("성별 1남자 2여자: ");  // 성별
                mafe = sc.nextInt();
                if (mafe != 1 && mafe != 2) {
                    System.out.println("잘못된 성별 입력입니다. 다시 시도하세요.");
                    break;
                }
                
                System.out.println("email 입력 : ");  // email
                email = sc.next();
                
                System.out.println("전화번호 입력 : ");  // 전번
                number = sc.nextInt();
                
                System.out.println("여권번호 입력 : ");  // 여권번호
                passnum = sc.next();
                
                System.out.println("거주국가 입력 : ");  // 거주국가
                con = sc.next();
                
                System.out.printf("%s님 가입을 환영합니다!",name);
                break;
                
            case 3: //회원탈퇴
            	
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
