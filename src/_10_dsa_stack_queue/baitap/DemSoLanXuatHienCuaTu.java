package _10_dsa_stack_queue.baitap;

import java.util.HashMap;
import java.util.Set;
import java.util.logging.Handler;

public class DemSoLanXuatHienCuaTu {
    public static void main(String[] args) {
        String string = "abaacdaeaffa";
        DemSoLanXuatHienCuaTu myArray = new DemSoLanXuatHienCuaTu();
        String array[] = myArray.sapXep(string);
//        for (int i = 0; i < string.length(); i++) {
//            System.out.print(array[i] + "  ");
//        }
        HashMap<String, Integer> myMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (myMap.containsKey(array[i])) {
                myMap.put(array[i], myMap.get(array[i]) + 1);
            } else {
                myMap.put(array[i], 1);
            }
        }
        Set<String> keySet = myMap.keySet();
        System.out.println(string);
        for (String key : keySet) {
            System.out.println(key + "--" + myMap.get(key));
        }

    }

    public String[] sapXep(String string) {
        string = string.toLowerCase();
        String array[] = new String[string.length()];
        for (int i = 0; i < string.length(); i++) {
            array[i] = "" + string.charAt(i);
        }
        for (int i = 0; i < string.length(); i++) {
            String temp;
            for (int j = i + 1; j < string.length(); j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
