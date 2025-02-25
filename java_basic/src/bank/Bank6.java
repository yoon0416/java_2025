// bank6는 각 기능에 따라 클래스를 따로 만든 후 메소드 호출방식으로 함 상속으로 할려 했지만 헷갈려서 koreaAir프로젝트 때 하던 것처럼 함
// main에서 id[] 배열을 만든 후, 그 배열을 join(id)로 넘겨주면,
// join 메소드에서는 넘겨받은 id[] 배열을 그대로 사용해서 아이디를 출력하거나 처리할 수 있습니다.
// 그래서 join 메소드의 매개변수 id는 main에서 넘겨준 id[] 배열의 값을 그대로 받게 됩니다.
// 매개변수를 사용하지 않고 같은 동작을 구현하려면, 메소드 내에서 데이터를 직접 생성하거나 전역 변수를 사용해야 합니다.
// 공부할 거 동적배열, dtu? 개념, 컨트롤파트 예시문제들

package bank;
import java.util.Scanner;

// 회원가입 클래스
class MemberJoin {
    public void join(String[] id, String[] pw, int[] age, int[] money) { //스캐너로 입력받는 값이 매개변수로 들어옴  
        Scanner sc = new Scanner(System.in);
        
        System.out.println("아이디 입력 : ");
        String newId = sc.next();
        System.out.println("비밀번호 입력 : ");
        String newPw = sc.next();
        System.out.println("나이 입력 : ");
        int newAge = sc.nextInt();
        System.out.println("잔액 입력 : ");
        int newMoney = sc.nextInt();

        // 빈 자리에 새로운 계좌 정보를 추가
        for (int i = 0; i < 3; i++) {
            if (id[i] == null) {
                id[i] = newId;
                pw[i] = newPw;
                age[i] = newAge;
                money[i] = newMoney;
                System.out.println("회원가입이 완료되었습니다.");
                break;
            }
        }
    } //end public void join 메소드/ public =오픈 void = 값 반환 없 
} //end class memberjoin

// 로그인 기능 클래스 아직 호출 안함 어캐해야할지 막막
class Login {
    public boolean login(String[] id, String[] pw, String idInput, String pwInput) {
        boolean fine = false; 
        for (int i = 0; i < 3; i++) {
            if (id[i] != null && id[i].equals(idInput) && pw[i].equals(pwInput)) {
                fine = true;
                break;
            }
        }
        return fine;
    } //end login 메소드
    
} //end login class

// 계좌 조회 클래스
class AccountView {
    public void view(String[] id, String[] pw, int[] age, int[] money, String idInput, String pwInput) {
        for (int i = 0; i < 3; i++) {
            if (id[i] != null && id[i].equals(idInput) && pw[i].equals(pwInput)) {
                System.out.println("계좌 조회");
                System.out.println("아이디 : " + id[i]);
                System.out.println("비밀번호 : " + pw[i]);
                System.out.println("나이 : " + age[i]);
                System.out.println("잔액 : " + money[i]);
                break;
            }
        }
    } //end view 메소드
} //end AccountView class

// 입금 클래스
class Deposit {
    public void deposit(String[] id, String[] pw, int[] money, String idInput, String pwInput) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            if (id[i] != null && id[i].equals(idInput) && pw[i].equals(pwInput)) {
                System.out.println("입금할 금액 : ");
                int plus = sc.nextInt();
                money[i] += plus; // 입금 처리
                System.out.println("입금 완료! 현재 잔액 : " + money[i]);
                break;
            }
        }
    } //end 메소드
}//end class

// 출금 클래스
class Withdraw {
    public void withdraw(String[] id, String[] pw, int[] money, String idInput, String pwInput) {
        Scanner sc = new Scanner(System.in);
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
                break;
            }
        }
    }//end 메소드
}//end class

// 계좌 삭제 클래스
class AccountDelete {
    public void delete(String[] id, String[] pw, int[] age, int[] money, String idInput, String pwInput) {
        Scanner sc = new Scanner(System.in);
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
                break;
            }
        }
    }//end 메소드
} //end class



// 은행 psvm 클래스
public class Bank6 {
    public static void main(String[] args) {

        String[] id = new String[3]; // 사용자 id 배열 3칸 선언
        String[] pw = new String[3]; // 사용자 비번 배열 3칸 선언
        int[] age = new int[3]; // 사용자 나이 배열 3칸 선언
        int[] money = new int[3]; // 사용자 잔액 배열 3칸 선언
        boolean fine = false; // 로그인 성공 여부 확인

        Scanner sc = new Scanner(System.in);
        String idInput = "";
        String pwInput = "";

        // 각 기능에 해당하는 클래스들 호출할꺼임 헷갈리니까 호출명은 클래스명과 동일
        MemberJoin memberJoin = new MemberJoin();
        Login login = new Login();
        AccountView accountView = new AccountView();
        Deposit deposit = new Deposit();
        Withdraw withdraw = new Withdraw();
        AccountDelete accountDelete = new AccountDelete();

        while (true) { // 기본으로 은행서비스 선택하는 창과 입력값 무한반복
            System.out.println("======BANK======");
            System.out.println("* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력>>>");

            int input = sc.nextInt(); // 은행서비스를 뭐 쓸꺼냐?

            // 로그인 기능
            if (input == 2 || input == 3 || input == 4 || input == 5) { 
                // 아이디와 비밀번호 입력 받기
                System.out.println("아이디 입력 : ");
                idInput = sc.next();
                System.out.println("비밀번호 입력 : ");
                pwInput = sc.next();

                fine = login.login(id, pw, idInput, pwInput); 
                if (!fine) {
                    System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
                    continue; // 로그인 실패 시 다시 메뉴로 돌아감
                }
            }

            switch (input) {
                case 1: // 추가: 아이디, 비밀번호, 나이, 잔액 입력
                    memberJoin.join(id, pw, age, money); //스캐너로 입력받고 메소드 매개변수에 넣음 그리고 메소드 안에 있는 for문으로 인덱스 번호 붙여줌
                    break;

                case 2: // 조회
                    if (fine) {
                        accountView.view(id, pw, age, money, idInput, pwInput);
                    }
                    break;

                case 3: // 입금
                    if (fine) {
                        deposit.deposit(id, pw, money, idInput, pwInput);
                    }
                    break;

                case 4: // 출금
                    if (fine) {
                        withdraw.withdraw(id, pw, money, idInput, pwInput);
                    }
                    break;

                case 5: // 계좌 삭제
                    if (fine) {
                        accountDelete.delete(id, pw, age, money, idInput, pwInput);
                    }
                    break;

                case 9: // 종료
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return; 

                default: //입력값 잘못
                    System.out.println("제대로 된 입력값을 넣으세요.");
            }
        }
    }
}
