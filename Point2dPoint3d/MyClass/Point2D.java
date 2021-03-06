package Point2dPoint3d.MyClass;

public class Point2D {
    private float x = 0.0f;
    private float y =   0.0f;
    public Point2D(){
    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setXY(float x,float y) {
        this.x = x;
        this.y = y;
    }
    public float[]getXY (){
        float [] arr = {x,y};
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                " " + "{" + getXY()[0] + "," + getXY()[1] +
                '}';
    }
}
