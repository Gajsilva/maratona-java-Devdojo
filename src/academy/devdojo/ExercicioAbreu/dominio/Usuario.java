package academy.devdojo.ExercicioAbreu.dominio;

public class Usuario {
    private String nome;
    private String conta;
    private double saldo;

    public Usuario(String nome, String conta, double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }
    public void imprime(){
        System.out.println("------------------------------------");
        System.out.println("Bem vindo "+this.nome);
        System.out.println("Seu banco é "+this.conta);
        System.out.println("Saldo inicial: "+this.saldo);
        System.out.println("------------------------------------");
    }

    public void pagar(double pagar){
        double pagamento = this.saldo - pagar ;
        if (pagar == 0 ){
            System.out.println("Por favor digite um valor");
        } else if (this.saldo < pagar){
            System.out.println("Saldo insuficiente para pagamento");
        }else {
            System.out.println("Pagamento feito com sucesso de "+pagar);
            this.saldo = pagamento;
        }
        System.out.println("------------------------------------");
    }

    public void depositar(double depositar){
        double deposito = this.saldo + depositar;
        System.out.println("Deposito feito com sucesso creditado na sua conta: "+depositar);
        this.saldo=deposito;
        System.out.println("------------------------------------");
    }
    public void transferir(double transferir){
        double transferi = this.saldo - transferir;
        if (this.saldo < transferir){
            System.out.println("Saldo Insuficiente para transferencia");
        }else {
            System.out.println("Tranferencia feita com sucesso no valor de: "+transferir);
            this.saldo = transferi;
        }
        System.out.println("------------------------------------");
    }
    public void verSaldo(){
        System.out.println("Saldo atual da sua conta: "+this.saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }
}
