package academy.devdojo.javacore.IntroducaoMetodos.test;

import academy.devdojo.javacore.IntroducaoMetodos.dominio.FuncionarioMinhaVersao;

public class FuncionarioTest01MinhaVersao {
    public static void main(String[] args) {
        FuncionarioMinhaVersao funcionarioMinhaVersao1 = new FuncionarioMinhaVersao();
        FuncionarioMinhaVersao funcionarioMinhaVersao2 = new FuncionarioMinhaVersao();
        FuncionarioMinhaVersao funcionarioMinhaVersao3 = new FuncionarioMinhaVersao();
        FuncionarioMinhaVersao funcionarioMinhaVersao = new FuncionarioMinhaVersao();

        funcionarioMinhaVersao1.nome ="Luffy";
        funcionarioMinhaVersao1.idade =21;
        funcionarioMinhaVersao1.salario =3000;

        funcionarioMinhaVersao2.nome = "Nami";
        funcionarioMinhaVersao2.idade = 22;
        funcionarioMinhaVersao2.salario = 4000;

        funcionarioMinhaVersao3.nome = "Aoshi";
        funcionarioMinhaVersao3.idade = 15;
        funcionarioMinhaVersao3.salario = 8000;

        funcionarioMinhaVersao1.imprime();
        funcionarioMinhaVersao2.imprime();
        funcionarioMinhaVersao3.imprime();
        funcionarioMinhaVersao.mediaSalario(funcionarioMinhaVersao1.salario, funcionarioMinhaVersao2.salario, funcionarioMinhaVersao3.salario);

    }
}
