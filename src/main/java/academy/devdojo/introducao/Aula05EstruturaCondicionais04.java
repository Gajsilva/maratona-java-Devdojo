package academy.devdojo.introducao;

public class Aula05EstruturaCondicionais04 {
    public static void main(String[] args) {
        double salario = 70000;
        double pagamento;
        double pagode = salario;

        if (salario < 34712) {
            pagamento = (9.7 / 100) * salario;

            System.out.println("Voce paga de livre de imposto " + pagamento);
        } else if (salario >= 34712 && salario < 68507) {
            pagamento =  (37.35 / 100) * salario ;

            System.out.println("Voce paga de livre de imposto " + pagamento);
        } else {
            pagamento = (49.50 / 100) * salario;

            System.out.println("Voce paga de livre de imposto " + pagamento);
        }

        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundoFaixa = 37.35 / 100;
        double terceiroFaixa = 49.50 / 100;
        double valorImposto;
        
        if (salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507 ) {
            valorImposto = salarioAnual * segundoFaixa;
        }else {
            valorImposto = salarioAnual * terceiroFaixa;
        }
        System.out.println("Seu salario livre de imposto "+valorImposto);
    }
}
