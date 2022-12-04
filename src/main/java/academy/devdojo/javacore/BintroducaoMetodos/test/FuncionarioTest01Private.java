package academy.devdojo.javacore.BintroducaoMetodos.test;


import academy.devdojo.javacore.BintroducaoMetodos.dominio.FuncionarioPrivate;

public class FuncionarioTest01Private {
    public static void main(String[] args) {
        FuncionarioPrivate funcionario = new FuncionarioPrivate();
        funcionario.setNome  ("Sanji");
        funcionario.setIdade  (23);
        funcionario.setSalarios (new double[]{900.30,750.25,1334.50});
        funcionario.imprime();
        System.out.println("Media "+funcionario.getMedia());
    }
}
