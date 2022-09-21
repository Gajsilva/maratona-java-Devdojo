package academy.devdojo.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // tipos primitivos tem valores padroes dentro de arrays
        //byte,short, int,long, float, e double = 0
        // char '\u0000' ' '
        // boolean = false
        // String = Null
        String[] nomes = new String[3];

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
        // era de se esperar o retorno null por causa que nao tenho
        // preenchido na memoria da variavel dentro do arrayAula07Arrays02
    }
}
