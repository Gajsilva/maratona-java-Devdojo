package academy.devdojo.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey Luffy";

    class Inner{
        public void printOuterClassAttributte(){
            System.out.println(name);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        Inner inner2 =new OuterClassesTest01().new Inner();
        inner.printOuterClassAttributte();
        inner2.printOuterClassAttributte();
    }
}
