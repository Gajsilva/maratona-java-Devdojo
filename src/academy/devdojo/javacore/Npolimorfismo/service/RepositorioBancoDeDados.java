package academy.devdojo.javacore.Npolimorfismo.service;

import academy.devdojo.javacore.Npolimorfismo.repository.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um banco de dados");
    }

}
