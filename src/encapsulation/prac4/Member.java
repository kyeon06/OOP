package encapsulation.prac4;

public class Member {
    private int verificationEmailStatus;
    
    public void verifyEmail() {
        if (isEmailVerified())
            throw new AlreadyVerifiedException();
        else
            this.verificationEmailStatus = 2;
    }

    public boolean isEmailVerified() {
        return verificationEmailStatus == 2;
    }
}
