import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Skyhook1 skyhook1;
    Skyhook2 skyhhok2;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //actor mars
        Mars mars = new Mars();
        addObject(mars,70,60);
        mars.setLocation(70,60);
        //actor earth
        Earth earth = new Earth();
        addObject(earth,515,320);
        earth.setLocation(515,320);
        //actor skyhook1
        skyhook1 = new Skyhook1();
        addObject(skyhook1,502,208);
        skyhook1.setLocation(502,208);
        skyhook1.turn(30);
        //actor skyhook2
        skyhhok2 = new Skyhook2();
        addObject(skyhhok2,80,170);
        skyhhok2.setLocation(80,170);
        skyhhok2.turn(-32);
        //actor graber1
        Graber1 graber1 = new Graber1();
        addObject(graber1,505,263);        
        graber1.setLocation( 505,263);
        //actor graber2
        Graber2 graber2 = new Graber2();
        addObject(graber2,85,225);
        graber2.setLocation(85,225);
        //actor addbutton
        AddButton addbutton = new AddButton();
        addObject(addbutton,39,359);
        addbutton.setLocation(39,359);
        //actor rocket
        //Rocket rocket = new Rocket();
        //addObject(rocket, 472, 315);
        //rocket.setLocation(472, 315);
    }
}
