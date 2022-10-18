package academy.devdojo.ExercicioAbreu.test;

import academy.devdojo.ExercicioAbreu.dominio.Usuario;

public class SistemaTest01 {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Eren","Santander", 1000);

        usuario.imprime();

        usuario.pagar( 456.9);
        usuario.receberSalario(5000);
        usuario.transferir(1000);


        usuario.transacoes();

    }
}
