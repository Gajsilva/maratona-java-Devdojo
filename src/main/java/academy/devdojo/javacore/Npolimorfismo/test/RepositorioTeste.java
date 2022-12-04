package academy.devdojo.javacore.Npolimorfismo.test;

import academy.devdojo.javacore.Npolimorfismo.repository.Repositorio;
import academy.devdojo.javacore.Npolimorfismo.service.RepositorioArquivo;
import academy.devdojo.javacore.Npolimorfismo.service.RepositorioBancoDeDados;
import academy.devdojo.javacore.Npolimorfismo.service.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
