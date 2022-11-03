package academy.devdojo.javacore.Zgenerics.service;


import java.util.List;

public class RetalService<T> {
    private List<T> objetosDisponiveis;

    public RetalService(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel(){
        System.out.println("Buscando carro disponivel");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando carro: "+t);
        System.out.println("Carros disponiveis para alugar:");
        System.out.println(objetosDisponiveis);
        return t;
    }
    public void retornaObjetoAlugado(T t){
        System.out.println("Devolvenndo carro "+t);
        System.out.println("Carros disponiveis para alugar:");
        System.out.println(objetosDisponiveis);;
    }
}
