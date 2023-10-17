import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poin extends Actor
{
    /**
     * Act - do whatever the poin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int score;
    public poin(){
        score = 0;
    }
    public void act()
    {
        GreenfootImage poin = new GreenfootImage(String.valueOf(score), 50, Color.WHITE, new Color(0, 0, 0));
        getWorld().getBackground().drawImage(poin, (getX()-220), (getY()-50));
    }
        public static void add(int num){
        score += num;
    }
}
