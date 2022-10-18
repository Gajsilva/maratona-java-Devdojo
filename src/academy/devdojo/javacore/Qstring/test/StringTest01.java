package academy.devdojo.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William";
        String nome1 = "William";
        nome = nome.concat(" Suane");
        System.out.println(nome);
        System.out.println(nome == nome1);
        String nome2 = new String("William"); // 1 variavel de referencia, 2 objeto de tipo string, 3 uma string no pool string
        System.out.println(nome1 == nome2);
        System.out.println(nome1 == nome2.intern());
    }
}
