package _16_io_binary_file_serialization.thuchanh;

import _16_io_binary_file_serialization.baitap.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryFile {
    public static void clearByteFile(String pathFile) {
        File file = new File(pathFile);
        file.delete();
    }

    public static void writeByteFile(String pathFile, List list) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(pathFile);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fos != null;
                fos.close();
                assert oos != null;
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List readByteFile(String pathFile) {
        File file = new File(pathFile);
        if (file.length() > 0) {
            FileInputStream fis = null;
            ObjectInputStream ois = null;
            List sArr = null;
            try {
                fis = new FileInputStream(pathFile);
                ois = new ObjectInputStream(fis);
                sArr = (List) ois.readObject();
                for (Object s : sArr) {
                    System.out.println(s.toString());
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    assert fis != null;
                    fis.close();
                    assert ois != null;
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return sArr;
        } else {
            return new ArrayList();
        }
    }
}
