package academy.devdojo.javacore.IntroducaoMetodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(18 + 10);
    }
    public void subtraiaDoisNumeros(){
        System.out.println(50-25);
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;

    }
}
