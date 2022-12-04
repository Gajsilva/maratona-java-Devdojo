package academy.devdojo.javacore.ZZjdbc.test;

import academy.devdojo.javacore.ZZjdbc.conn.ConnectionFactory;
import academy.devdojo.javacore.ZZjdbc.dominio.Producer;
import academy.devdojo.javacore.ZZjdbc.repository.ProducerRepository;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer producer = Producer.ProducerBuilder.builder().name("MADMAX").build();

        ProducerRepository.save(producer);
    }
}
