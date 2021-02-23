package _07_abstactClass_interface.thuchanh.interface_comparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircle=new ComparableCircle[3];
        comparableCircle[0]=new ComparableCircle();
        comparableCircle[1]=new ComparableCircle(5);
        comparableCircle[2]=new ComparableCircle("red",true,2);
        for(ComparableCircle circle:comparableCircle){
            System.out.println(circle);
        }
        Arrays.sort(comparableCircle);
        for(ComparableCircle circle:comparableCircle){
            System.out.println(circle);
        }
    }
}
