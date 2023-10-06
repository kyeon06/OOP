package encapsulation.prac1;

public class EncapsulationAuthenticate {

    public AuthResult authenticate(String id, String pw) {
        Member mem = findOne(id);
        if (mem == null) return AuthResult.NO_MATCH;

        // 메소드를 통해 이메일 검증을 한다.
        if (!mem.isEmailVerified()) {
            return AuthResult.NO_EMAIL_VERIFIED;
        }

        if (passwordEncoder.isPasswordValid(mem.getPassword(), pw, mem.getId())) {
            return AuthResult.SUCCESS;
        }
        return AuthResult.NO_MATCH;
    }

}
