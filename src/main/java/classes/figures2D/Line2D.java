package classes.figures2D;

import classes.figuresAbstract.Line;
import classes.figuresAbstract.Point;

public class Line2D extends Line {
    public Line2D(Point2D A, Point2D B) {
        super(A, B);
    }

    public double length(){
        Point2D point2D = new Point2D(A.getX() - B.getX(), A.getY() - B.getY());
        return point2D.length();
    }
}
