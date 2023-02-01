import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Kreiert die Rackete in der Simulation auf der Erde. Der Knopf kann nur eimal gedrückt werden.
 * 
 * @author (Daniel Furrer, Marc Geiger, Sebastian Müller) 
 * @version (01.02.2023)
 */
public class AddButton extends Actor
{
    private boolean clicked = false;
    /**
     * Act - do whatever the AddButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public AddButton()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/3, image.getHeight()/3);
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
            Rocket rocket = new Rocket();
            getWorld().addObject(rocket,554, 316);
            Skyhook1.hook1 = true;
        }
    }
}
