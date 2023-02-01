import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Dies ist die Andockstelle für die Raumschiffe am Skyhook der Erde. 
 * 
 * @author (Daniel Furrer, Marc Geiger, Sebastian Müller) 
 * @version (01.02.2023)
 */
public class Graber1 extends Skyhook1
{
    public int rotationalSpeedGraber1 = -2;
    public int radiusGraber1 = 2;
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
        turn(rotationalSpeedGraber1);
        move(radiusGraber1);
    } 
}
