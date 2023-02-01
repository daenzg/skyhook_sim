import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Dies ist der Skyhook im Orbit des Marses. Er dreht sich und seine boolean Variabel kann aktiv
 * gesetzt werden, damit Raumschiffe ihn ansteuern können.
 * 
 * @author (Daniel Furrer, Marc Geiger, Sebastian Müller) 
 * @version (01.02.2023)
 */
public class Skyhook2 extends Skyhook
{
    static boolean hook2 = false;
    static boolean ufohook2 = false;
    public int rotationalSpeedHook2 = 2;
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
        turn(rotationalSpeedHook2);
    }
}
