package academy.devdojo.javacore.Gassociacao.ex.dominio;

public class Professor {
    private String nome;
    private String especialidade;


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.especialidade);

    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getEspecialidadede() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
