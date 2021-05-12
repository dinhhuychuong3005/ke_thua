package triangle.main;

import triangle.Class.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape shape1 = new Shape("blue",false);
        System.out.println(shape);
        System.out.println(shape1);
    }
}
