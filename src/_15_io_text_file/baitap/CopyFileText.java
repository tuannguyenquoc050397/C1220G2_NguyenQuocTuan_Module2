package _15_io_text_file.baitap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static List<String> readFile(String filePath) {
        List<String> listLine = new ArrayList<>();
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            File file = new File(filePath);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                listLine.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listLine;
    }

    public static void writeFile(String filePath, String line) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(filePath);
            fileWriter = new FileWriter(filePath, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String targetPathFile = "src\\_15_io_text_file\\baitap\\file_target.csv";
        String sourcePathFile = "src/_15_io_text_file/baitap/file.csv";
        File file=new File(targetPathFile);
        if(file.length()==0){
            List<String> listLine = readFile(sourcePathFile);
            for (String line : listLine) {
                writeFile(targetPathFile,line);
            }
            System.out.println("sao chep thanh cong");
        }else {
            System.out.println("file target da co du lieu");
        }

    }

}
