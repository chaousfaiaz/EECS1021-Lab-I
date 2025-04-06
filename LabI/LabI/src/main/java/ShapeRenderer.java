import org.firmata4j.ssd1306.MonochromeCanvas; //for colors!
import org.firmata4j.ssd1306.SSD1306;

public class ShapeRenderer {

    boolean [][] screen;
    SSD1306 oledDisplay;

    /**
     * Constructor for a ShapeRenderer.  In the constructor you must
     * 1. Check to see that width and height are odd integer values.
     * -- If either value is less than 1, throw an InvalidDimensionException
     * -- If either value is even and greater than 1, subtract one from it (in order to make it odd).
     * 2. Initialize the oledDisplay attribute to the value supplied in the input
     * 3. Initialize the screen attribute so it can hold a 2d array of booleans of dimension width x height.
     * 4. Set every value in the screen attribute to be false.
     *
     * @param oledDisplay the OLED to reference
     * @param width the screen width
     * @param height the screen height
     */
    public ShapeRenderer(SSD1306 oledDisplay, int width, int height) {
        throw new UnsupportedOperationException(); //replace this with your code!
    }

    /**
     * Print out the contents of the screen array to
     * the console.  Represent each false with a 0
     * and each true with a 1.  Add a newline
     * after each row in the array.
     *
     * @return a String representation of the array contents
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException(); //replace this with your code!
    }

    /**
     * Create a rectangle of true values within the screen attribute.
     * This method should accept two EVEN integers as input,
     * a and b.  It will then set every element in the
     * screen attribute to TRUE if and only if the element is within
     * a rectangle centered in the middle of the array
     * (i.e. at floor(width/2)+1, floor(height/2) + 1) and with
     * width of 2a + 1 and height of 2b + 1.  Every other element in the screen
     * attribute should remain false.
     *
     * If the input parameters are less than 0 or bigger than the
     * screen's dimensions, however, throw an
     * InvalidDimensionException.  Also throw an InvalidDimensionException
     * if the input values (a and b) are ODD.
     *
     * @param a defines the rectangle width
     * @param b defines the rectangle height
     * @throws InvalidDimensionException when a or b is odd, or outside the screen dimensions
     */
    public void createRectangle(int a, int b) throws InvalidDimensionException {
        throw new UnsupportedOperationException(); //replace this with your code!
    }


    /**
     * Create an oval within the screen attribute.
     * This method should accept two EVEN integers as input,
     * a and b.  It will then set every element in the
     * screen attribute to TRUE if and only if the element is within
     * an oval centered in the middle of the array
     * (i.e. at floor(width/2)+1, floor(height/2) + 1) and with
     * width of 2a + 1 and height of 2b + 1. Every other element in the screen
     * attribute should remain false.
     *
     * If the input parameters are less than 0 or outside the dimensions
     * of the screen attribute, however, throw an
     * InvalidDimensionException. Also throw and
     * InvalidDimensionException if a or b is ODD.
     *
     * @param a an even value that defines the oval width
     * @param b an even value that defines the oval height
     * @throws InvalidDimensionException when a or b is odd, or outside the screen dimensions
     */
    public void createOval(int a, int b) throws InvalidDimensionException {
        throw new UnsupportedOperationException(); //replace this with your code!
    }

    /**
     * Draw the values in the screen attribute to the screen.
     */
    public void drawtOLED() {
        throw new UnsupportedOperationException(); //replace this with your code!
    }

    /**
     * Get a value from the screen array.
     * Don't change this method.
     *
     * @param i
     * @param j
     * @return the value at the position i,j in the screen array
     */
    public boolean get(int i, int j) {
        return this.screen[i][j];
    }

}