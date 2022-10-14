package academy.devdojo.javacore.Kenumeracao.test;

import academy.devdojo.javacore.Kenumeracao.dominio.Cliente;
import academy.devdojo.javacore.Kenumeracao.dominio.TipoCliente;
import academy.devdojo.javacore.Kenumeracao.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Tsubasa",TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente2);
        System.out.println(cliente1);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente1 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente1);
    }
}
