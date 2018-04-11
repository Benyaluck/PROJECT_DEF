import greenfoot.*;  


public class Power extends Actor
{
  
     public Power()
    {
        GreenfootImage power = getImage();
        power.scale(80, 60);
        setImage(power);
    }

    public void act() 
    {
        setLocation(getX()-2, getY());
        turn(1);

        if (getX() == 0) 
        {

            defworld bloodstream = (defworld) getWorld();

            bloodstream.removeObject(this);

        }
    }  
}
