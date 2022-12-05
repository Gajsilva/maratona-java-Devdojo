package academy.devdojo.javacore.ZZjdbc.service;

import academy.devdojo.javacore.ZZjdbc.dominio.Producer;
import academy.devdojo.javacore.ZZjdbc.repository.ProducerRepository;

public class ProducerService {
    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }
    public static void delete(int id){
        if (id <= 0 ){
            throw new IllegalArgumentException("Invalid value for id");
        }
        ProducerRepository.delete(id);
    }

    public static void deleteTodos(){
        ProducerRepository.deleteTodos();
    }
}
