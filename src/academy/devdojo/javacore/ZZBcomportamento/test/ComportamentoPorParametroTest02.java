package academy.devdojo.javacore.ZZBcomportamento.test;

import academy.devdojo.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private  static  List<Car> cars = List.of(
            new Car("blue", 2012),
            new Car("black", 2005),
            new Car("green", 2014)
    );
    public static void main(String[] args) {
        List<Car> blueCars = filterCar(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("blue");
            }
        });
        System.out.println(blueCars);
        System.out.println("--------------------");
        List<Car> blackCars = filter(cars, car -> car.getColor().equals("black")); //Aero function
        System.out.println(blackCars);
        System.out.println("---------------------");
        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() <= 2012);
        System.out.println(yearBeforeCars);
        System.out.println("----------------------");
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println(filter(nums, num -> num % 2 == 0));
        //Com metodo generico posso declarar a regra do metodo dentro do sout, de modo universal
    }

    private static List<Car> filterCar(List<Car> cars, CarPredicate carPredicate){
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars){
            if (carPredicate.test(car)){
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filterList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filterList.add(e);
            }
        }
        return filterList;
    }
}
