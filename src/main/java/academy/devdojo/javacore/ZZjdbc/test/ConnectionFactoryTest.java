package academy.devdojo.javacore.ZZjdbc.test;

import academy.devdojo.javacore.ZZjdbc.conn.ConnectionFactory;
import academy.devdojo.javacore.ZZjdbc.dominio.Producer;
import academy.devdojo.javacore.ZZjdbc.repository.ProducerRepository;
import academy.devdojo.javacore.ZZjdbc.service.ProducerService;

import java.util.List;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer producer = Producer.ProducerBuilder.builder().name("Kakaroto").build();
        Producer producerToUpdate = Producer.ProducerBuilder.builder().id(8).name("Ichigo").build();

       // ProducerService.save(producer);
      //  ProducerService.delete(4);
      //  ProducerService.deleteTodos();
      // ProducerService.update(producerToUpdate);
        List<Producer> producers = ProducerService.findAll();
        System.out.println("Producers found "+producers);
    }
}
