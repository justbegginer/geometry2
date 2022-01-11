package classes.figuresAbstract;

public abstract class Line {
    protected Point A, B;
    protected Line(Point A, Point B){
        this.A = A;
        this.B = B;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point a) {
        A = a;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point b) {
        B = b;
    }

    @Override
    public String toString() {
        return "Line{" +
                "A=" + A +
                ", B=" + B +
                '}';
    }
}
