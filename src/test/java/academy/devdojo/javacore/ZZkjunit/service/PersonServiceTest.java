package academy.devdojo.javacore.ZZkjunit.service;

import academy.devdojo.javacore.ZZkjunit.dominio.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    @Test
    @DisplayName("Teste de maioridade penal")
    void isAdult() {
        Person person = new Person(15);
        PersonService personService = new PersonService();

        Assertions.assertEquals(false, personService.isAdult(person));
    }
}