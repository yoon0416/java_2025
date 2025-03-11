package bankOOP;

public class Login implements LoginControl {
    private String[][] userData;

    public Login(String[][] userData) {
        this.userData = userData;
    }

    @Override
    public boolean login(String idInput, String pwInput) {
        for (int i = 0; i < userData.length; i++) {
            if (userData[i][0] != null && userData[i][0].equals(idInput) && userData[i][1].equals(pwInput)) {
                return true; // 로그인 성공
            }
        }
        return false; // 로그인 실패
    }
}

//로그인 성공 유무 주는 클래스