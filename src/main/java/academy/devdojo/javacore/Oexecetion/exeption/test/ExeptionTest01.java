package academy.devdojo.javacore.Oexecetion.exeption.test;


import java.io.File;
import java.io.IOException;

public class ExeptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("/home/gabriel/IdeaProjects/maratona-java-Devdojo/arquivo/teste.text");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+isCriado);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
