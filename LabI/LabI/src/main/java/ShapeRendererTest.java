import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeRendererTest {

    @Test
    void testToString() {
        String expected = "00000\n" +
                "00000\n" +
                "00000\n" +
                "00000\n" +
                "00000\n";
        ShapeRenderer s = new ShapeRenderer(null, 5,5);
        String str = s.toString();
        assertEquals(expected,str);
    }

    @Test
    void createRectangle() {
        String expected = "11111\n" +
                "11111\n" +
                "11111\n" +
                "11111\n" +
                "11111\n";
        ShapeRenderer s = new ShapeRenderer(null, 5,5);
        s.createRectangle(2,2);
        String str = s.toString();
        assertEquals(expected,str);
    }

    @Test
    void createOval() {
        String expected = "00100\n" +
                "01110\n" +
                "11111\n" +
                "01110\n" +
                "00100\n";
        ShapeRenderer s = new ShapeRenderer(null, 5,5);
        s.createOval(2,2);
        String str = s.toString();
        assertEquals(expected,str);
    }


    @Test
    void testConstructorFalse() {
        ShapeRenderer s = new ShapeRenderer(null, 9, 9);
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                assertEquals(false, s.get(i,j));
    }

    @Test
    void testConstructor() {
        InvalidDimensionException exception = assertThrows(InvalidDimensionException.class, () ->
                new ShapeRenderer(null, -9, -9));
    }

    @Test
    void testOvalThrows() {
        ShapeRenderer s = new ShapeRenderer(null, 9, 9);
        InvalidDimensionException exception = assertThrows(InvalidDimensionException.class, () ->
                s.createOval(3,3));
    }

    @Test
    void testRectThrows() {
        ShapeRenderer s = new ShapeRenderer(null, 9, 9);
        InvalidDimensionException exception = assertThrows(InvalidDimensionException.class, () ->
                s.createRectangle(3,3));
    }

}