package bankOOP;

public class UserInfo {
    private String id;
    private String pw;
    private int age;
    private int money;

    // 생성자
    public UserInfo(String id, String pw, int age, int money) {
        this.id = id;
        this.pw = pw;
        this.age = age;
        this.money = money;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getPw() { return pw; }

    public void setPw(String pw) { this.pw = pw; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public int getMoney() { return money; }

    public void setMoney(int money) { this.money = money; }
}
//유저 정보 클래스
