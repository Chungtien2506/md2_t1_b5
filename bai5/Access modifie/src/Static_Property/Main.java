package Static_Property;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW ","DONG CO 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("G63","dong co 5");
        System.out.println(Car.numberOfCars);
    }
}
