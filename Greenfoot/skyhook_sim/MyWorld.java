import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * In dieser Simulation wird das Prinzip des Skyhooks dargestllt.
 * Dieser befördert Racketen, Raumschiffe, usw. ins All und hilft bei der
 * Landung, damit Treibstoffe gespart werden kann. 
 * Wenn ein Raumschiff ins All geschleudert wird verliert der Skyhook energie 
 * und verlangsamt sich, da er seine Energie auf das Raumschiff überträgt. 
 * Bei der Landung wird die Energie der zum bsp. Rackete auf den Skyhook 
 * übertragen, damit das Raumschiff nicht mit voller Geschwindigkeit in die
 * Athmosphäre eintritt. 
 * Mit den zwei
 * 
 * @author (Daniel Furrer, Marc Geiger, Sebastian Müller) 
 * @version (01.02.2023)
 */
public class MyWorld extends World
{
    Skyhook1 skyhook1;
    Skyhook2 skyhook2;
    
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
        skyhook2 = new Skyhook2();
        addObject(skyhook2,80,170);
        skyhook2.setLocation(80,170);
        skyhook2.turn(-32);
        //actor graber1
        Graber1 graber1 = new Graber1();
        addObject(graber1,505,263);        
        graber1.setLocation(505,263);
        //actor graber2
        Graber2 graber2 = new Graber2();
        addObject(graber2,85,225);
        graber2.setLocation(85,225);
        //actor addbutton
        AddButton addbutton = new AddButton();
        addObject(addbutton,39,359);
        addbutton.setLocation(39,359);
        //actor ufobutton
        UfoButton ufobutton = new UfoButton();
        addObject(ufobutton, 117, 359);
        ufobutton.setLocation(117, 359);
        //actor punkt
    }
}
