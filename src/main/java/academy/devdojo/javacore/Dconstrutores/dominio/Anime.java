package academy.devdojo.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;

    private String genero;

    private String estudio;

    public Anime(String nome, String tipo, int espisodios,String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = espisodios;
        this.genero = genero;

    }

    public Anime(String nome, String tipo, int espisodios,String genero, String estudio){
        this(nome, tipo, espisodios, genero);
        this.estudio = estudio;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int espisodios){
        this.episodios = espisodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
