package academy.devdojo.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale LocalePT = new Locale("pt","BR");
        Locale LocaleJP = Locale.JAPAN;
        Locale LocaleIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(LocalePT);
        nfa[2] = NumberFormat.getInstance(LocaleJP);
        nfa[3] = NumberFormat.getInstance(LocaleIT);

        double valor = 10_000.2130;

        for (NumberFormat numberFormat : nfa){
            System.out.println(numberFormat.format(valor));
        }

    }
}
