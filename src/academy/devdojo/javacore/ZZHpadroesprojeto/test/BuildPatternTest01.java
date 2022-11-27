package academy.devdojo.javacore.ZZHpadroesprojeto.test;

import academy.devdojo.javacore.ZZHpadroesprojeto.dominio.Person;

public class BuildPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Gabriel")
                .lastName("silva")
                .username("viradojiraya")
                .email("jiraya@gmail.com")
                .builder().build()
        ;

        System.out.println(build);
    }
}
