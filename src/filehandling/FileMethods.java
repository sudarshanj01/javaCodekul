package filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) {
        File file=new File("file.txt");
        try {
            file.createNewFile();
            System.out.println(file.isFile());
            System.out.println(file.canExecute());
            System.out.println(file.exists());
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.lastModified());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
