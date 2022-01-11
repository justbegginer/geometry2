package classes.figures2D;

import classes.figuresAbstract.Vector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector2DTest {

    @Test
    void sum() {
        Vector2D vector2D = new Vector2D(0, 1);
        vector2D.sum(new Vector2D(4, 3));
        assertTrue(vector2D.equal(new Vector2D(4, 4)));
    }

    @Test
    void minus() {
        Vector2D vector2D = new Vector2D(5, 4);
        vector2D.minus(new Vector2D(3, 2));
        assertTrue(vector2D.equal(new Vector2D(2, 2)));
    }

    @Test
    void inverse() {
        Vector2D vector2D = new Vector2D(10, -13);
        vector2D.inverse();
        assertTrue(vector2D.equal(new Vector2D(-10, 13)));
    }

    @Test
    void dot() {
        Vector2D vector2D = new Vector2D(5, 4);
        assertEquals(vector2D.dot(vector2D), 41);
    }

    @Test
    void relation(){
        Vector2D vector2D = new Vector2D(3, 4);
        Vector2D vector2D1 = new Vector2D(3, 4);
        assertEquals(vector2D.relation(vector2D1), "co-directional");
        vector2D1.inverse();
        assertEquals(vector2D.relation(vector2D1), "oppositely-directional");
        vector2D1.setY(0);
        assertEquals(vector2D.relation(vector2D1), "have no relation");
    }
}