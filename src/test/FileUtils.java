package test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    static void checkFilePath(String filePath) throws Exception{

    }
    public static void writeFile(String filePath, String line){
        try {
            FileWriter fileWriter=new FileWriter(filePath);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<String> readFile(String filePath){
        List<String> listLine=new ArrayList<>();
        try {
            File file=new File(filePath);
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                listLine.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;
    }

    public static void main(String[] args) {
//        Student student1=new Student("A",1, "05/03/1997");
//        Student student2=new Student("B",2, "05/03/1997");
//        Student student3=new Student("C",3, "05/03/1997");
//        List<Student> studentList=new ArrayList<>();
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//        String line=null;
//        for (Student student:studentList){
//            line=student.getId()+", "+student.getName()+", "+student.getDateOfBirth();
//            writeFile("src/test/comparator_comparable/student.csv",line);
//        }
//        List<String> listFileText= FileUtils.readFile("src/test/comparator_comparable/student.csv");
//        System.out.println(listFileText);
//        String[] lineSplit =listFileText.get(0).split(", ");
//        Student student01=new Student(lineSplit[1],Integer.parseInt(lineSplit[0]),lineSplit[2]);
//        System.out.println(student01);

//        for (String line:listFileText){
//            FileUtils.writeFile("src/test/comparator_comparable/student_copy.csv",line);
//        }
        File file1=new File("src/test/comparator_comparable/student_copy.csv");
        File file2=new File("src/test/comparator_comparable/mm.csv");
        writeFile("src/test/comparator_comparable/mm.csv","3");
        System.out.println(file1.length());
        System.out.println(file2.length());

    }
}
