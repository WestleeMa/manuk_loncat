import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class corong_easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class corong_easy extends Actor
{
    /**
     * Act - do whatever the corong_easy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public corong_easy(){
        GreenfootImage image = getImage ();
        image.scale(500,900);
    }
    public void act()
    {
        setLocation(getX() -2, getY());
        if(getX()<=1){
            setLocation(getX() + 600, Greenfoot.getRandomNumber(250)+50);
        }
    }
}

