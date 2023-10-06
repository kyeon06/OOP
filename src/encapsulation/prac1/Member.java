package encapsulation.prac1;

public class Member {
    private int verificationEmailStatus;

    public boolean isEmailVerified() {
        return verificationEmailStatus == 2;
    }
}
