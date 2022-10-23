package academy.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = Retorna todos os digitos
        // \D = Retorna todos que nao for digito
        // \s = Espaços em branco  \t \n \f \r
        // \S = todos os caracteres excluido os brancos
        // \w = a-ZA-Z, digitos,
        // \W = tudo que nao for incluso no \w
        // []
        // ? Zero ou mais
        // * Zero ou mais
        // {n,m} de n ate m
        // ()
        // |
        // $
        // .

        String regex ="([a-zA-Z0-9\\._-])+@([a-z])+\\.([a-z])+";
        String texto = "luff@hotmail.com, 123jotaro@gmail.com, #@!zoro@gmail.com, teste@gmail.com, sakura@email";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

    }
}
