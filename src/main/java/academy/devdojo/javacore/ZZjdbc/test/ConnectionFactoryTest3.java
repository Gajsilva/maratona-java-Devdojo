package academy.devdojo.javacore.ZZjdbc.test;


import academy.devdojo.javacore.ZZjdbc.dominio.Producer;
import academy.devdojo.javacore.ZZjdbc.service.ProducerService;

import java.util.List;

public class ConnectionFactoryTest3 {
    public static void main(String[] args) {
        Producer producer1 = Producer.ProducerBuilder.builder().name("Toei").build();
        Producer producer2 = Producer.ProducerBuilder.builder().name("White fox").build();
        Producer producer3 = Producer.ProducerBuilder.builder().name("Studio Ghili").build();
        ProducerService.saveTransection(List.of(producer1, producer2, producer3));



    }
}
