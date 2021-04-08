package telran.appl;

import telran.item.Car;

import java.util.Arrays;

public class CarAppl {
    public static void main(String[] args) {
        Car c1 = new Car(2011, "white", 2.0, 20000.8);
        Car c2 = new Car(2012, "black", 2.5, 30000.5);
        Car c3 = new Car(2013, "blue", 2.0, 30000.5);
        Car c4 = new Car(2015, "gray", 2.0, 2000.8);
        Car c5 = new Car(2020, "red", 2.0, 200.9);
        Car c6 = new Car(2021, "green", 2.0, 120000.8);
        Car c7 = new Car(2000, "white", 2.0, 3000.05);
        Car c8 = new Car(1990, "beige", 2.0, 100.98);
        Car c9 = new Car(1919, "burgundy", 2.0, 100.98);
        Car c10 = new Car(206, "yellow", 2.0, 20000.8);//выводится тк первый фильтр по цене

        Car[] cars = {c1, c3, c2,c4, c5, c6, c7, c8, c9, c10};
        Arrays.sort(cars);
        printAr(cars);
    }

    private static void printAr(Car[] cars) {
        for (Car c : cars) {
            System.out.println(c);
        }
    }
}
