package classCar;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 4", "Skyactiv 4");
        System.out.println(Car.numberOfCars);
        Car car3 = new Car("Mazda 5", "Skyactiv 5");
        System.out.println(Car.numberOfCars);
    }
}
