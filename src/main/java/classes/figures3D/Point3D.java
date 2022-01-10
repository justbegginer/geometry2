package classes.figures3D;

import classes.figuresAbstract.Point;

public class Point3D extends Point {
    double z;
    public Point3D(int x, int y, int z){
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
}
