package academy.devdojo.javacore.ZZGconcorrencia.dominio;

public class Account {
    private int balance = 50;

    public void withDraw(int amount){
        this.balance = this.balance - amount;
    }
    public int getBalance(){
        return balance;
    }
}
