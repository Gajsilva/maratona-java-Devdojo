package academy.devdojo.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dadoos de um arquivo");
    }
    public void checkPermission() {
        System.out.println("Checando permisão no bano de dados de arquivos");
    }
}
