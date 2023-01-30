import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class graber1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Graber1 extends Skyhook1
{
    /**
     * Act - do whatever the graber1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        orbitEarth();    
    }
    public void orbitEarth()
    {
        int rotationalSpeed = -2;
        int radius = 2;
        
        turn(rotationalSpeed);
        move(radius);
    }   
}
