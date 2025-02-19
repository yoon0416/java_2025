package test;
import java.util.Scanner;
//수정할 거 private를 배열 3명잡고 만들기 메인 안으로 넣기` > 완료
//메소드 말고 제어문으로 중복코드 삭제 > if문 사용 만약 input값이 2 or 3 or 4 or 5라면 아디입력 비번입력 나오게하고 
//아디 비번 맞는지 확인은 case 2 3 4 5 안에서 하면 됨 완료!!!
//그냥 처음에 로그인 했을경우 나머지 기능 비번 안쓰게 but 1, 9case는 로그인 없이도 사용 가능하게 만들면 중복코드 줄일 수 있지 않을까?
// > 구현할려고 하니까 새로만든 코드에서 로그인창만 뜨고 다른건 안 넘어감 다른 방법을 찾아보자
// 내가 부족한 점 : 출력문대로 만들라면 만들 수 있으나 여태 코드리뷰하고 메모리관리나 중복된 코드 제거 등 코드 수정을 한 적이 손에 꼽을 정도록 적음.

public class Bank3 {
    public static void main(String[] args) {

        String[] id = new String[3]; // 사용자 id 배열 3칸 선언
        String[] pw = new String[3]; // 사용자 비번 배열 3칸 선언
        int[] age = new int[3]; // 사용자 나이 배열 3칸 선언
        int[] money = new int[3]; // 사용자 잔액 배열 3칸 선언
        boolean fine = false; // 로그인 성공 여부 확인

        Scanner sc = new Scanner(System.in);

        while (true) { // 기본으로 은행서비스 선택하는 창과 입력값 무한반복
            System.out.println("======BANK======");
            System.out.println("* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력>>>");

            int input = sc.nextInt(); // 은행서비스를 뭐 쓸꺼냐?

            // 2, 3, 4, 5일 경우 먼저 아이디와 비밀번호 입력받기
            String idInput = "";
            String pwInput = "";
            if (input == 2 || input == 3 || input == 4 || input == 5) { //만약 은행서비스 선택이 2 3 4 5면
                System.out.println("아이디 입력 : "); //로그인
                idInput = sc.next();
                System.out.println("비밀번호 입력 : ");
                pwInput = sc.next();
            }

            fine = false; // 로그인 성공 여부 초기화

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

                    for (int i = 0; i < 3; i++) {
                        if (id[i] == null) {
                            id[i] = newId;
                            pw[i] = newPw;
                            age[i] = newAge;
                            money[i] = newMoney;
                            break;
                        }
                    }
                    break;

                case 2: // 조회
                	//그 여기에 로그인 if문으로 했던거 들어감
                    for (int i = 0; i < 3; i++) {  //3개 계정중
                        if (id[i] != null && id[i].equals(idInput) && pw[i].equals(pwInput)) { //아디비번 맞고 빈값 아니면 실행
                            System.out.println("계좌 조회");
                            System.out.println("아이디 : " + id[i]);
                            System.out.println("비밀번호 : " + pw[i]);
                            System.out.println("나이 : " + age[i]);
                            System.out.println("잔액 : " + money[i]);
                            fine = true; 
                            break;
                        }
                    }
                    if (!fine) {
                        System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
                    }
                    break;

                case 3: // 입금
                    // 그 여기에 로그인 if문으로 했던거 들어감
                    for (int i = 0; i < 3; i++) {
                        if (id[i] != null && id[i].equals(idInput) && pw[i].equals(pwInput)) {
                            System.out.println("입금할 금액 : ");
                            int plus = sc.nextInt();
                            money[i] += plus; // 입금 처리
                            System.out.println("입금 완료! 현재 잔액 : " + money[i]);
                            fine = true;
                            break;
                        }
                    }
                    if (!fine) {
                        System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
                    }
                    break;

                case 4: // 출금
                    // 그 여기에 로그인 if문으로 했던거 들어감
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
                    }
                    if (!fine) {
                        System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
                    }
                    break;

                case 5: // 계좌 삭제
                    // 그 여기에 로그인 if문으로 했던거 들어감
                    for (int i = 0; i < 3; i++) {
                        if (id[i] != null && id[i].equals(idInput) && pw[i].equals(pwInput)) {
                            System.out.println("계좌를 삭제하시겠습니까? (Y / N)");
                            String YN = sc.next();
                            if (YN.equals("y") || YN.equals("Y")) {
                                id[i] = null;
                                pw[i] = null;
                                age[i] = 0;
                                money[i] = 0;
                                System.out.println("계좌가 삭제되었습니다.");
                            }
                            fine = true;
                            break;
                        }
                    }
                    if (!fine) {
                        System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
                    }
                    break;

                case 9: // 종료
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return; // 종료 시 프로그램 종료

                default: // 입력값 이상하면
                    System.out.println("제대로 된 입력값을 넣으세요.");
            }
        }
    }
}
// 전역변수 대신 배열을 사용하여 메모리를 좀 더 아끼고
// 중복된 코드를 if문을 사용하여 특정 case에만 실행되게 수정함 다음엔 메소드를 사용해서 수정해볼 예정 2025.02.19