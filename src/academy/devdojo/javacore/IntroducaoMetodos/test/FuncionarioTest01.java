package academy.devdojo.javacore.IntroducaoMetodos.test;

import academy.devdojo.javacore.IntroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Sanji";
        funcionario.idade = 23;
        funcionario.salarios = new double[]{500.30,750,1334.50};

        funcionario.imprime();

    }
}
