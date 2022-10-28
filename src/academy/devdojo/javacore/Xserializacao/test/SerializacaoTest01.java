package academy.devdojo.javacore.Xserializacao.test;

import academy.devdojo.javacore.Xserializacao.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Gabriel", "12345");
        //serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno)  {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("pasta2/aluno.ser")))){
                oos.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void deserializar()  {
        Path path = Paths.get("pasta2/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println("aluno");
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}




