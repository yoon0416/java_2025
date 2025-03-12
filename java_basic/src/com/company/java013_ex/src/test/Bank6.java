package test;
// 안부르거나 id를 main에서 선언 안한다면 결론적으로 매개변수 ids 값은 null?

class MemberJoin {
    public void join(String[] id) {  // 'ids'는 매개변수
        // 'ids'는 main 메소드에서 전달된 배열
        System.out.println(   System.identityHashCode(id)  );
        for (int i = 0; i < id.length; i++) {
            System.out.println("회원 아이디: " + id[i]);  // 'ids' 배열을 사용
        }
    }
}

public class Bank6 {
    public static void main(String[] args) {
        String[] id = new String[3];  // 'id' 배열 생성
     //   id[0] = "홍길동";
       // id[1] = "김철수";
        //id[2] = "박영희";

        MemberJoin memberJoin = new MemberJoin();
        memberJoin.join(id);  // 'id' 배열을 'join' 메소드로 전달
        System.out.println(   System.identityHashCode(id)  );
    }
}
