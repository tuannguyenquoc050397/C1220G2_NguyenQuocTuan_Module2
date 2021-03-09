package _15_io_text_file.baitap;

import java.util.List;

public class ReadFileOptional {
    public static void main(String[] args) {
       List<String> listCountry= CopyFileText.readFile("src\\_15_io_text_file\\baitap\\Country.csv");
       String[] listLine;
       for(int i=0; i<listCountry.size();i++){
           listLine=listCountry.get(i).split(",");
           System.out.println(listLine[5]);
       }
    }
}
