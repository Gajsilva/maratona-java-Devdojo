package academy.devdojo;

public class Aula06EstruturaRepeticao03 {
    public static void main(String[] args) {
        // imprima os primeiros 25 numeros de um dado valor. Por exemplo, 50
        int valormax = 50;
        for (int i = 0; i <= valormax ; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
