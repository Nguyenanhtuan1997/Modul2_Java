package $5AdvancedProgramminwithJava;

public class Car {
    private String name;
    private String engine;

    public static int numbeOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numbeOfCars++;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.println(Car.numbeOfCars);

        Car car2 = new Car("Mazda 6","Skyactiv 6");

        System.out.println(Car.numbeOfCars);

    }
}

