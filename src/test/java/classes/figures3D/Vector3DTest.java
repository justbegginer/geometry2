package classes.figures3D;

import classes.figures2D.Vector2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector3DTest {

    @Test
    void sum() {
        Vector3D vector3D = new Vector3D(0, 1, 1);
        vector3D.sum(new Vector3D(4, 3, 1));
        assertTrue(vector3D.equal(new Vector3D(4, 4, 2)));
    }

    @Test
    void minus() {
        Vector3D vector3D = new Vector3D(5, 4, 1);
        vector3D.minus(new Vector3D(3, 2, 1));
        assertTrue(vector3D.equal(new Vector3D(2, 2, 0)));
    }

    @Test
    void inverse() {
        Vector3D vector3D = new Vector3D(10, -13, 100);
        vector3D.inverse();
        assertTrue(vector3D.equal(new Vector3D(-10, 13, -100)));
    }

    @Test
    void dot() {
        Vector3D vector3D = new Vector3D(5, 4, 2);
        assertEquals(vector3D.dot(vector3D), 45);
    }

    @Test
    void relation() {
        Vector3D vector3D = new Vector3D(4, 4, 4);
        Vector3D vector3D1 = new Vector3D(4, 4, 4);
        assertEquals(vector3D.relation(vector3D1), "co-directional");
        vector3D1.inverse();
        assertEquals(vector3D.relation(vector3D1), "oppositely-directional");
        vector3D.setZ(0);
        assertEquals(vector3D.relation(vector3D1), "have no relation");
    }
}