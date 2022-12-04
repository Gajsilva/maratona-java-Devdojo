package academy.devdojo.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "  Luffy   ";
        String numeros = "0123456";
        System.out.println(nome.charAt(3));
        System.out.println(nome.length());
        System.out.println(nome.replace("f","l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(3,numeros.length()));
        System.out.println(numeros.substring(3));
        System.out.println(nome.trim()); // remove valores em branco
    }
}
