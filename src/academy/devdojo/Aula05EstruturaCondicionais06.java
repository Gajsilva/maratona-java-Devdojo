package academy.devdojo;

public class Aula05EstruturaCondicionais06 {
    public static void main(String[] args) {
        // Imprima os valores de 1 a 7, imprima se é dia util ou final de semana
        // Considerando 1 como domingo

        byte dia = 5;
        switch (dia){
            case 1:
            case 7:
                System.out.println("fds");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            default:
                System.out.println("opção invalida");
                break;

        }
    }
}
