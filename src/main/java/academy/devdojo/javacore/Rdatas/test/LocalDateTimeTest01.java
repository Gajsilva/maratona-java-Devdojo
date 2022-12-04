package academy.devdojo.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate data = LocalDate.parse("2022-08-06");
        LocalTime time = LocalTime.parse("23:45:00");

        System.out.println(localDateTime);
        System.out.println(data);
        System.out.println(time);

        LocalDateTime ldt1 = data.atTime(time);
        LocalDateTime ldt2 = time.atDate(data);

        System.out.println(ldt1);
        System.out.println(ldt2);

    }
}
