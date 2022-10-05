package academy.devdojo.javacore.Gassociacao.dominio;

public class Time {
    private String nome;
    private Time time;

    public Time(String nome) {
        this.nome = nome;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
