package academy.devdojo.javacore.Heheranca.test;

import academy.devdojo.javacore.Heheranca.dominio.Endereco;
import academy.devdojo.javacore.Heheranca.dominio.Funcionario;
import academy.devdojo.javacore.Heheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-201");

        Pessoa pessoa = new Pessoa("Aoshi");
        pessoa.setCpf("0101101202");

        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("----------------");

        Funcionario funcionario = new Funcionario("Sanji");

        funcionario.setCpf("456854763");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(4500);
        funcionario.imprime();
    }
}
