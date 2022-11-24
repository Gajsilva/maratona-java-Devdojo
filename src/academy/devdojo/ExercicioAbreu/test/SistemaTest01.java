package academy.devdojo.ExercicioAbreu.test;

import academy.devdojo.ExercicioAbreu.dominio.Conta;
import academy.devdojo.ExercicioAbreu.dominio.Usuario;

public class SistemaTest01 {
    public static void main(String[] args) {
        Usuario kurosaki = new Usuario("Kurosaki");
        Usuario luffy = new Usuario("Luffy");

        Conta usuario1 = new Conta(kurosaki);
        Conta usuario2 = new Conta(luffy);

        usuario1.imprime();
        usuario2.imprime();

        usuario1.pagar(456.90);
        usuario1.depositar(5000);
        usuario1.transferir(3800, usuario2);

        usuario1.imprimirExtrato();
        usuario2.imprimirExtrato();


    }
}
