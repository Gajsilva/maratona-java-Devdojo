package academy.devdojo.javacore.ZZJcrud.test;

import academy.devdojo.javacore.ZZJcrud.service.ProducerService;

import java.util.Scanner;

public class CrudTest01 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        while (true){
            producerMenu();
            op = Integer.parseInt(scanner.nextLine());
            if(op == 0) break;
            ProducerService.buildMenu(op);
        }
    }
    private static void producerMenu(){
        System.out.println("Typw the number of your operation");
        System.out.println("1. Search for producer");
    }
}