import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class graber2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Graber2 extends Skyhook2
{
    /**
     * Act - do whatever the graber2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        orbitMars();
    }
    public void orbitMars()
    {
        int rotationalSpeed = 2;
        int radius = -2;
        
        turn(rotationalSpeed);
        move(radius);
    } 
}
