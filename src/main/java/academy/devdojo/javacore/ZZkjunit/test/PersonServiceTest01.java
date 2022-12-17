package academy.devdojo.javacore.ZZkjunit.test;

import academy.devdojo.javacore.ZZkjunit.dominio.Person;
import academy.devdojo.javacore.ZZkjunit.service.PersonService;

public class PersonServiceTest01 {
    public static void main(String[] args) {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        System.out.println( personService.isAdult(person));
    }
}
