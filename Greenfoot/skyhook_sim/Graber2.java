import greenfoot.*;

/**
 * Dies ist die Andockstelle für die Raumschiffe am Skyhook des Marses.
 * 
 * @author (Daniel Furrer, Marc Geiger, Sebastian Müller) 
 * @version (01.02.2023)
 */

public class Graber2 extends Skyhook2 {
    
    public int rotationalSpeedGraber2 = 2;
    public int radiusGraber2 = -2;
    
    public void act() {
        orbitMars();
    }
    
    public void orbitMars() {
        turn(rotationalSpeedGraber2);
        move(radiusGraber2);
    } 
}
