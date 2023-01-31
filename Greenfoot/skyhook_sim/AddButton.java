import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AddButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AddButton extends Actor
{
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
        if (Greenfoot.mousePressed(this))
        {
            Rocket rocket = new Rocket();
            getWorld().addObject(rocket,554, 316);
            Skyhook1.hook1 = true;
        }
    }
}
