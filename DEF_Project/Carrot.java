import greenfoot.*;  


public class Carrot extends Actor
{
  
     public Carrot()
    {
        GreenfootImage carrot = getImage();
        carrot.scale(80, 60);
        setImage(carrot);
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
