package CircleAndCylinder.MyClass;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double height,double radius, String color){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
//    @Override
//    public double getArea(){
//        return 2*Math.PI*super.getRadius()*(super.getRadius()+height);
//    }
    public double getVolume(){
        return this.height*super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "radius=" + super.getRadius() +
                "color" + super.getColor() +
                "Area" + getArea() +
                "Volume" + getVolume() +
                '}';
    }
}
