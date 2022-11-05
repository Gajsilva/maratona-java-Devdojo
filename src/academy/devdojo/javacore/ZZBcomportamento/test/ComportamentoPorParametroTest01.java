package academy.devdojo.javacore.ZZBcomportamento.test;

import academy.devdojo.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("blue",2001),
            new Car("black", 2005)
    );
    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterCar(cars, "blue"));
        System.out.println(filterCar(cars, "black"));
        System.out.println("----------");
        System.out.println(filterByYearCar(cars, 2005));
    }

    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> corCars = new ArrayList<>();
        for (Car car : cars){
            if (car.getColor().equals("green")){
                corCars.add(car);
            }
        }
        return corCars;
    }

    private static List<Car> filterCar(List<Car> cars, String cor){
        List<Car> corCars = new ArrayList<>();
        for (Car car : cars){
            if (car.getColor().equals(cor)){
                corCars.add(car);
            }
        }
        return corCars;
    }

    private static List<Car> filterByYearCar(List<Car> cars, int year){
        List<Car> filterAgeCar = new ArrayList<>();
        for (Car car : cars){
            if (car.getYear() <= year){
                filterAgeCar.add(car);
            }
        }
        return filterAgeCar;
    }
}
