package academy.devdojo.javacore.ZZEstreams.dominio;

public class LightNovel {
    private String title;
    private double price;

    public LightNovel(String nome, double price) {
        this.title = nome;
        this.price = price;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "nome='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
