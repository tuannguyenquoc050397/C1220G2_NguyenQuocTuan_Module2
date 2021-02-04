package test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class test {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();
        System.out.println(start);
        int count=0;

        for (byte i=0; i<100; i++){
            count++;
        }
        LocalDateTime end = LocalDateTime.now();
        System.out.println(end);
        Duration timeElapsed = Duration.between(start, end);
        System.out.println(timeElapsed.toMillis());
    }
}
