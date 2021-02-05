package _04_class_object.baitap;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class StopWatch {
    public static void main(String[] args) {
        Watch myWatch=new Watch();
        Instant start=myWatch.start();
        System.out.println("start time: "+start);
        double arr[]=new double[10000];
        for (int i=0; i<10000; i++){
            arr[i]=Math.random();
        }
        Instant stop=myWatch.stop();
        System.out.println("stop time: "+stop);
        myWatch.getElapsedTime(start,stop);
    }
}
