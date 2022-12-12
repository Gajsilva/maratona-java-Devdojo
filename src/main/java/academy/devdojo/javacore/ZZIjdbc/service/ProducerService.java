package academy.devdojo.javacore.ZZIjdbc.service;

import academy.devdojo.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.javacore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }
    public static void saveTransection(List<Producer> producers){
        ProducerRepository.saveTransection(producers);
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
    public static void updatePreparedStatement(Producer producer){
        requireValidId(producer.getId());
        ProducerRepository.updatePreparedStatement(producer);
    }
    private static void requireValidId(Integer id){
        if (id == null || id <= 0){
            throw new IllegalArgumentException("Invalid value or id");
        }
    }
    public static List <Producer> findAll(){
        return ProducerRepository.findAll();
    }
    public static List <Producer> findByNameToUpercase(String name){
        return ProducerRepository.findByUpdateUpercase(name);
    }
    public static List<Producer> findByAndInsetWhenNotFound (String name){
        return ProducerRepository.findByAndInsetWhenNotFound(name);
    }
    public static void findByAndDelete (String name){
        ProducerRepository.findByAndDelete(name);
    }
    public static void showProducerMetadata(){ProducerRepository.showProducerMetadata();}
    public static void showDriverMetadata(){ProducerRepository.showDriverMetadata();}
    public static void showTypeScrollWorking(){ProducerRepository.showTypeScrollWorking();}
    public static List <Producer> findByName(String name){
        return ProducerRepository.finByName(name);
    }
    public static List <Producer> finByNamePreparedStatementComSQLINJECTION(String name){
        return ProducerRepository.finByNamePreparedStatementComSQLINJECTION(name);
    }
    public static List<Producer> finByNamePreparedStatement(String name) {
        return ProducerRepository.finByNamePreparedStatement(name);
    }
    public static List<Producer> finByNameCallableStatement(String name) {
        return ProducerRepository.finByNameCallableStatement(name);
    }
}
