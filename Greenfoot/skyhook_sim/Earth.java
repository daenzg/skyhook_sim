import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class earth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Earth extends Planets
{
    static boolean planetEarth = false;
    /**
     * Act - do whatever the earth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Earth() //constructor
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/5, image.getHeight()/5);
        setImage(image);
    }
    
    public void act()
    {
        
    }
}
