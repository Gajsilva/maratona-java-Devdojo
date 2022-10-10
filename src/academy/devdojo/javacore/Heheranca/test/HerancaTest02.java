package academy.devdojo.javacore.Heheranca.test;

import academy.devdojo.javacore.Heheranca.dominio.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        //0 - Bloco de inicialização é estatico da super classe executado quando a JVM carregar a
        // pai
        //1 - Bloco de inicialização é estatico da sub classe executado quando a JVM carregar
        // a filha
        //2 - alocando espaço em memoria pra objeto da classe pai
        //3 cada atributo de classe é criado inicializando com valores default ou o quer for
        // passado da classe
        //4 - alocado espaço em memoria pra objeto da subclasse filha
        //5 - cada atributo de subclasse é criado inicializando com valores default ou o quer for
        //        // passado da classe
        //6 - Bloco de inicialização da superclasse é executado na ordem que aparece
        //7 - Construtor é executado da superclasse
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
