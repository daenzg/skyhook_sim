import greenfoot.*;

/**
 * Dies ist der Skyhook im Orbit der Erde. Er dreht sich und seine boolean Variabel kann aktiv
 * gesetzt werden, damit Raumschiffe ihn ansteuern können.
 * 
 * @author (Daniel Furrer, Marc Geiger, Sebastian Müller) 
 * @version (01.02.2023)
 */

public class Skyhook1 extends Skyhook {
    
    static boolean hook1 = false;
    static boolean ufohook1 = false;
    public int rotationalSpeedHook1 = -2;
    
    public void act() {
        spin();
    }
    
    public void spin() {
        turn(rotationalSpeedHook1);
    }
}
