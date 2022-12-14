import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class home extends World
{

    /**
     * Constructor for objects of class home.
     * 
     */
    public home()
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
        play play = new play();
        addObject(play,297,237);
        title title = new title();
        addObject(title,304,111);
        title.setLocation(297,117);
        title.setLocation(367,101);
        title.setLocation(333,98);
        title.setLocation(288,98);
        title.setLocation(313,116);
        title.setLocation(267,133);
        title.setLocation(260,130);
        title.setLocation(360,70);
        title.setLocation(307,112);
        title.setLocation(302,113);
        title.setLocation(336,101);
        play.setLocation(322,239);
        play.setLocation(304,234);
        play.setLocation(291,318);
        title.setLocation(282,101);
        play.setLocation(302,305);
        title.setLocation(295,71);
        title.setLocation(317,85);
    }
}
