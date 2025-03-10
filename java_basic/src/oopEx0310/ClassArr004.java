package oopEx0310;

class Score {
    String name;
    int kor, eng, math;
    double avg;
    String pass;

    public Score() {
        super();
    }

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // 평균 계산 메서드
    public void vud() {
        this.avg = (kor + eng + math) / 3.0;
    }

    // 합격/불합격 계산 메서드
    public void hap() {
        if (avg >= 60) {
            this.pass = "합격";
        } else {
            this.pass = "불합격";
        }
    }
}

class ScoreProcess {
    // 평균을 구하는 메서드
    void process_avg(Score[] std) {
        for (Score student : std) {
            student.vud();
        }
    }

    // 합격 여부를 구하는 메서드
    void process_pass(Score[] std) {
        for (Score student : std) {
            student.hap();
        }
    }
}

class ScorePrint {
    // 학생 정보 출력 메서드
    void show(Score[] std) {
        System.out.println("이름\t국어\t영어\t수학\t평균\t합격여부");
        for (Score student : std) {
            // 평균을 소수점 두 자리로 출력
            System.out.printf("%s\t%d\t%d\t%d\t%.2f\t%s\n", student.name, student.kor, student.eng, student.math, student.avg, student.pass);
        }
    }
}

public class ClassArr004 {
    public static void main(String[] args) {
        // 3명의 학생 정보 생성
        Score[] std = new Score[3];
        std[0] = new Score("아이언맨", 100, 100, 100);
        std[1] = new Score("헐크", 90, 60, 80);
        std[2] = new Score("블랙팬서", 20, 60, 90);

        // 성적 처리
        ScoreProcess process = new ScoreProcess();
        process.process_avg(std);  
        process.process_pass(std); 

       //성적출력
        ScorePrint print = new ScorePrint();
        print.show(std);  
    }
}
