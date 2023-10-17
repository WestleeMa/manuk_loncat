import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class manuk_hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class manuk_hard extends Actor
{
    /**
     * Act - do whatever the manuk_hard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private double g = 1;
    private int y = 200;
    private boolean haspressed = false;
    private boolean isalive = true;
    private boolean isacross = false;
    private boolean hasaddscore = false;
    
    public manuk_hard(){
        GreenfootImage image = getImage();
        image.scale(60,52);
    }
    public void act()
    {
        if(Pressed()){
            g=-1.2;
        }
        g += 0.1;
        y += g;
        setLocation(getX(), (int)(y));
        if(isTouchpipe()){
            isalive = false;
        }
        if(!isalive){
            getWorld().addObject(new manuk_modar(), 300, 150);
            getWorld().addObject(new replay(), 300, 300);
            getWorld().removeObject(this);
        }
        if(!hasaddscore && isacross && isalive){
            Greenfoot.playSound("score.mp3");
            poin.add(1);
        }
        hasaddscore = isacross;
    }
    public boolean Pressed(){
        boolean pressed = false;
        if(Greenfoot.isKeyDown("Space") || Greenfoot.mouseClicked(null)){
            if(!haspressed){
                Greenfoot.playSound("flay..mp3");
                pressed = true;
            }
            haspressed = true;
        }else{
            haspressed = false;
        }
        return pressed;
    }
    public boolean isTouchpipe(){
        isacross = false;
        for(corong_hard corong_hard : getWorld().getObjects(corong_hard.class)){
            if(Math.abs(corong_hard.getX() - getX()) < 69) {
            if(Math.abs(corong_hard.getY() + 30 - getY()) > 37){
                Greenfoot.playSound("flay.mp3");
                isalive = false;
            }
            isacross = true;
        }
    }
    return !isalive;
}
}
