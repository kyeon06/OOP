package encapsulation.prac4;

public class EncapsulationMain {
    public void verifyEmail(String token) {
        Member mem = findByToken(token);
        if (mem == null) throw new BadTokenException();

        mem.verifyEmail();
    }
}
