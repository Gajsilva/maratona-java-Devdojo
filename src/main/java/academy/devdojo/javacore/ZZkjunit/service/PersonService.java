package academy.devdojo.javacore.ZZkjunit.service;

import academy.devdojo.javacore.ZZkjunit.dominio.Person;

import java.util.Objects;

public class PersonService {
    public boolean isAdult(Person person){
        Objects.requireNonNull(person, "Person can't be null");
        return person.getAge() >= 18;
    }
}
