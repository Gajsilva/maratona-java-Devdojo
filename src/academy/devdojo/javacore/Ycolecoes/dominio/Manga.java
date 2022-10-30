package academy.devdojo.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private long id;
    private String nome;
    private double preco;

    public Manga(long id, String nome, double preco) {
        Objects.requireNonNull(id,"Id não pode ser nulo");
        Objects.requireNonNull(nome,"Nome não pode ser nulo");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id == manga.id && Double.compare(manga.preco, preco) == 0 && nome.equals(manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int compareTo(Manga outroManga) {
        //negativo se o this < outroManga
        //se o this == outroManga, return 0
        //positivo  se this > outroManga
        if (this.id < outroManga.getId()){
            return -1;
        } else if (Objects.equals(this.id, outroManga.getId())){
            return 0;
        }else {
            return 1;
       }
    }
}
