package academy.devdojo.javacore.Oexecetion.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
        System.out.println("-----------------");
        abreConexao2();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta";
        }catch (Exception e){
            System.out.println("");
            e.printStackTrace();
        }finally {
            System.out.println("Fechando arquivo liberado pelo sistema operacional");
        }
        return null;
    }

    private static void abreConexao2(){
        try {
            System.out.println("abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
