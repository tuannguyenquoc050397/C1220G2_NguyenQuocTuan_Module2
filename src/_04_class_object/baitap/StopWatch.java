package _04_class_object.baitap;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class StopWatch {
    public static void main(String[] args) {
        Watch myWatch=new Watch();
        Instant start=myWatch.start();
        System.out.println("start time: "+start);

        for (int i=0; i<100000; i++){

        }
        Instant stop=myWatch.stop();
        System.out.println("stop time: "+stop);
        myWatch.getElapsedTime(start,stop);
    }
}
