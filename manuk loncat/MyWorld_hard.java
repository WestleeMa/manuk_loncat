import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld_hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld_hard extends World
{

    /**
     * Constructor for objects of class MyWorld_hard.
     * 
     */
    public MyWorld_hard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new manuk_hard(), 100, 200);
        addObject(new corong_hard(), 300, 150);
        addObject(new corong_hard(), 450, 150);
        addObject(new corong_hard(), 700, 150);
        addObject(new poin(), 300, 100);
    }
}
