package academy.devdojo.javacore.Qstring.test;

public class StringPerformaceTest01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" Devdojo");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);

        String nome1 = "William Suane";
        nome.concat(" Devdojo");
        nome.substring(0,3);
        System.out.println(nome1);
        StringBuffer sbs = new StringBuffer("William Suane");
        sbs.append(" DevDojo").append(" Academy");
        sbs.reverse();
        sbs.reverse();
        sbs.delete(0,3);
        System.out.println(sbs);
    }
}
