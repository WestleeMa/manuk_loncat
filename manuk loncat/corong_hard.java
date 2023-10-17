import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class corong_hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class corong_hard extends Actor
{
    /**
     * Act - do whatever the corong_hard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public corong_hard(){
        GreenfootImage image = getImage ();
        image.scale(500,900);
    }
    public void act()
    {
        setLocation(getX() -5, getY());
        if(getX()<=1){
            setLocation(getX() + 600, Greenfoot.getRandomNumber(110)+100);
        }
    }
}

