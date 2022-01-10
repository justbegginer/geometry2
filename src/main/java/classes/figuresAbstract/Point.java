package classes.figuresAbstract;

import java.util.ArrayList;

public abstract class Point {
    protected double x,y;

    protected Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    protected boolean equals(Point point){
        return point.x == this.x && point.y == this.y;
    }

    protected double length(){
        return Math.sqrt(x*x+y*y);
    }
    @Override
    public String toString() {
        return "Point = {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
