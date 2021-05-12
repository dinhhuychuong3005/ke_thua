package CircleAndCylinder.Main;

import CircleAndCylinder.MyClass.Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5);
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder(5,3,"black");
        System.out.println(cylinder1);
    }
}
