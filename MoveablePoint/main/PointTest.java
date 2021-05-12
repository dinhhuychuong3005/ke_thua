package MoveablePoint.main;

import MoveablePoint.myclass.MoveablePoint;
import MoveablePoint.myclass.Point;

public class PointTest {
    public static void main(String[] args) {
        MoveablePoint movable = new MoveablePoint(1,1,1,1);
        System.out.println(movable.toString());
        movable.move();
        System.out.println(movable.toString());
        movable.setxSpeed(2);
        movable.setySpeed(2);
        movable.move();
        System.out.println(movable.toString());
        movable.setSpeed(3,3);
        movable.move();
        System.out.println(movable.toString() + "\n");

        MoveablePoint movable1 = new MoveablePoint(1,1);
        System.out.println(movable1.toString());
        movable1.move();
        System.out.println(movable1.toString());
        movable1.setxSpeed(4);
        movable1.setySpeed(4);
        movable1.move();
        System.out.println(movable1.toString());
        movable1.setSpeed(5,5);
        movable1.move();
        System.out.println(movable1.toString() + "\n");

        MoveablePoint movable2 = new MoveablePoint();
        System.out.println(movable2.toString());
        movable2.move();
        movable2.setSpeed(10,10);
        movable2.move();
        System.out.println(movable2.toString());
    }
}
