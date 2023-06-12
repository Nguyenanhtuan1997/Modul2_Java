package $6_KeThua.Circle_Cylinder;

public class main {
    public static void main(String[] args) {
        // Kiểm thử lớp Circle
        Circle circle = new Circle(5.0, "red");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Area: " + circle.getArea());
        System.out.println(circle);

        System.out.println();

        // Kiểm thử lớp Cylinder
        Cylinder cylinder = new Cylinder(3.0, "blue", 10.0);
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Color: " + cylinder.getColor());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + cylinder.getVolume());
        System.out.println(cylinder);
    }

}
