package triangle.main;

import triangle.Class.Triangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1,side2,side3;
        do {
            System.out.println("Nhập 3 cạnh của tam giác:");
            System.out.println("Enter side1:");
             side1 = sc.nextDouble();
            System.out.println("Enter side2:");
             side2 = sc.nextDouble();
            System.out.println("Enter side3:");
             side3 = sc.nextDouble();
        }while (!Triangle.isTriangle(side1,side2,side3));
        Triangle triangle = new Triangle(side1,side2,side3,"black",false);
        Triangle triangle1 = new Triangle();
        System.out.println(triangle1);
        System.out.println(triangle);
    }
}
