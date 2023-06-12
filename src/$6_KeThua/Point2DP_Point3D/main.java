package $6_KeThua.Point2DP_Point3D;

public class main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.5f, 4.2f);
        System.out.println("Point2D: " + point2D);
        System.out.println("X: " + point2D.getX());
        System.out.println("Y: " + point2D.getY());
        point2D.setX(2.0f);
        point2D.setY(1.5f);
        System.out.println("New Point2D: " + point2D);

        System.out.println();

        Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D: " + point3D);
        System.out.println("X: " + point3D.getX());
        System.out.println("Y: " + point3D.getY());
        System.out.println("Z: " + point3D.getXYZ()[2]);
        point3D.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println("New Point3D: " + point3D);
    }
}
