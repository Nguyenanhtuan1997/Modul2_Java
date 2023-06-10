package BaitapModul2;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(3);
        Circle circle3 = new Circle(4.5);

        System.out.println("Số lượng đối tượng của lớp Circle là: " + Circle.getCount());

        System.out.println("Diện tích của circle1 là: " + circle1.getArea());
        System.out.println("Chu vi của circle1 là: " + circle1.getPerimeter());

        System.out.println("Bán kính lớn nhất của hình tròn là: " + Circle.getMaxRadius());

        System.out.println("Tổng diện tích của các hình tròn là: " + Circle.getTotalArea());
    }
}


