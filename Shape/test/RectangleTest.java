package Shape.test;

import Shape.Model.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        Rectangle rectangle1 = new Rectangle(3,5);
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(2,3,"blue",true);
        System.out.println(rectangle2);
    }
}
