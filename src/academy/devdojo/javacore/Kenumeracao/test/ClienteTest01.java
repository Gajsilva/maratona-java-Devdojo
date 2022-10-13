package academy.devdojo.javacore.Kenumeracao.test;

import academy.devdojo.javacore.Kenumeracao.dominio.Cliente;
import academy.devdojo.javacore.Kenumeracao.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Tsubasa",TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente2);
        System.out.println(cliente1);
    }
}
