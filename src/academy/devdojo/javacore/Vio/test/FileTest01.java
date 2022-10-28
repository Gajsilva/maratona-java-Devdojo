package academy.devdojo.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.text");
        try {
            boolean isCreated =  file.createNewFile();
            System.out.println(isCreated);
            System.out.println("path "+file.getPath());
            System.out.println("path absolute "+file.getAbsolutePath());
            System.out.println("is directory "+file.isDirectory());
            System.out.println("is file "+file.isFile());
            System.out.println("is hidden "+file.isHidden());
            System.out.println("last modified "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exits = file.exists();
            if (exits){
                System.out.println("Deleted "+file.delete());
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}