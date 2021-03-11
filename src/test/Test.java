package test;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        String x = "   CodeGym_Viet_Nam    ";
        x = x.trim();
        int index = x.indexOf("_");
        System.out.println(index);
        String y = x.substring(0, index);
        System.out.println(y);
    }
}

