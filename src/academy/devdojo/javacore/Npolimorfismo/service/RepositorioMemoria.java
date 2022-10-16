package academy.devdojo.javacore.Npolimorfismo.service;

import academy.devdojo.javacore.Npolimorfismo.repository.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na memoria");
    }
}
