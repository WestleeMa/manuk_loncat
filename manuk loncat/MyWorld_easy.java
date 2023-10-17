import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld_easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld_easy extends World
{

    /**
     * Constructor for objects of class MyWorld_easy.
     * 
     */
    public MyWorld_easy()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new manuk_easy(), 100, 200);
        addObject(new corong_easy(), 300, 150);
        addObject(new poin(), 300, 100);
    }
}
