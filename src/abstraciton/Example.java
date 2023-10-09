package abstraciton;

public class Example {
    /**
     * 추상화 하지 않을 경우
     * 요구사항 변경에 따라 주문 취소 코드를 추가해야함
     */
    private SmsSender smsSender;
    // kakao push
    private KakaoPush kakaoPush;

    public void cancel(String ono) {
//        smsSender.sendSms(...);
        if (pushEnabled) {
            kakaoPush.push(...);
        } else {
            smsSender.push(...);
        }
    }

    /**
     * 추상화 했을 경우 : 첫번째
     */
    public void cancel2(String ono) {
        Notifier notifier = getNotifier(...);
        notifier.notify(...);
    }

    private Notifier getNotifier(...) {
        if(pushEnabled) {
            return new KakaoNotifier();
        } else {
            return new SmsNotifier();
        }
    }

    /**
     * 사용할 대상 접근도 추상화 했을 경우
     * 통지 방식이 바뀌더라도 , 주문 취소 로직은 바뀌지 않게 만드는 것
     * 이런 유연함을 제공하는게 추상화!
     */
    public void cancel2(String ono) {
        Notifier notifier = NotifierFactory.instance().getNotifier(...);
        notifier.notify(...);
    }

    public interface NotifierFactory {
        Notifier getNotifier(...);

        static Example.NotifierFactory instance() {
            return new DefalutNotifierFactory();
        }
    }

    public class DefaultNotifierFactory {
        public Notifier getNotifier() {
            if (pushEnabled) return new KakaoNotifier();
            else return new SmsNotifier();
        }
    }



}
