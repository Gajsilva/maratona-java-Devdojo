package academy.devdojo;

public class Aula06EstruturaRepeticao04 {
    public static void main(String[] args) {
        // dado o valor de um carro, descubra em quantas ele pode ser parcelado
        // condiçao valorParcela >= 1000

        double valorDoCarro = 40000;
        double prestacao = valorDoCarro;
        for (int i = 1; prestacao > 1000; i++) {
            prestacao = valorDoCarro / i;
            System.out.println("Qtde parcelas: " +i);
            System.out.println(" valor: " + prestacao);
        }

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println(" Parcela " + parcela+ " R$ " +valorParcela);
            }
        }
    }
}
