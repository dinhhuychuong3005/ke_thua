package Point2dPoint3d.MyClass;

import Point2dPoint3d.MyClass.Point2D;

public class Point3D extends Point2D {
private float z;
public Point3D(){
    this.z = 0.0f;
}
public Point3D(float x, float y, float z){
    super(x, y);
    this.z = z;
}

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
    this.setX(x);
    this.setY(y);
    this.z = z;
    }
    public float[] getXYZ(){
    float[]arr1 = {getX(),getY(),getZ()};
    return arr1;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + getZ() +
                " " + "{" + getXYZ()[0] + "," + getXYZ()[1] + "," + getXYZ()[2] +
                '}';
    }
}
