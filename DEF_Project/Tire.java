import greenfoot.*; 


public class Tire extends Actor
{
    

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
