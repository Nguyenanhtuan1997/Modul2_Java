package class_crile;

public class Circle {
    private int id;
    private double radius;
    private static final double PI = 3.14;
    private static int count = 0;
    private static double maxRadius = 0;
    private static double Sum = 0;

    public Circle(double radius) {
        this.id = ++count;
        this.radius = radius;
        if (radius > maxRadius) {
            maxRadius = radius;
        }
        Sum= Sum + getArea() ;
    }
    public static double getSum(){
        return Sum;
    }

    public double getArea() {

        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }


    public static double getMaxRadius(){

        return maxRadius;
    }

    public static int getCount() {
        return count;
    }
}

//`id` và `radius` là các trường private trong class Circle.
//`PI` là thuộc tính hằng static.
//`count` là thuộc tính static để đếm số lượng đối tượng đã tạo của lớp Circle.
//`maxRadius` là thuộc tính static để lưu giá trị bán kính lớn nhất của hình tròn.
//Phương thức khởi tạo dùng để khởi tạo giá trị cho `id` và `radius` và thêm `count` và `maxRadius`.
//Phương thức `getArea` và `getPerimeter` để tính diện tích và chu vi hình tròn.
//Phương thức `getTotalArea` để lấy tổng diện tích các hình tròn.
//Phương thức `getCount` để lấy số lượng đối tượng của lớp Circle.