package classes.figures3D;

import classes.figuresAbstract.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void equal() {
        Point3D point3D = new Point3D(0, 0, 0);
        Point3D point3D1 = new Point3D(1, 0, 0);
        Point3D point3D2 = new Point3D(0, 0 ,0);
        assertTrue(point3D.equal(point3D2));
        assertFalse(point3D.equal(point3D1));
    }
    @Test
    void length(){
        Point3D point3D = new Point3D(0, 0 , 1);
        Point3D point3D1 = new Point3D(0, 3, 4);
        assertEquals(point3D.length(), 1);
        assertEquals(point3D1.length(), 5);
    }
}