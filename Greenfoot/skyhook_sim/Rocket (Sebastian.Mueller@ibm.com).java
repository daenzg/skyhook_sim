import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public rocket()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/15, image.getHeight()/15);
        setImage(image);
    }
    
    public void act()
    {
        control();
        attachGraber1();
        //attachGraber2();
    }
    public void control()
    {
        if (Greenfoot.isKeyDown("a"))
        {
            setRotation(180);
            move(4);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setRotation(0);
            move(4);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
            move(4);
        }
        if (Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
            move(4);
        }
    }
    public void attachGraber1()
    {
        
        java.util.List actors = getWorld().getObjects(graber1.class);
        
        if (! actors.isEmpty())
        {
            Actor actor = (Actor)actors.get(0);
            turnTowards(actor.getX(), actor.getY());
            move(3);
            // setRotation(0); // to maintain upright actor
        }
    }
    
}
