package encapsulation.prac3;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // NoEncapsulation
        Timer t = new Timer();
        t.startTime = System.currentTimeMillis();

        t.stopTime = System.currentTimeMillis();

        long elaspedTime = t.stopTime - t.stopTime;

        // Encapsulation
        Timer t = new Timer();
        t.start();

        t.stop();

        long time = t.elapsedTime(TimeUnit.MILLISECONDS);
    }
}
