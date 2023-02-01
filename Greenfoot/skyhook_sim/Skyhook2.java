import greenfoot.*;

/**
 * Dies ist der Skyhook im Orbit des Mars. Er dreht sich und seine boolean Variabel kann aktiv
 * gesetzt werden, damit Raumschiffe ihn ansteuern können.
 * 
 * @author (Daniel Furrer, Marc Geiger, Sebastian Müller) 
 * @version (01.02.2023)
 */

public class Skyhook2 extends Skyhook {
    
    static boolean hook2 = false;
    static boolean ufohook2 = false;
    public int rotationalSpeedHook2 = 2;
    
    public void act() {
        spin();
    }
    
    public void spin() {
        turn(rotationalSpeedHook2);
    }
}
