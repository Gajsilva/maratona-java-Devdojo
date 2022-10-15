package academy.devdojo.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("carregando banco de dados");
    }
}
