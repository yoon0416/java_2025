package KoreanAir;
import java.util.Scanner;
// 추가해야할 것: 
//1. 항공권 예약 시 출발 도착 가는날 오는날 사용자가 입력해서 해당값 db(배열)에서 찾기
//2. 항공권 예약 시 예약된 좌석 색변경
//3. 좌석 2차원 배열로 만들기
//4. 변수 > 입력 > 처리 > 출력 형식으로 코드 구조 바꾸기

//.matches()는 문자열이 정규 표현식으로 정의된 패턴에 맞는지 확인하는 메서드입니다.
//정규 표현식(정규식)은 문자나 숫자 패턴을 정의하는 방법으로, 복잡한 문자열 검증을 쉽게 할 수 있습니다. 출처 구글링
//25.02.24 할 거 case 1~5 각 기능별로 클래스 나누어서 유지보수와 코드 가독성 높이기. >> 인터페이스까지 끝내고 나누기로 함 일단 다음 단계 공부부터
//contains()는 문자열(String)에서 특정 문자열이 포함되어 있는지 확인하는 메서드입니다.
//Integer.toString()은 정수(int)를 문자열(String)로 변환하는 메서드입니다.
//Integer는 자바에서 숫자를 다루는 클래스 중 하나로, 정수 값을 다룰 때 사용됩니다. 
//Integer.toString()은 이 클래스의 정수 -> 문자열 변환을 도와주는 메서드입니다.


public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		KoreanAircases case1 = new KoreanAircases();
		
		String[] id = new String[3]; //id
		String[] pw = new String[3]; //pw
		String[] name = new String[3]; //이름
		String[] engname = new String[3]; //영문이름
		String[] brith = new String[3]; //생년월일
		int[] mafe = new int[3]; //성별
		String[] email = new String[3]; //email
		String[] number = new String[3]; //전번
		String[] passnum = new String[3]; //여권번호
		String[] con = new String[3]; //거주국가
	//---------------------------------------------
		
		while (true) {
			 System.out.println("\n=============================================================================");
             System.out.println("1. 로그인      2. 회원가입      3. 회원탈퇴      9.종료");
             System.out.println("=============================================================================");
			
             int input = sc.nextInt();
             
             switch(input) {
             case 1: //로그인 
                 System.out.println("id : "); // 아디 비번 입력받기 (로그인)  
                 String inputid2 = sc.next();  
                 System.out.println("pw : ");  
                 String inputpw2 = sc.next();
                 for (int i = 0; i < 3; i++) {
                     if (id[i] != null && id[i].equals(inputid2) && pw[i].equals(inputpw2)) {
                         while (true) { // 무한 루프 추가
                        	 System.out.println("=================================================================================");
                             System.out.println("1. 항공권 예약      2. 항공권 조회      3. 항공권 취소      4. 좌석 변경      5.로그아웃");
                             System.out.println("=================================================================================");
                             System.out.println("입력 > ");
                             
                             int input2 = sc.nextInt();
                             
                             switch(input2) {
                                 case 1: // 항공권 예약
                                     case1.printFlightInfo(); // 항공권 정보, 선택
                                     break;
                                     
                                 case 2: // 항공권 조회
                                	 case1.printBookedFlights();
                                     break;
                                     
                                 case 3: // 항공권 취소
                                	 case1.cen();
                                     break;
                                 case 4: // 좌석 변경
                                	 case1.qusrud();
                                     break;
                                     
                                 case 5: // 로그아웃
                                     System.out.println("로그아웃 되었습니다.");
                                     break; // 로그아웃하면 반복문을 종료하고 로그인 화면
                                     
                                 default: // 잘못 입력한 경우
                                     System.out.println("제대로 된 값을 입력하세요");
                                     break;
                             }
                             if (input2 == 5) break; // 로그아웃을 선택했을 때 반복문 종료
                         }
                     }
                 }
                 break; // 로그인 반복문 종료
                 
             case 2: // 회원가입
            	    System.out.println("아이디 입력 : ");
            	    String newid = sc.next();

            	    // 중복된 아이디 체크
            	    boolean isDuplicate = false;
            	    for (int i = 0; i < 3; i++) {
            	        if (id[i] != null && id[i].equals(newid)) {
            	            isDuplicate = true;
            	            break;
            	        }
            	    }
            	    
            	    if (isDuplicate) {
            	        System.out.println("중복된 아이디입니다. 다른 아이디를 입력해주세요.");
            	        break;
            	    }

            	    System.out.println("비밀번호 입력 : ");
            	    String newpw = sc.next();

            	    System.out.println("비밀번호를 한 번 더 입력해주세요 : ");
            	    String confirmPw = sc.next();

            	    // 비밀번호 일치 여부 확인
            	    if (!newpw.equals(confirmPw)) {
            	        System.out.println("비밀번호가 일치하지 않습니다. 다시 시도해주세요.");
            	        break;
            	    }

            	    System.out.println("이름 입력 : ");  // 이름
            	    String newname = sc.next();
            	    System.out.println("영문이름 입력 : ");  // 영문이름
            	    String newengname = sc.next();
            	    System.out.println("생년월일(YYMMDD) 입력 : ");
            	    String newbrith = sc.next();

            	    // 생년월일 6자리 숫자 확인
            	    if (newbrith.length() != 6 || !newbrith.matches("\\d{6}")) {
            	        System.out.println("잘못된 생년월일 형식입니다. 6자리 숫자로 입력해주세요.");
            	        break;
            	    }
            	    
            	    System.out.println("성별) 1>남자    2>여자 : ");  // 성별
            	    int newmafe = sc.nextInt();
            	    if(newmafe != 1 && newmafe != 2) {
            	        System.out.println("잘못된 성별 입력입니다.");
            	        break;
            	    }
            	    System.out.println("email 입력  (ex: abc@gmail.com) : ");
            	    String newemail = sc.next();
            	    //이메일 정규식 검색
            	    String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            	    if (!newemail.matches(emailPattern)) {
            	        System.out.println("잘못된 이메일 형식입니다. 올바른 이메일 주소를 입력해주세요.");
            	        break;
            	    }
            	    
            	    System.out.println("전화번호 입력 (하이픈 없이 숫자만 입력) : ");
            	    String newnumber = sc.next();
            	    if (!newnumber.matches("[0-9]+")) { // .matches == 문자열이 우리가 지정한 규칙(패턴)과 맞는지 체크하는 역할
            	        System.out.println("잘못된 전화번호 형식입니다. 숫자만 입력해주세요.");
            	        break;
            	    }

            	
            	    System.out.println("여권번호 입력 (M+숫자8자리) : ");
            	    String newpassnum = sc.next();

            	    // 여권번호 형식 체크 (M으로 시작하고 뒤에 8자리 숫자)
            	    if (!newpassnum.matches("M\\d{8}")) {
            	        System.out.println("잘못된 여권번호 형식입니다. 'M' + 8자리 숫자로 입력해주세요.");
            	        break;
            	    }

            	    System.out.println("거주국가 입력 : ");
            	    String newcon = sc.next();

            	    for (int i = 0; i < 3; i++) {
            	        if (id[i] == null) {
            	            id[i] = newid; // 아디
            	            pw[i] = newpw; // 비번
            	            name[i] = newname; // 이름
            	            engname[i] = newengname; // 영문이름
            	            brith[i] = newbrith; // 생일
            	            mafe[i] = newmafe; // 성별
            	            email[i] = newemail; // email
            	            number[i] = newnumber; // 전번
            	            passnum[i] = newpassnum; // 여권번호
            	            con[i] = newcon; // 국가
            	            break;
            	        }
            	    }

            	    System.out.printf("%s 님 가입을 환영합니다", newname);
            	    break;

                 
                 
                 
                 
             case 3: //회원탈퇴
            	 System.out.println("ID >");
                 String delid = sc.next();
                 System.out.println("비밀번호 >");
                 String delpw = sc.next();
                 
                 for (int j = 0; j < 3; j++) {
                	 if (delid.equals(id[j]) && delpw.equals(pw[j])) {
                		 System.out.println("삭제하시겠습니까? Y/N");
                		 String YN = sc.next();
                		 if (YN.equals("y") || YN.equals("Y")) {
                			 id[j] = null;
                			 pw[j] = null;
                			 name[j] = null;
                			 engname[j] = null;
                			 brith[j] = null;
                			 mafe[j] = 0;
                			 email[j] = null;
                			 number[j] = null;
                			 passnum[j] = null;
                			 con[j] = null;
                			 System.out.println("삭제 되었습니다.");
                			 System.out.println("* KOREAN AIR *");
                			 break;
                		 }
                		 else if(YN.equals("n") || YN.equals("N")) {
                			 break;
                		 }
                		 else {
                			 System.out.println("제대로 된 입력값을 넣으세요");
                			 break;
                		 }
                		 
                	 }
                	 else {
                		 System.out.println("회원을 찾을 수 없습니다.");
                		 break;
                	 }
                 }break;
             case 9: // 종료
                 System.out.println("프로그램을 종료합니다.");
                 sc.close();
                 return; 

             default: //입력값 잘못
                 System.out.println("제대로 된 입력값을 넣으세요.");
                 
             } //end switch
		} //end while

	} // end psvm

} //end class
