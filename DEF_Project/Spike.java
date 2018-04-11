import greenfoot.*;  

public class Spike extends Actor
{
    /**
     * Act - do whatever the Virus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-4, getY());
        turn(1);
        checkCollision();
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }

    }    
    private void checkCollision()
    {
        if (isTouching(Car.class))
        { 
            Greenfoot.playSound("explosion_x.wav");
            removeTouching(Car.class);

            Greenfoot.stop();

        }
    }
}
