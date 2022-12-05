package academy.devdojo.javacore.ZZjdbc.test;

import academy.devdojo.javacore.ZZjdbc.conn.ConnectionFactory;
import academy.devdojo.javacore.ZZjdbc.dominio.Producer;
import academy.devdojo.javacore.ZZjdbc.repository.ProducerRepository;
import academy.devdojo.javacore.ZZjdbc.service.ProducerService;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer producer = Producer.ProducerBuilder.builder().name("Kakaroto").build();

      //  ProducerService.save(producer);
      //  ProducerService.delete(4);
        ProducerService.deleteTodos();
    }
}
