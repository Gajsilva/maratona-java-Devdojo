package academy.devdojo.javacore.ZZFthreads.services;

import academy.devdojo.javacore.ZZFthreads.dominio.Members;

public class EmailDeliveryService implements Runnable {
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String theadName = Thread.currentThread().getName();
        System.out.println(theadName + " starting to deliver emails ");
        while(members.isOpen() || members.pendingEmails() > 0){
            try {
                String email = members.retrieveEmail();
                if (email == null) continue;
                System.out.println(theadName + " enviando email para "+email);
                Thread.sleep(2000);
                System.out.println(theadName+ " enviou email com sucesso para "+email);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Todos os emails foram enviados com sucesso");
        }
    }
}
