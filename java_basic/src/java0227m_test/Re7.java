package java0227m_test;

public class Re7 {
    public static void hi(String a) { //void가 아니라  string으로 리턴값 해야할 거 같은디
        if (a == null) {
            System.out.println("hi");
        } else if (a.equals("sally")) {
            System.out.println("hi "+a);
        } else {
            System.out.println("hi " + a + " 님!");
        }
    }

    public static void main(String[] args) {
        hi(null);          // hi 출력
        hi("1");           // hi 1 님! 출력
        hi("sally");       // hi sally 출력
        //sysout형식으로 어캐하지
    }
}
