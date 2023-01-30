import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class skyhook1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skyhook1 extends Skyhook
{
    static boolean hook1 = true;
    /**
     * Act - do whatever the skyhook1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        spin();
    }
    public void spin()
    {
        int rotationalSpeed = -2;
        turn(rotationalSpeed);
        
    }
}
