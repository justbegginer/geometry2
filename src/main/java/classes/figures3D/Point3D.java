package classes.figures3D;

import classes.figuresAbstract.Point;

public class Point3D extends Point {
    double z;
    public Point3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString().substring(0, super.toString().length() - 2) + // Point without }
                ", z=" + z +
                '}';
    }

    public boolean equal(Point3D point3D){
        return super.equals(point3D) && this.z == point3D.z;
    }

    public double length(){
        return Math.sqrt(x*x+y*y+z*z);
    }
}
