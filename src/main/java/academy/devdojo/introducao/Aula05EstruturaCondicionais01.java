package academy.devdojo.introducao;

public class Aula05EstruturaCondicionais01 {
    public static void main (String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarbebida = idade >= 18;
        if(isAutorizadoComprarbebida ){
            System.out.println("Pode vender");
        } else {
            System.out.println("Proibido a venda pra voce");
        }

        if (isAutorizadoComprarbebida == false) {
            System.out.println("Bebida pra voce nao seu muleque");
        }
        if (!isAutorizadoComprarbebida) {
            System.out.println("Bebida pra voce nao seu menino");
        }

        System.out.println("Fora do if");
    }
}
