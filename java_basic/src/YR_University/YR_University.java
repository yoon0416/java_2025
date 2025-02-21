package YR_University;
import java.util.Scanner;
//수정할 거 
//1. 전역변수 배열로 수정하여 메모리 아끼기
//2. 중복된 코드 삭제
//3. 학사일정 캘린더 구글링해서 시도하기

public class YR_University {
	private static String Tnum;  //교수 번호 전역변수
	private static String name; //이름 전역변수
	private static String id; //id 전역변수
	private static String pw; //pw 전역변수
	private static String major; //소속학과 전역변수
	private static String subject; //교과목 전역변수
	private static String inputid; //입력받을 아디 전역변수
	private static String inputpw; //입력받을 비번 전역변수
	//-------------------------------------------------
	private static int number; //학번
	private static String stuname; //학생 이름
	private static String major2; //학생 전공
	private static int maj1; //전공1
	private static int maj2; //전공2
	private static int maj3; //전공3
	private static String oort; //학기
	private static int aver; //평균
	private static String gr; //학점
	private static int inputN; //학번 입력
	private static String inputstun; //학생이름
	
	
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 while (true) { //관리자창 및 입력값 무한반복
			 System.out.println("==============================");
	         System.out.println("      YR University 관리자");
	         System.out.println("------------------------------");
	         System.out.println("1> 교수등록\n2> 교수로그인\n3> 종합정보시스템 \n9> 종료");
	         System.out.println("==============================");
	         
	         int input = sc.nextInt();
	         
	         
	         switch (input) { //설정
             case 1: //추가 아이디 비번, 추가
                 System.out.println("교수 번호 입력 : ");  // 교수번호
                 Tnum = sc.next();
                 System.out.println("이름 입력 : ");  
                 name = sc.next();
                 System.out.println("id 입력 : ");  
                 id = sc.next();
                 System.out.println("pw 입력 : "); 
                 pw = sc.next();
                 System.out.println("소속학과 입력 : ");  
                 major = sc.next();
                 System.out.println("교과목 입력 : ");  
                 subject = sc.next();
                 break; //끝났으니 반복문으로 나가기
                 
	         case 2: //로그인
	        	 System.out.println("::::: 교수로그인 :::::");
	        	 System.out.println("id : "); //아디 비번 입력받기 (로그인)
	        	 inputid = sc.next();
                 System.out.println("pw : "); 
                 inputpw = sc.next();
                 
                 if (inputid.equals(id) && inputpw.equals(pw)) {
                	 System.out.printf("◆◆◆◆환영합니다 %s 교수님 종합정보시스템메뉴 이용 가능합니다.◆◆◆◆ \n",name);
                 }
                 else { //아니라면 비번 틀렸다고 하기 그리고 break문을 사용하여 반복문 탈출 후 다시 while문으로 가기
                     System.out.println("다시 확인해주세요.");
                 }
                 break; //if문 끝났으면 빠져나가기 while무한루프
             
	         case 3: //종합정보관리시스템
	        	 if (inputid.equals(id) && inputpw.equals(pw)) {
	        		 System.out.println("==============================");
		        	 System.out.println("1> 성적등록\n2> 전체성적조회\n3> 성적수정\n4> 삭제\n5> 학사일정\n5> 학사일정 \n9> 관리시스템 종료");
		        	 System.out.println("==============================");
		        	 
		        	 int input2 = sc.nextInt();
		        	 
		        	 switch (input2) {
		        	 case 1: //성적등록
		        		 System.out.println("::::::: 학생 성적등록 ::::::");
		        		 
		        		 System.out.println("학 번  > ");  // 
		        		 number = sc.nextInt();
		                 System.out.println("학생이름  > ");  // 
		                 stuname = sc.next();
		                 System.out.println("전공  > ");  // 
		                 major2 = sc.next();
		                 System.out.println("컴퓨터이해1  > ");  // 
		                 maj1 = sc.nextInt();
		                 System.out.println("컴퓨터이해2  > ");  // 
		                 maj2 = sc.nextInt();
		                 System.out.println("컴퓨터이해3  > ");  // 
		                 maj3 = sc.nextInt();
		                 System.out.println("(1학기 / 2학기)  > ");  // 
		                 oort = sc.next();
		                 
		                 aver = (maj1+maj2+maj3)/3; //평균
		                 if(aver >= 90) {
		                	 gr = "A학점"; //학점
		                 }
		                 else if(aver >= 80) {
		                	 gr = "B학점";
		                 }
		                 else if(aver >= 70) {
		                	 gr = "C학점";
		                 }
		                 else if(aver >= 60) {
		                	 gr = "D학점";
		                 }
		                 else {
		                	 gr = "F학점";
		                 }
		                 
		                 break;
		                 
		        	 case 2: //전체성적조회
		        		    System.out.println("=============================전체 성적조회===============================");
		        		    System.out.println("학번 이름 전공 컴퓨터이해A 컴퓨터이해B 컴퓨터이해C 총점 평균 학점 학기 졸업여부 석차");
		        		    System.out.println("======================================================================");
		        		    System.out.printf("%d   %s  %s     %d        %d       %d      %d %d   %s %s  졸업예정 석차정보\n", //학점도 조건문 써서 으아아아
		        	                  number, stuname, major2, maj1, maj2, maj3,
		        	                  maj1 + maj2 + maj3, (maj1 + maj2 + maj3) / 3, gr, oort);


		        		    break;
		        		    
		        		case 3: //성적수정
		        			System.out.println(":::::성적수정:::::");
		        			System.out.println("학번 >");
		        			inputN = sc.nextInt();
		        			System.out.println("학생이름 >");
		        			inputstun = sc.next();
		        			 
		        			if (inputN == number && inputstun.equals(stuname)) { //학번 학생이름
		        				 System.out.println("◆◆◆조회결과◆◆◆");
		        				 System.out.printf("%d %s %s \n",number,stuname,major2);
		        				 System.out.println("학생 정보를 수정하시겠습니까? (Y / N)");
		        				 String YN = sc.next();
		        				 if(YN.equals("y") || YN.equals("Y")) { //y눌렀다면 삭제절차 equals 안쓰고 == 했다고 실행 안하는거봐 싸가지 
		                      	   System.out.println("컴퓨터이해A > ");
		                      	   maj1 = sc.nextInt();
		                      	   System.out.println("컴퓨터이해B > ");
		                      	   maj2 = sc.nextInt();
		                      	   System.out.println("컴퓨터이해C > ");
		                      	   maj3 = sc.nextInt();
		                      	   System.out.println("(1학기 / 2학기) ");
		                      	   oort = sc.next();
		                      	   
		                      	 int total = maj1 + maj2 + maj3; //총점
		                         aver = total / 3; //평균 다시

		                        
		                         if (aver >= 90) {
		                             gr = "A학점";
		                         } 
		                         else if (aver >= 80) {
		                             gr = "B학점";
		                         } 
		                         else if (aver >= 70) {
		                             gr = "C학점";
		                         } 
		                         else if (aver >= 60) {
		                             gr = "D학점";
		                         } 
		                         else {
		                             gr = "F학점";
		                         }

		                      	   
		                      	   System.out.println("성적 수정완료!!!!!!!");
		                      	   break;
		                      	   
		                         }
		                         else { //n이던 뭐던 y아니면 나가기
		                      	   break;
		                         }
		        			 }
		        			else {
		        				System.out.println("다시 확인해주세요.");
		        			}
		        			break;

		        		case 4: //삭제
		        			System.out.println("학생정보를 삭제하시겠습니까? (Y / N)");
		        			String YN = sc.next();
		        			if(YN.equals("y") || YN.equals("Y")) {
		        				number = 0;
		        				major2 = null;
		        				maj1 = 0;
		        				maj2 = 0;
		        				maj3 = 0;
		        				oort = null;
		        				aver = 0;
		        				gr = null;
		        				
		        			}
		        			else {
		        				break;
		        			}
		        			
		        		case 5: //학사일정
		        		    	

		        		 
		        	 case 9: //관리시스템 종료
		                    System.out.println("프로그램을 종료합니다.");
		                    break;
		        	
		        	 default: //입력값 이상하면
		                 System.out.println("제대로 된 입력값을 넣으세요.");
		        	 } //end switch
                 }
                 else { //아니라면 비번 틀렸다고 하기 그리고 break문을 사용하여 반복문 탈출 후 다시 while문으로 가기
                     System.out.println("다시 확인해주세요.");
                 }
                 break; //if문 끝났으면 빠져나가기 while무한루프
	        	 
                 
                	 
	         case 9: //종료
                 System.out.println("프로그램을 종료합니다.");
                 sc.close(); //입력 이제 안받음
                 return; // 종료 시 프로그램 종료
             
             default: //입력값 이상하면
                 System.out.println("제대로 된 입력값을 넣으세요.");	 
                	 
                	 
	         } //end switch
		 } //end while
	} //end psvm

} //end class
