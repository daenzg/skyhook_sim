 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        // Add your action code here.
    }
}
