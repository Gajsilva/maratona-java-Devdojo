package academy.devdojo;

public class Aula07Arrays04 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{5,4,3,2,1};
        for (int i = 0; i < numeros3.length ; i++) {
            System.out.println(numeros3[i]);
        }

        for (int num: numeros3) {
            System.out.println(num);
        }
        //foreach nao te da indices versão simplificada
        // variavel num percorre o array e faz referencia a cada posição, ele
        // linka com o proximo valor e vai percorrendo, se tenho um array de
        // 5 indices ele percorre um indece ele executa o comando e depois
        // entra no proximo indice executa dnv e assim vai e volta;
    }
}
