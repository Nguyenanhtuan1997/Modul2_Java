package $1_Introduction_to_Java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        float width ;
        float heigth ;

        Scanner scanner = new Scanner(System.in); //Khai báo đối tượng Scanner
        System.out.println("Enter width: ");
        width = scanner.nextFloat(); // nhap chieu rong

        System.out.println("Enter heigth: ");
        heigth = scanner.nextFloat(); // nhap chieu dai
        float area = width * heigth;

        System.out.println("Area is: " + area);
    }
}
