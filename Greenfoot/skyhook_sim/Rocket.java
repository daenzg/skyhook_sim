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
    public Rocket()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/15, image.getHeight()/15);
        setImage(image);
    }
    
    public void act()
    {
        attachGraber1();
        attachGraber2();
    }
    public void attachGraber2()
    {
        if (Skyhook1.hook1 == true)
        {
            java.util.List actors = getWorld().getObjects(Graber1.class);
            
           if (! actors.isEmpty())
           {
                Actor actor = (Actor)actors.get(0);
                turnTowards(actor.getX(), actor.getY());
                move(3);
                setRotation(90); // to maintain upright actor
                
           }
           if (getX() == 502 && getY() == 147)
           {
               Skyhook1.hook1 = false;
               Skyhook2.hook2 = true;
           }
        }
    }
    public void attachGraber1()
    {
        if (Skyhook2.hook2 == true)
        {
            java.util.List actors = getWorld().getObjects(Graber2.class);
            
            if (! actors.isEmpty())
            {
                Actor actor = (Actor)actors.get(0);
                turnTowards(actor.getX(), actor.getY());
                move(3);
                setRotation(270); // to maintain upright actor
                
            }
        
            if (getX() == 119 && getY() == 117)
            {
                Skyhook1.hook1 = true;
                Skyhook2.hook2 = false;
            }
        }
    }    
}