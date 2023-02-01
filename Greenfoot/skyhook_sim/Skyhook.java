import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Dies ist eine Überklasse der beiden Skyhooks. Hier wird ledigtlich die Grösse des Bildes in
 * der Simulation bestimmt, da die Skyhooks nicht unterschiedlich gross sein sollten.
 * 
 * @author (Daniel Furrer, Marc Geiger, Sebastian Müller) 
 * @version (01.02.2023)
 */
public class Skyhook extends Actor
{
    boolean active;
    /**
     * Act - do whatever the skyhooks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Skyhook()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/3, image.getHeight()/3);
        setImage(image);
    }
    
    public void act()
    {
        
    }
}
