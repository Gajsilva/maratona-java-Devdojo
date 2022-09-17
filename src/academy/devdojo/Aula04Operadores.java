package academy.devdojo;

public class Aula04Operadores {
    public static void main(String[] args) {

        int numero01 = 12;
        double numero02 = 15;
        double resultado = numero02 / numero01;
        System.out.println(resultado);

        //% resto da divisão

        int resto = 20 % 5 ;
        System.out.println(resto);

        // bolean = valores logicos true e false
        // <> menor e maior => maior igual e menor igual <=
        // == comparando
        // != comparando diferente

        boolean isDezMaiorQue20 = 20>10;
        System.out.println(isDezMaiorQue20);

        int idade = 35;
        float salario = 5000F;

        boolean isDentroDaLei = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenoTrinta= idade <= 30 && salario >= 3381;

        System.out.println(isDentroDaLei);
        System.out.println(isDentroDaLeiMenoTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorXbox = 5000F;
        boolean isXboxCompravel =
                valorTotalContaCorrente > valorXbox || valorTotalContaPoupanca > valorXbox;
        System.out.println(isXboxCompravel);

        double bonus = 1800;
        bonus += 1000;
        bonus -= 500;
        bonus *= 2;
        bonus /= 3;
        bonus %= 5;
        System.out.println(bonus);

        int contador = 0;
        contador += 1;
        contador ++ ;
        contador --;
        ++contador;
        --contador;
        int contador2 = 0;

        System.out.println(contador);
        System.out.println(contador2++);
        System.out.println(++contador2);
    }
}
