import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Das UFO wird vom Mars aus gestartet bewegt sich mittels den Skyhooks zwischen dem Mars und 
 * der Erde. Die Aliens sind fortschrittlicher als die Menschen, deshalb verfügt das UFO über
 * eine Ausweichfunktion, damit es nicht mit der Rackete kollidiert.
 * 
 * @author (Daniel Furrer, Marc Geiger, Sebastian Müller) 
 * @version (01.02.2023)
 */
public class Ufo extends Actor
{
    private int timeMars = 0;
    private int timeEarth = 0;
    /**
     * Act - do whatever the rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ufo()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/15, image.getHeight()/15);
        setImage(image);
    }
    
    public void act()
    {
        collisionCheck();
        attachGraber1();
        attachGraber2();
        landMars();
        landEarth();
    }
    public void attachGraber2()
    {
        if (Skyhook1.ufohook1 == true)
        {
           java.util.List actors = getWorld().getObjects(Graber1.class);
            
           if (! actors.isEmpty())
           {
                Actor actor = (Actor)actors.get(0);
                turnTowards(actor.getX(), actor.getY());
                move(4);
                setRotation(0); // to maintain upright actor
           }
           if (getX() >= 500 && getY() >= 145 && getX() <= 505 && getY() <= 155)
           {
               Skyhook1.ufohook1 = false;
               Skyhook2.ufohook2 = true;
               
               // decrease speed of skyhook1 and graber1
               Skyhook1 objHook1 = (Skyhook1)getWorld().getObjects(Skyhook1.class).get(0);
               Graber1 objRotation1 = (Graber1)getWorld().getObjects(Graber1.class).get(0);
               Graber1 objRadius1 = (Graber1)getWorld().getObjects(Graber1.class).get(0);
               
               objHook1.rotationalSpeedHook1 = -1;
               objRotation1.rotationalSpeedGraber1 = -1;
               objRadius1.radiusGraber1 = 1;
           }
        }
    }
    public void attachGraber1()
    {
        if (Skyhook2.ufohook2 == true)
        {
            java.util.List actors = getWorld().getObjects(Graber2.class);
            
            if (! actors.isEmpty())
            {
                Actor actor = (Actor)actors.get(0);
                turnTowards(actor.getX(), actor.getY());
                move(4);
                setRotation(360); // to maintain upright actor
            }
        
            if (getX() <= 95 && getY() <= 227 && getX() >= 87 && getY() >= 205)
            {
               Skyhook1.ufohook1 = true;
               Skyhook2.ufohook2 = false;
                
               // decrease speed of skyhook2 and graber2
               Skyhook2 objHook2 = (Skyhook2)getWorld().getObjects(Skyhook2.class).get(0);
               Graber2 objRotation2 = (Graber2)getWorld().getObjects(Graber2.class).get(0);
               Graber2 objRadius2 = (Graber2)getWorld().getObjects(Graber2.class).get(0);
               
               objHook2.rotationalSpeedHook2 = 1;
               objRotation2.rotationalSpeedGraber2 = 1;
               objRadius2.radiusGraber2 = -1;
            }
        }
    }
    public void landMars()
    {
        if (getX() >= 70 && getY() <= 60)
        {
            if (timeMars == 0)
            {
                Skyhook2.ufohook2 = true;
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
            Skyhook2.ufohook2 = false;
            int speed = 5;
            turnTowards(70,60);
            move(speed);
            // increase speed of skyhook2 and graber2
            Skyhook2 objHook2 = (Skyhook2)getWorld().getObjects(Skyhook2.class).get(0); 
            Graber2 objRotation2 = (Graber2)getWorld().getObjects(Graber2.class).get(0);   
            Graber2 objRadius2 = (Graber2)getWorld().getObjects(Graber2.class).get(0);
            
            objHook2.rotationalSpeedHook2 = 2;
            objRotation2.rotationalSpeedGraber2 = 2;
            objRadius2.radiusGraber2 = -2;
        }
        
    }
    public void landEarth()
    {
        if (getX() <= 515 && getY() >= 315)
        {
            if (timeEarth == 0)
            {
                Skyhook1.ufohook1 = true;
            }
            else
            {
                timeEarth--;
            }
            return;
        }
        
        if (getX() >= 460 && getY() >= 247 && getX() <= 513 && getY() <= 315)
        {
            timeEarth = 10;
            Skyhook1.ufohook1 = false;
            int speed = 5;
            turnTowards(515,320);
            move(speed);
            // increase speed of skyhook1 and graber1
            Skyhook1 objHook1 = (Skyhook1)getWorld().getObjects(Skyhook1.class).get(0);  
            Graber1 objRotation1 = (Graber1)getWorld().getObjects(Graber1.class).get(0);  
            Graber1 objRadius1 = (Graber1)getWorld().getObjects(Graber1.class).get(0);
            
            objHook1.rotationalSpeedHook1 = -2;
            objRotation1.rotationalSpeedGraber1 = -2;
            objRadius1.radiusGraber1 = 2;
        }
    }
    public void collisionCheck()
    {
        Rocket objRocket = (Rocket)getOneIntersectingObject(Rocket.class);
        if (objRocket != null)
        {
            double radius = 30;
            double angle = 2 * Math.PI * Math.random();
            int x = (int)(getX() + radius * Math.cos(angle));
            int y = (int)(getY() + radius * Math.sin(angle));
            setLocation(x, y);
            return;
        }
    }
}

