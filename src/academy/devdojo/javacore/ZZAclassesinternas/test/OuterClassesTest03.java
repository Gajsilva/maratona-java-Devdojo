package academy.devdojo.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "Gabriel";
    static class Nested{
        private String lastname = "Silva";
        void print(){
            System.out.println(new OuterClassesTest03().name+ " " +lastname);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
