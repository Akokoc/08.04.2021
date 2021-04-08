package telran.comparators;

import telran.item.Car;

import java.util.Comparator;

public class ComparatorByPrice implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2){
        return Double.compare(c1.getPrice(),c2.getPrice());
        }

}
