package academy.devdojo.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    //BasicFileAttributes, DosFileAtributes, PosixFileAttributes
    LocalDateTime date = LocalDateTime.now().minusDays(10);
    File file = new File("pasta2/novo.txt");
    boolean isCreated;{
        try {
            isCreated = file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());
    Path path = Paths.get("pasta2/novo_path.txt");

}
