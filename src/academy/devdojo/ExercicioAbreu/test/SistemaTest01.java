package academy.devdojo.ExercicioAbreu.test;

import academy.devdojo.ExercicioAbreu.dominio.Usuario;

import java.util.Scanner;

public class SistemaTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite abaixo seu nome.");
        String name = input.nextLine();

        System.out.println("Digite abaixo o nome do seu banco.");
        String conta = input.nextLine();

        Usuario usuario = new Usuario(name,conta, 1000);

        usuario.imprime();

        System.out.println("Digite o valor abaixo pagamento.");
        double pergunta = Double.parseDouble(input.nextLine());
        usuario.pagar(pergunta);

        System.out.println("Digite o valor abaixo do deposito.");
        double pergunta1 = Double.parseDouble(input.nextLine());
        usuario.depositar(pergunta1);

        System.out.println("Digite o valor da transferencia");
        double pergunta2 = Double.parseDouble(input.nextLine());
        usuario.transferir(pergunta2);

        usuario.verSaldo();
    }
}
