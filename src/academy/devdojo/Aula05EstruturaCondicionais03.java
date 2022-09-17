package academy.devdojo;

public class Aula05EstruturaCondicionais03 {
    public static void main(String[] args) {
        double salario = 300;
        String mensagemDoar = "eu vou doar 500 devdojo";
        String mensagemNaoDoar = "eu vou nao doar nada para devdojo";
        String resultado;

        if(salario > 500){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}
