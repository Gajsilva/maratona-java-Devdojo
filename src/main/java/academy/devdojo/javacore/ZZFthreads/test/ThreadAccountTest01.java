package academy.devdojo.javacore.ZZFthreads.test;

import academy.devdojo.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private Account account = new Account();

    public static void main(String[] args)  {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0){
                System.out.println("Fodeo");
            }
        }
    }

    /* private void withdrawal(int amount){
        if (account.getBalance() >= amount ){
            System.out.println(getTheadName() + " esta indo sacar dinheiro");
            account.withDraw(amount);
            try {
                Thread.sleep(10000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(getTheadName() + " completou o saque, valor atual da conta "+account.getBalance());
        }else {
            System.out.println("Sem dinheiro para "+ getTheadName() + " efeturar o saque "+account.getBalance());
        }
    } */
    private void withdrawal(int amount){
        System.out.println(getTheadName()+ "####### Fora do synchronized");
        synchronized (account) {
            System.out.println("********* dentro do synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(getTheadName() + " esta indo sacar dinheiro");
                account.withDraw(amount);
                System.out.println(getTheadName() + " completou o saque, valor atual da conta " + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getTheadName() + " efeturar o saque " + account.getBalance());
            }
        }
    }

    private String getTheadName(){
        return Thread.currentThread().getName();
    }
}
