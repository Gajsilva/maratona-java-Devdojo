package academy.devdojo;
/*
    Crie variaves para o campo descritos abaixo entre <> e imprima a seguinte
     mensagem:

     Eu <nome>, morando no <endereço>,
     confirmo que recebi o salario de <salario>, na data <data>
 */
public class Aula03Exercicios {
    public static void main(String[] args) {
        String nome = "Gabriel";
        String endereco = "São Paulo";
        double salaraio = 3600.00;
        String data = " 15/09/2022";
        String relatorio = "Eu " + nome + ", morando em " +endereco+ " " +
                "confimo" +
                " que recebi o salario de " +salaraio + " na data" + data;

        System.out.println(relatorio);
    }


}
