package MoveablePoint.main;

import MoveablePoint.myclass.MoveablePoint;

public class MoveTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        MoveablePoint moveablePoint1 = new MoveablePoint(2.3f,-2.3f);
        MoveablePoint moveablePoint2 = new MoveablePoint(2.4f,-2.4f,3.5f,-2f);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint1);
        moveablePoint1.move();
        System.out.println(moveablePoint2);
        moveablePoint2.move();
    }
}
