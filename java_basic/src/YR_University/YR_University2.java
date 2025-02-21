package YR_University;
import java.util.Scanner;

public class YR_University2 {
    public static void main(String[] args) {
        //--------교수---------
        String[] Tnum = new String[3]; // 교수 번호
        String[] name = new String[3]; // 교수 이름
        String[] id = new String[3]; // 교수 아이디
        String[] pw = new String[3]; // 교수 비밀번호
        String[] major = new String[3]; // 소속학과
        String[] subject = new String[3]; // 교과목

        //--------학생---------
        int[] number = new int[3];// 학번
//        int[] number = {0,0,0};
        String[] stuname = new String[3]; // 학생 이름
//        String[] stuname = {null,null,null};
        String[] marjor2 = new String[3]; // 학생 전공
//        String[] marjor2 = {null,null,null};
        int[] maj1 = new int[3]; // 전공1
//        int[] maj1 = {0,0,0};
        int[] maj2 = new int[3]; // 전공2
//        int[] maj2 = {0,0,0};
        int[] maj3 = new int[3]; // 전공3
//        int[] maj3 = {0,0,0};
        String[] oort = new String[3]; // 학기
//        String[] oort = {null,null,null};
        int[] aver = new int[3]; // 평균
//        int[] aver = {0,0,0};
        String[] gr = new String[3]; // 학점
//        String[] gr = {null,null,null};

        //--------입력---------
        String inputid = ""; // 입력받을 아디
        String inputpw = ""; // 입력받을 비번
        int inputN = 0; // 학번 입력
        String inputstun = ""; // 학생 이름

        Scanner sc = new Scanner(System.in);

        while (true) { // 무한 반복
            System.out.println("==============================");
            System.out.println("      YR University 관리자");
            System.out.println("------------------------------");
            System.out.println("1> 교수등록\n2> 교수로그인\n3> 종합정보시스템 \n9> 종료");
            System.out.println("==============================");

            int input = sc.nextInt();

            switch (input) {
                case 1: // 교수 등록
                    System.out.println("교수 번호 입력 : ");  // 교수번호
                    String newTnum = sc.next();
                    System.out.println("이름 입력 : ");
                    String newname = sc.next();
                    System.out.println("id 입력 : ");
                    String newid = sc.next();
                    System.out.println("pw 입력 : ");
                    String newpw = sc.next();
                    System.out.println("소속학과 입력 : ");
                    String newmajor = sc.next();
                    System.out.println("교과목 입력 : ");
                    String newsubject = sc.next();

                    for (int i = 0; i < 3; i++) {
                        if (id[i] == null) {
                            Tnum[i] = newTnum;
                            name[i] = newname;
                            id[i] = newid;
                            pw[i] = newpw;
                            major[i] = newmajor;
                            subject[i] = newsubject;
                            break;
                        }
                    }
                    break;

                case 2: // 로그인
                    System.out.println("::::: 교수 로그인 :::::");
                    System.out.println("id : "); // 아디 비번 입력받기 (로그인)
                    inputid = sc.next();
                    System.out.println("pw : ");
                    inputpw = sc.next();

                    boolean loginSuccess = false; // 로그인 성공 여부를 추적할 변수 bank할 때 씀

                    for (int i = 0; i < 3; i++) {
                        if (id[i] != null && id[i].equals(inputid) && pw[i].equals(inputpw)) {
                            System.out.printf("◆◆◆◆ 환영합니다 %s 교수님 ◆◆◆◆ \n", name[i]);
                            loginSuccess = true;
                            break; // 로그인 성공 시 반복문 종료
                        }
                    }

                    if (!loginSuccess) {
                        System.out.println("아이디 또는 비밀번호가 틀립니다. 다시 시도해 주세요.");
                    }
                    break;

                case 3: // 종합정보시스템
                	for (int i = 0; i < 3; i++) {
                	 if (inputid.equals(id[i]) && inputpw.equals(pw[i])) {
    	        		 System.out.println("==============================");
    		        	 System.out.println("1> 성적등록\n2> 전체성적조회\n3> 성적수정\n4> 삭제\n5> 학사일정 \n9> 관리시스템 종료");
    		        	 System.out.println("==============================");
    		        	 
    		        	 int input2 = sc.nextInt();
    		        	 
    		        	 switch (input2) {
    		        	 case 1: //성적등록
    		        		    System.out.println("::::::: 학생 성적등록 ::::::");

    		        		    for (i = 0; i < 3; i++) {
    		        		        if (number[i] == 0) { // 학번이 0인 자리만 채움 우리가 초기값 0으로 했으니
    		        		            System.out.println("학 번  > ");
    		        		            number[i] = sc.nextInt();

    		        		            System.out.println("학생이름  > ");
    		        		            stuname[i] = sc.next();

    		        		            System.out.println("전공  > ");
    		        		            marjor2[i] = sc.next();

    		        		            System.out.println("컴퓨터이해1  > ");
    		        		            maj1[i] = sc.nextInt();

    		        		            System.out.println("컴퓨터이해2  > ");
    		        		            maj2[i] = sc.nextInt();

    		        		            System.out.println("컴퓨터이해3  > ");
    		        		            maj3[i] = sc.nextInt();

    		        		            System.out.println("(1학기 / 2학기)  > ");
    		        		            oort[i] = sc.next();

    		        		            aver[i] = (maj1[i] + maj2[i] + maj3[i]) / 3; //평균 계산

    		        		            if (aver[i] >= 90) {
    		        		                gr[i] = "A학점";
    		        		            } else if (aver[i] >= 80) {
    		        		                gr[i] = "B학점";
    		        		            } else if (aver[i] >= 70) {
    		        		                gr[i] = "C학점";
    		        		            } else if (aver[i] >= 60) {
    		        		                gr[i] = "D학점";
    		        		            } else {
    		        		                gr[i] = "F학점";
    		        		            }

    		        		            break; // 첫 번째 비어있는 자리를 찾았을 때만 입력받고 종료
    		        		        }
    		        		    }
    		        		    break;

    		        		
    		        	 case 2: // 전체성적조회
    		        		    System.out.println("=============================전체 성적조회===============================");
    		        		    System.out.println("학번 이름 전공 컴퓨터이해A 컴퓨터이해B 컴퓨터이해C 총점 평균 학점 학기 졸업여부 석차");
    		        		    System.out.println("======================================================================");

    		        		    for (i = 0; i < 3; i++) {
    		        		        // 학생 정보가 제대로 입력되었는지 확인
    		        		        if (number[i] != 0 && stuname[i] != null && marjor2[i] != null) { 
    		        		            int totalScore = maj1[i] + maj2[i] + maj3[i];
    		        		            String grade = gr[i];
    		        		            String semester = oort[i];
    		        		    System.out.printf("%d   %s  %s    %d     %d    %d     %d  %d  %s  %s  졸업예정  석차정보\n", 
    		        		                number[i], stuname[i], marjor2[i], maj1[i], maj2[i], maj3[i],
    		        		                totalScore, (totalScore) / 3, grade, semester);
    		        		        }
    		        		    }
    		        		    break;

    		        		 
    		        	 case 3: //성적수정
    		        		System.out.println(":::::성적수정:::::");
 		        			System.out.println("학번 >");
 		        			inputN = sc.nextInt();
 		        			System.out.println("학생이름 >");
 		        			inputstun = sc.next();
 		        			
 		        			for(i=0; i<3; i++) { //배열찾기
 		        			if (inputN == number[i] && inputstun.equals(stuname[i])) { //학번 학생이름
 		        				 System.out.println("◆◆◆조회결과◆◆◆");
		        				 System.out.printf("%d %s %s \n",number,stuname,marjor2[i]);
		        				 System.out.println("학생 정보를 수정하시겠습니까? (Y / N)");
		        				 String YN = sc.next();
		        				 if(YN.equals("y") || YN.equals("Y")) { //y눌렀다면 삭제절차 equals 안쓰고 == 했다고 실행 안하는거봐 싸가지 
			                      	   System.out.println("컴퓨터이해A > ");
			                      	   maj1[i] = sc.nextInt();
			                      	   System.out.println("컴퓨터이해B > ");
			                      	   maj2[i] = sc.nextInt();
			                      	   System.out.println("컴퓨터이해C > ");
			                      	   maj3[i] = sc.nextInt();
			                      	   System.out.println("(1학기 / 2학기) ");
			                      	   oort[i] = sc.next();
			                      	   
			                      	 int[] total = new int[3]; 
			                      	 total[i] = maj1[i] + maj2[i] + maj3[i]; //총점
			                         aver[i] = total[i] / 3; //평균 다시
			                         
			                         if (aver[i] >= 90) {
			                             gr[i] = "A학점";
			                         } 
			                         else if (aver[i] >= 80) {
			                             gr[i] = "B학점";
			                         } 
			                         else if (aver[i] >= 70) {
			                             gr[i] = "C학점";
			                         } 
			                         else if (aver[i] >= 60) {
			                             gr[i] = "D학점";
			                         } 
			                         else {
			                             gr[i] = "F학점";
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
 		        			} break;
    		        	 
    		        		 
    		        	 case 4: //삭제
    		        		System.out.println(":::::학생정보 삭제:::::");
  		        			System.out.println("학번 >");
  		        			inputN = sc.nextInt();
  		        			System.out.println("학생이름 >");
  		        			inputstun = sc.next();
  		        			for(i=0; i<3; i++) { //배열찾기
  	 		        			if (inputN == number[i] && inputstun.equals(stuname[i])) { //학번 학생이름
  	 		        				 System.out.println("◆◆◆조회결과◆◆◆");
  			        				 System.out.printf("%d %s %s \n",number,stuname,marjor2[i]);
  			        				 System.out.println("학생 정보를 수정하시겠습니까? (Y / N)");
  			        				 String YN = sc.next();
  			        				 
  			        				if(YN.equals("y") || YN.equals("Y")) {
  			        					number[i] = 0;
  				        				marjor2[i] = null;
  				        				maj1[i] = 0;
  				        				maj2[i] = 0;
  				        				maj3[i] = 0;
  				        				oort[i] = null;
  				        				aver[i] = 0;
  				        				gr[i] = null;
  				        				
  				        			}
  				        			else {
  				        				break;
  				        			}
  			        				 
  			        				 }
  	 		        			}
    		        		 
    		        		 
    		        		 
    		        	 case 5: //학사일정
    		        	 
    		        	 case 9: //관리시스템 종료
    		        		System.out.println("프로그램을 종료합니다.");
 		                    break;
 		                    
    		        	 default: // 입력값 이상하면
    		                    System.out.println("제대로 된 입력값을 넣으세요.");	 
    		        	 }
    		        	 
                	 }
                	}
                    break; //case 3 브레이크

                case 4: // 삭제

                    break;

                case 5: // 학사일정
                    
                    break;

                case 9: // 관리자 시스템 종료
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default: // 입력값 이상하면
                    System.out.println("제대로 된 입력값을 넣으세요.");
            } // end switch(input)
        } // end while
    } // end main
} // end class
