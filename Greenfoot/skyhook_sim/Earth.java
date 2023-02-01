import greenfoot.*;

/**
 * Heimatplanet der menschlichen Spezies.
 * 
 * @author (Daniel Furrer, Marc Geiger, Sebastian Müller) 
 * @version (01.02.2023)
 */

public class Earth extends Planets {
    static boolean planetEarth = false;
    public Earth() { // Constructor
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/5, image.getHeight()/5);
        setImage(image);
    }
}