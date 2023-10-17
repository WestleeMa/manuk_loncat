import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Difficulty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Difficulty extends World
{

    /**
     * Constructor for objects of class Difficulty.
     * 
     */
    public Difficulty()
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
        title title = new title();
        addObject(title,304,111);
        title.setLocation(317,85);
        Normal normal = new Normal();
        addObject(normal,305,267);
        easy easy = new easy();
        addObject(easy,117,268);
        hard hard = new hard();
        addObject(hard,480,267);
        easy.setLocation(130,271);
    }
}
