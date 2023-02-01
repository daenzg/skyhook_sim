import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    
    private int timeMars = 0;
    private int timeEarth = 0;
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
        landMars();
        landEarth();
        
        
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
        
            if (getX() == 97 && getY() == 225)
            {
                Skyhook1.hook1 = true;
                Skyhook2.hook2 = false;
            }
        }
    }
    public void landMars()
    {
        if (getX() >= 70 && getY() <= 60)
        {
            if (timeMars == 0)
            {
                Skyhook2.hook2 = true;

            }
            else
            {
                timeMars--;
            }
            return;
        }
        
        if (getX() >= 46 && getY() <= 123 && getX() <= 70 && getY() >= 59)
        {
            timeMars = 10;
            Skyhook2.hook2 = false;
            
            int speed = 5;
            
            turnTowards(70,60);
            move(speed);
        }
        
    }
    public void landEarth()
    {
        if (getX() <= 515 && getY() >= 315)
        {
            if (timeEarth == 0)
            {
                Skyhook1.hook1 = true;
                
            }
            else
            {
                timeEarth--;
            }
            return;
        }
        
        if (getX() >= 460 && getY() >= 247 && getX() <= 510 && getY() <= 315)
        {
            timeEarth = 10;
            Skyhook1.hook1 = false;
            
            int speed = 5;
            
            turnTowards(515,320);
            move(speed);
            
        }
    }
}

