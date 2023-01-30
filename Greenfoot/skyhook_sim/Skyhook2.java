import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class skyhhok2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skyhook2 extends Skyhook
{
    static boolean hook2 = false;
    /**
     * Act - do whatever the skyhhok2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        spin();
    }
    public void spin()
    {
        int rotationalSpeed = 2;
        turn(rotationalSpeed);
        
    }
}
