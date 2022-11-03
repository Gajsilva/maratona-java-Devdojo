package academy.devdojo.javacore.Zgenerics.service;


import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel(){
        System.out.println("Buscando Objeto disponivel");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando Objeto: "+t);
        System.out.println("Objetos disponiveis para alugar:");
        System.out.println(objetosDisponiveis);
        return t;
    }
    public void retornaObjetoAlugado(T t){
        System.out.println("Devolvenndo objeto "+t);
        System.out.println("objetos disponiveis para alugar:");
        System.out.println(objetosDisponiveis);;
    }
}
