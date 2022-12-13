package academy.devdojo.javacore.ZZJcrud.service;

import academy.devdojo.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.javacore.ZZJcrud.dominio.Producer;
import academy.devdojo.javacore.ZZJcrud.repository.ProducerRepository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void buildMenu(int op){
        switch (op){
            case 1:
                findByName();
                break;
            case 2:
                delete();
                break;
            default:
                throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void findByName(){
        System.out.println("Type name or empty to all");
        String name = SCANNER.nextLine();
        List<Producer> producers = ProducerRepository.finByName(name);
            for (int i = 0; i < producers.size(); i++) {
                Producer producer = producers.get(i);
                System.out.printf("[%d] - ID: %d | %s%n",i,producer.getId(), producer.getName());
            }
    }
    private static void delete(){
        System.out.println("Type id of the producer you want to delete ");
        findByName();
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? S/N");
        String choice = SCANNER.nextLine();
        if ("s".equalsIgnoreCase(choice)){
            ProducerRepository.delete(id);
        }
    }
}
