import greenfoot.*;

/**
 * Dies ist die Andockstelle für die Raumschiffe am Skyhook Earth. 
 * 
 * @author (Daniel Furrer, Marc Geiger, Sebastian Müller) 
 * @version (01.02.2023)
 */

public class Graber1 extends Skyhook1 {
    
    public int rotationalSpeedGraber1 = -2;
    public int radiusGraber1 = 2;
    
    public void act() {
        orbitMars();
    }
    
    public void orbitMars() {
        turn(rotationalSpeedGraber1);
        move(radiusGraber1);
    } 
}
