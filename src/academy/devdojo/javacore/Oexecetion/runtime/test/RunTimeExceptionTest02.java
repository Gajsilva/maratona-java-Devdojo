package academy.devdojo.javacore.Oexecetion.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1,0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Codigo FInalizado");
    }

    /**
     *
     * @param a
     * @param b não pode ser zerp
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Argumento ilegal, nao pode ser 0");
        }
        return a/b;
    }

}
