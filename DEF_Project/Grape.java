import greenfoot.*;  


public class Grape extends Actor
{
  
     public Grape()
    {
        GreenfootImage grape = getImage();
        grape.scale(60, 0);
        setImage(grape);
    }

    public void act() 
    {
        setLocation(getX()-2, getY());
        turn(1);

        if (getX() == 0) 
        {

            defworld defworld = (defworld) getWorld();

            defworld.removeObject(this);

        }
    }  
}
