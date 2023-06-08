package $4_lop_doi_tuong_Java;
import java.util.Scanner;
 // Tạo lớp Rectangle, khai báo các thuộc tính.
public class Rectangle {
    double width, height;

    public Rectangle() {
    }
  // định nghĩa các phương thức khởi tạo (contructors).
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
     //Định nghĩa các phương thức getArea(), getPerimeter(), display()
     public double getArea() {
        return this.width * this.height;
     }

     public double getPerimeter() {
        return (this.width + this.height) * 2;
     }

     public String display() {
         return "Rectangle{" + "width=" + width + ", height=" + height + "}";
     }
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the width:");
         double width = scanner.nextDouble();
         System.out.print("Enter the height:");
         double height = scanner.nextDouble();
         Rectangle rectangle = new Rectangle(width, height);
         System.out.println("Your Rectangle \n"+ rectangle.display());
         System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
         System.out.println("Area of the Rectangle: "+ rectangle.getArea());
     }
}

