package academy.devdojo.javacore.Eblocoinicializacao.dominio;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Anime {
    private String nome;
    private int[] episodios;

    //1 - alocando espaço em memoria pra objeto
    //2 cada atributo de classe é criado inicializando com valores default ou o quer for passado
    //3 - Bloco de inicialização é executado
    //4 - Construtor é executado
    {
        System.out.println("dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }


    public Anime() {


        for (int episodios: this.episodios) {
            System.out.println(episodios+ " ");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}

