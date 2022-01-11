package classes.figures2D;

import classes.figuresAbstract.Vector;

public class Vector2D extends Vector {

    public Vector2D(double x, double y) {
        super(x, y);
    }

    public void sum(Vector2D anotherVector){
        super.sum(anotherVector);
    }

    public void minus(Vector2D anotherVector){
        super.minus(anotherVector);
    }

    public void inverse(Vector2D anotherVector) { super.inverse();}

    public double dot(Vector2D anotherVector) { return super.dot(anotherVector);}

    public boolean equal(Vector2D anotherVector) { return super.equal(anotherVector); }

    public double length() { return super.length();}

    public String relation(Vector2D anotherVector) { return super.relation(anotherVector); }

    @Override
    public String toString() {
        return "Vector2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
