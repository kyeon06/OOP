package encapsulation.prac3;

import java.util.concurrent.TimeUnit;

public class Timer {

    public long startTime;
    public long stopTime;

    // Encapsulation
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }

    public long elapsedTime(TimeUnit unit) {
        switch (unit) {
            case MILLISECONDS:
                return stopTime - startTime;
            case NANOSECONDS:
                ...
        }
    }
}
