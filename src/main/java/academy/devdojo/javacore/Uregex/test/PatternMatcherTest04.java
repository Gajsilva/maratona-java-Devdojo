package academy.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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

        String regex ="0[xX]([0-9a-fA-F])+(\\s|$) ";
        String texto = "12 0x 0X 0xFFABC 0x109 0x1 0XAFFYX";

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
