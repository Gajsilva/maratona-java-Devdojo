package academy.devdojo;

public class Aula05EstruturaCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "eu vou doar 500 devdojo";
        String mensagemNaoDoar = "eu vou nao doar nada para devdojo";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

        int jogador = 16;
        String time;
        if (jogador < 15) {
            time = "Time infantil";
        } else if (jogador >= 15 && jogador < 18) {
            time = "Time Juvenil";
        } else {
            time = "Time Adulto";
        }
        System.out.println(time);

        int idade = 16;
        String categoria;
        categoria = idade < 15 ? "categoria infantil":
                idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria " +
                        "adulto";
        System.out.println(categoria);
    }
}
