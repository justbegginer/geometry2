package classes.figures2D;

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
}