package academy.devdojo.javacore.Xserializacao.dominio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno implements Serializable {
    private static final long serialVersionUID = -2478631973585890958L;
    private long id;
    private String nome;
    private transient String password;
    private static final String NOME_ESCOLA = "DevDojo Virado no Jiraya";
    private transient Turma turma;

    public Aluno(long id, String nome, String password) {
        System.out.println("Dentro do construtor");
        this.id = id;
        this.nome = nome;
        this.password = password;
    }
    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", Nome da escola='" + NOME_ESCOLA + '\'' +
                ", Nome da Turma='" + turma + '\'' +
                '}';
    }

    private void writeObject(ObjectOutputStream oss){
        try {
            oss.defaultWriteObject();
            oss.writeUTF(turma.getNome());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois){
        try {
            ois.defaultReadObject();
            String nomeTurma =  ois.readUTF();
            turma = new Turma(nomeTurma);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void setTurma(Turma turma) {

    }
}
