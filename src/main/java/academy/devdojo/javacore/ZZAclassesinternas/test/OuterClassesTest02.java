package academy.devdojo.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String nome = "Midorya";

    void print(final String param){
        final String lastaName = "Izuku";
        class LocalClass{
            public void printLocal(){
                System.out.println(param);
                System.out.println(nome + " "+lastaName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal(); // posso abreviar para new LocalClass().printLocal().
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("");
    }
}
