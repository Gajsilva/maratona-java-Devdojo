package academy.devdojo.javacore.Gassociacao.ex.dominio;

public class Seminario {
    private String nome;
    private String local;

    private Professor[] professores;

    public Seminario(String nome, String local){
        this.nome = nome;
        this.local = local;
    }

    public Seminario(String nome, String local, Professor[] professores) {
        this.nome = nome;
        this.local = local;
        this.professores = professores;

    }


    public void imprime(Estudante estudante) {
        System.out.println(this.nome);
        System.out.println(this.local);
        System.out.println(estudante.getNome());
        System.out.println(estudante.getIdade());
        if (this.professores == null) return;

        for (Professor professor : this.professores){
            System.out.println(professor.getNome());
            System.out.println(professor.getEspecialidadede());
        }

    }


    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
