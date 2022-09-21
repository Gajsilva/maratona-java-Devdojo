package academy.devdojo.introducao;

public class Aula06EstruturaRepeticao02 {
    public static void main(String[] args) {
        // imprima todos os numeros pares de 0 até 1000
        // sempre pensa quando for resolver um poblema, usando o if caso mude
        // um pouco o poblema nao tera erro caso eu inicie a apartir de 1 ja
        // que na segunda resolução começei a partir a contar a partir de 2
        // na primeira com uso do if elimino o poblema.
        for (int i = 0; i <100 ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        for (int i =0;i <= 100; i+= 2) {
            System.out.println("pares " + i);
        }
    }
}
