package com.company.java011_ex;

class Score2Process {
    // 평균 처리
    public void process_avg(Score2[] std) { //주소 따라가서 데이터 수정할게
//		   System.out.println("process_avg 주소확인: "+System.identityHashCode(std));
		for(int i =0; i<std.length; i++) {   
    	std[i].setAvg((std[i].getKor()+std[i].getEng()+std[i].getMath())/3.0);
		}
    }

  //합격여부
    public void process_pass(Score2[] std) {
//		   System.out.println("process_pass 주소확인: "+System.identityHashCode(std));
    	for(int i = 0; i<std.length; i++) {	
    	std[i].setPass(std[i].getAvg()>=60?"합격":"불합격");
    	}
    }
}//end class

class Score2Print {
    // 출력
    public void show(Score2[] std) {
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 평균 \t 합격여부");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        for (Score2 s : std) {
            System.out.printf("%s \t %d \t %d \t %d \t %.1f \t %s\n", s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getAvg(), s.getPass());
        }
    }
}//end class

public class ClassArrEx2 {

	public static void main(String[] args) {
		//MVC
		 ////// MODEL(저장소)
		   Score2[] std = new Score2[3];  
		   // 0번째에는 아이언맨 정보넣기  - "아이언맨", 100, 100, 100
		   std[0] = new Score2("아이언맨", 100, 100, 100);
		   // 1번째에는 아이언맨 정보넣기  - "헐크", 90, 60, 80
		   std[1] = new Score2("헐크", 90, 60, 80);
		   // 2번째에는 아이언맨 정보넣기  - "블랙팬서", 20, 60, 90
		   std[2] = new Score2("블랙팬서", 20, 60, 90);
		   
		   
		   ////// CONTROLLER - 처리 해결사 Controller)
//		   System.out.println("main 주소확인: "+System.identityHashCode(std));
		   Score2Process process = new Score2Process();
		   process.process_avg(std); 
		   process.process_pass(std); 
		   process.process_pass(std);  
		   
		   ////// VIEW       - CONSOLE , WEB
		   Score2Print  print = new Score2Print();
		   print.show(std);  


	}

}
/*
ㅁ출력된 화면
:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
이름   국어   영어   수학   평균   합격여부
:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
아이언맨   100   100   100   100.0   합격
헐크   90   60   80   76.0   합격
블랙팬서   20   60   90   56.0   불합격
*/