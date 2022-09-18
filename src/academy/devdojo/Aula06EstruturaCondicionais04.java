package academy.devdojo;

public class Aula06EstruturaCondicionais04 {
    public static void main(String[] args) {
        double salario = 70000;
        String mensagem;
        double pagamento;
        double resultado ;
        double pagode = salario;

        if (salario < 34712) {
            pagamento = salario * 9.7 / 100;
            resultado = pagode - pagamento;
            System.out.println("Voce paga de livre de imposto " + resultado);
        } else if (salario >= 34712 && salario < 68507) {
            pagamento = salario * 37.35 / 100;
            resultado = pagode - pagamento;
            System.out.println("Voce paga de livre de imposto " + resultado);
        } else {
            pagamento = salario * 49.50 / 100;
            resultado = pagode - pagamento;
            System.out.println("Voce paga de livre de imposto " + resultado);
        }

        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundoFaixa = 37.35 / 100;
        double terceiroFaixa = 49.50 / 100;
        double valorImposto;
        
        if (salarioAnual <= 34712){
            salarioAnual = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507 ) {
            salarioAnual = salarioAnual * segundoFaixa;
        }else {
            salarioAnual = salarioAnual * terceiroFaixa;
        }
        System.out.println("Seu salario livre de imposto "+salarioAnual);
    }
}
