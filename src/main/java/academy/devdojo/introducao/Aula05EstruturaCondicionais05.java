package academy.devdojo.introducao;

public class Aula05EstruturaCondicionais05 {
    public static void main(String[] args) {
        // Imprima o dia sa semana, considernado 1 como domingo

        byte dia = 8;
        // char, int, byte , shor, enum, String
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("homem");
                break;
            case 'F':
                System.out.println("mulher");
                break;
            default:
                System.out.println("Invalido");
                break;
        }
    }
}
