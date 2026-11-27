import java.util.Arrays;

public class Dealership {
    private Car[] cars;

    public Dealership(Car[] cars) {
        this.cars = Arrays.copyOf(cars, cars.length);
    }
}
