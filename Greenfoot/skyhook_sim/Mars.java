import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Heimatplanet der ausserirdischen Spezies (sind freundlich).
 * 
 * @author (Daniel Furrer, Marc Geiger, Sebastian Müller) 
 * @version (01.02.2023)
 */
public class Mars extends Planets
{
    static boolean planetMars = false;
    /**
     * Act - do whatever the mars wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Mars() //constructor
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/20, image.getHeight()/20);
        setImage(image);
    }
    
    public void act()
    {
        
    }
}
