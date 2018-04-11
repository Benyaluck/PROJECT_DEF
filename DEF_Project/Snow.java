import greenfoot.*; 


public class Snow extends Actor
{
    public Snow()
    {
        GreenfootImage snow = getImage();
        snow.scale(30, 30);
        setImage(snow);
    }

    public void act() 
    {
        setLocation(getX()-2, getY());
        turn(1);
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    }    
}
