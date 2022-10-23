package academy.devdojo.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    // file
    // fileWriter
    //FileReader
    //BufferedWriter
    //BufferedReader
    public static void main(String[] args) {
        File file = new File("file.txt");
        try ( FileWriter fw = new FileWriter(file,true)){
           fw.write("o devdojo e lindo, melhor curso do brasillll\nContinuando a cantoria\n");
           fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
