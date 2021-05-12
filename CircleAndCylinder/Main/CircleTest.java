package CircleAndCylinder.Main;

import CircleAndCylinder.MyClass.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(4,"blue");
        System.out.println(circle1);
    }
}
