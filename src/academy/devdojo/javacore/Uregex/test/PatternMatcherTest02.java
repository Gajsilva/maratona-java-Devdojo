package academy.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Retorna todos os digitos
        // \D = Retorna todos que nao for digito
        // \s = Espaços em branco  \t \n \f \r
        // \S = todos os caracteres excluido os brancos
        // \w = a-ZA-Z, digitos,
        // \W = tudo que nao for incluso no \w

        String regex = "\\S";
        String texto = "abaaba";
        String texto2 = "sa254 rewf5453";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
