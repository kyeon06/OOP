package encapsulation.prac4;

public class NoEncapsulationMain {
    public void verifyEmail(String token) {
        Member mem = findByToken(token);
        if (mem == null) throw new BadTokenException();

        // isEamilVerified()로 바꾼다고 해도 코드 구조가 여전히 그대로임
        // 데이터를 가져온 후 판단한 후 데이터를 바꾸는 패턴은 통으로 캡슐화를 시도하는 것이 좋을 것이라고 판단
        if (mem.getVerificationEmailStatus() == 2) {
            throw new AlreadyVerifiedException();
        } else {
           // set 으로 데이터를 직접 바꿔주고 있음
            mem.setVerificationEmailStatus(2);
        }
    }
}
