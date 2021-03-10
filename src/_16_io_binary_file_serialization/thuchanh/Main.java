package _16_io_binary_file_serialization.thuchanh;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sourcePath = "D:\\C1220G2_NguyenQuocTuan_Module2\\src\\_16_io_binary_file_serialization\\thuchanh\\source.csv";
        String destPath = "D:\\C1220G2_NguyenQuocTuan_Module2\\src\\_16_io_binary_file_serialization\\thuchanh\\dest.csv";

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
//            copyFileUsingJava7Files(sourceFile, destFile);
            copyFileUsingStream(sourceFile, destFile);
            System.out.printf("Copy completed");
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }
}
