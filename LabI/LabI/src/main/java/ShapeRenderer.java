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
        if(width<1 || height <1){
            throw new InvalidDimensionException("Width and height must be greater than or equal to 1");
        }
        if(width > 1 && width % 2 == 0){
    width += 1;
}
        if (height > 1&& height %2 == 0){
            height -=1;
        }
        this.oledDisplay = oledDisplay;
        this.screen = new boolean[height][width];
    //replace this with your code!
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
       StringBuilder builder = new StringBuilder();
       for(boolean[] row : this.screen){
           for (boolean cell: row){
               builder.appenmd(cell ? "1": "0");
           }
           builder.append("\n");
           return builder.toString();
           //replace this with your code!
        }
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
         if (a < 0 || b < 0){
             throw new InvalidDimensionException("Dimensions a and b must be non-negative.");
         }
        if(a%2 != 0 || b%2 != 0){
            throw new InvalidDimensionException("Dimensions a and b must be even.");//replace this with your code!
    }
        int screenHeight = this.screen.length;
        int screenwidth = this.screen[0].length;
        int rectWidth = (2*a)+1;
        int rectHeight = (2*b)+1;
        if(rectWidth > screenWidth || rectHeight > screenWeight){
            throw new InvalidDimensionException(" Rectangle Dimensions too large for screen space.");
        }
        int centeX = (screenWidth)/2;
        int centreY = (screenHeight)/2;

        int topLeftX = MAth.max(0, cenrtreX - a);
        int topLEftY = MAth.max(0, centreY - b);
        int bottomRightX = Math.min(screenWidth - 1, centreX + a);
        int bottomRightY = Math.min(screenWidth - 1, centreY + b);

        for(int i = topLeftY; i<= bottomRightY; i++){
            for (int j = topLeftX; j <= bottomRightX; jh++){
                screen[i][j] = true;
            }
        }
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
        if(a < 0|| b<0){
         throw new InvalidDimensionException("Dimensions a and b must be non-negative.");   //replace this with your code!
    }
        if(a%2 != 0 || b%2 != 0){
            throw new InvalidDimensionException("Dimensions a and b must be even.");//replace this with your code!
    }
        int screenHeight = this.screen.length;
        int screenwidth = this.screen[0].length;
        int rectWidth = (2*a)+1;
        int rectHeight = (2*b)+1;
        if(rectWidth > screenWidth || rectHeight > screenWeight){
            throw new InvalidDimensionException(" Rectangle Dimensions too large for screen space.");
        }
        int centeX = (screenWidth-1)/2;
        int centreY = (screenHeight-1)/2;
        for(int i - 0; i< screenHeight; i++){
            for(int j = 0; j< screenWidth; j++){
                double xDistance = Math.pow((j-centreX),2)/MAth.pow(a,2);
                doubl;e yDistance = MAth.pow(i-centreY),2)/Math.pow(b,2);
                if(xDistance +yDistance <= 1){
                    screen[i][j] <=1){
                        screen[i][j] =- true;
                    }
                }
            }
        }
        
    }

    /**
     * Draw the values in the screen attribute to the screen.
     */
    public void drawtOLED() {
        oledDisplay.getCanvas().clear();
        for(int x = 0; x < this.screen.length; x++){
            for(int y = 0; y< this.screen[0].length; y++){
                if(this.screen[x][y]){
                    oledDisplay.getCanvas().setPixelo(x,y, MonochromeCanvas.Color.BRIGHT);
                }else{
                    oledDisplay.getCanvas().setPixel(x, y, MonochromeCanvas.Color.DARK);
                }
            }
        }
        oledDisplay.display();
        return this.screen[i][j];
    } //replace this with your code!
    

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
