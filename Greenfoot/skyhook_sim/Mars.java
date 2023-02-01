 import greenfoot.*;

/**
 * Heimatplanet der ausserirdischen Spezies (sind freundlich).
 * 
 * @author (Daniel Furrer, Marc Geiger, Sebastian Müller) 
 * @version (01.02.2023)
 */

public class Mars extends Planets {
    static boolean planetMars = false;
    public Mars() { // Constructor 
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/20, image.getHeight()/20);
        setImage(image);
    }
}
