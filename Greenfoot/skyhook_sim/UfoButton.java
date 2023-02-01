import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Kreiert das UFO in der Simulation auf dem Mars. Der Knopf kann nur eimal gedrückt werden.
 * 
 * @author (Daniel Furrer, Marc Geiger, Sebastian Müller) 
 * @version (01.02.2023)
 */
public class UfoButton extends Actor
{
    private boolean clicked = false;
    /**
     * Act - do whatever the AddButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public UfoButton()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/4, image.getHeight()/4);
        setImage(image);
        
        
    }
    
    public void act()
    {
        MouseClick();    
    }
    public void MouseClick()
    {
        if (Greenfoot.mousePressed(this) && !clicked)
        {
            clicked = true;
            Ufo ufo = new Ufo();
            getWorld().addObject(ufo,27, 61);
            Skyhook2.ufohook2 = true;
        }
    }
}
