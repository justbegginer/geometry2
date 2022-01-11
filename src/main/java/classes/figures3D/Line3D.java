package classes.figures3D;

import classes.figuresAbstract.Line;
import classes.figuresAbstract.Point;

public class Line3D extends Line {

    public Line3D(Point3D A, Point3D B) {
        super(A, B);
    }

    public double length(){
        Point3D point3D = new Point3D(0, 0, 0);
        point3D.setX(A.getX() - B.getX());
        point3D.setY(A.getY() - B.getY());
        point3D.setZ(((Point3D)A).getZ() - ((Point3D)B).getZ());
        return point3D.length();
    }

}
