package test.comparator_comparable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student[] studentList = new Student[5];
        studentList[0] = new Student(5, "C");
        studentList[1] = new Student(5, "B");
        studentList[2] = new Student(2, "Z");
        studentList[3] = new Student(3, "T");
        studentList[4] = new Student(6, "A");

        for(Student student:studentList){
            System.out.println(student);
        }

//        Arrays.sort(studentList);
//        Arrays.sort(studentList, new StudentIdSort());
        Arrays.sort(studentList, new StudentNameSort());

        System.out.println("--------------------");
        for(Student student:studentList){
            System.out.println(student);
        }
    }
}
