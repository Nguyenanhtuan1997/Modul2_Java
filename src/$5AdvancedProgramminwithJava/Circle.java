package $5AdvancedProgramminwithJava;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

 private double getRadius() {
        return radius;
    }

 private double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2.5);

        // Truy cập vào các phương thức getRadius() và getArea()
        // sau khi đã thay đổi access modifier sang private.



        System.out.println("Radius: " +circle.getRadius());
        System.out.println("Area: " + circle.getArea());
    }
}

