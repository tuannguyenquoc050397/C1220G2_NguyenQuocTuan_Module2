package _16_io_binary_file_serialization.baitap;

import _16_io_binary_file_serialization.thuchanh.BinaryFile;

import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    private static final String TARGET_FILE = "D:\\C1220G2_NguyenQuocTuan_Module2\\src\\_16_io_binary_file_serialization\\baitap\\targetFile.txt";
    private static final String SOURCE_FILE = "D:\\C1220G2_NguyenQuocTuan_Module2\\src\\_16_io_binary_file_serialization\\baitap\\sourceFile.txt";
    public static void main(String[] args) {
        List listSource = new ArrayList();
        List listTarget = new ArrayList();
        listTarget = BinaryFile.readByteFile(TARGET_FILE);
        listSource = BinaryFile.readByteFile(SOURCE_FILE);
        if (listSource.size() == 0) {
            System.out.println("source file is empty");
        } else {
            if (listTarget.size() == 0) {
                BinaryFile.writeByteFile(TARGET_FILE, listSource);
                System.out.println("copy thanh cong");
            } else {
                System.out.println("target file is not empty");
            }
        }
    }
}
