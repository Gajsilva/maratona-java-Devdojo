package academy.devdojo.javacore.ZZjdbc.service;

import academy.devdojo.javacore.ZZjdbc.conn.ConnectionFactory;
import academy.devdojo.javacore.ZZjdbc.dominio.Producer;
import academy.devdojo.javacore.ZZjdbc.repository.ProducerRepository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProducerService {
    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }
    public static void delete(Integer id){
      requireValidId(id);
        ProducerRepository.delete(id);
    }
    public static void deleteTodos(){
        ProducerRepository.deleteTodos();
    }
    public static void update(Producer producer){
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }
    private static void requireValidId(Integer id){
        if (id == null || id <= 0){
            throw new IllegalArgumentException("Invalid value or id");
        }
    }
    public static List <Producer> findAll(){
        return ProducerRepository.findAll();
    }
    public static List <Producer> findByName(String name){
        return ProducerRepository.finByName(name);
    }
}
