package test;

import _11_java_collection_framework.thuchanh.Student;
import javafx.scene.shape.Cylinder;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.*;

public class SapXepNamNuNS {
//    public static class MyObject implements Comparable<MyObject> {
//
//        private Date dateTime;
//
//        public Date getDateTime() {
//            return dateTime;
//        }
//
//        public void setDateTime(Date datetime) {
//            this.dateTime = datetime;
//        }
//
//        @Override
//        public int compareTo(MyObject o) {
//            return getDateTime().compareTo(o.getDateTime());
//        }
//    }

    public static void main(String[] args) throws Exception {
//        String date1="05/03/1997";
//        String date2="05/07/1997";
//        String date3="05/03/1992";
//        Date date01=new SimpleDateFormat("dd/MM/yyyy").parse(date1);
//        Date date02=new SimpleDateFormat("dd/MM/yyyy").parse(date2);
//        Date date03=new SimpleDateFormat("dd/MM/yyyy").parse(date3);
        List<Person> queue=new LinkedList<>();
        List<Person> listMale=new LinkedList<>();
        queue.add(new Person("A","01/03/1997","Nam"));
        queue.add(new Person("A","05/03/1997","Nu"));
        queue.add(new Person("A","11/03/1997","Nam"));
        queue.add(new Person("A","03/03/1997","Nu"));
        queue.add(new Person("A","04/03/1997","Nam"));
        queue.add(new Person("A","12/03/1997","Nu"));
        queue.add(new Person("A","20/03/1997","Nu"));
        queue.add(new Person("A","30/03/1997","Nam"));
        Collections.sort(queue); // sap xep ngay sinh;
       for (int i=0; i<queue.size(); i++){
           if(queue.get(i).getGender()=="Nam"){
               listMale.add(queue.get(i));
               queue.remove(i);
               i--;
           }
       }
       queue.addAll(listMale);
        for (int i=0; i<queue.size();i++){
            System.out.println(queue.get(i));
        }
    }
}

