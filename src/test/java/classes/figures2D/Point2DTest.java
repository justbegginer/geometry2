package classes.figures2D;

import classes.figures3D.Point3D;
import classes.figuresAbstract.Point;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void isPointsOnSameLine() {
        ArrayList<Point2D> point2D = new ArrayList<>();
        point2D.add(new Point2D(0, 0));
        point2D.add(new Point2D(1, 1));
        point2D.add(new Point2D(2, 2));
        point2D.add(new Point2D(3, 3));
        assertTrue(Point2D.isPointsOnSameLine(point2D));
        point2D.add(new Point2D(1, 5));
        assertFalse(Point2D.isPointsOnSameLine(point2D));
    }

    @Test
    void equal(){
        Point2D point2D = new Point2D(0, 0);
        Point2D point2D1 = new Point2D(1, 0);
        Point2D point2D2 = new Point2D(0, 0);
        assertTrue(point2D.equal(point2D2));
        assertFalse(point2D.equal(point2D1));
    }

    @Test
    void length(){
        Point2D point2D = new Point2D(3, 4);
        Point2D point2D1 = new Point2D(6, 8);
        assertEquals(point2D.length(), 5);
        assertEquals(point2D1.length(), 10);
    }
}