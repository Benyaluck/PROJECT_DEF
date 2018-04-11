import greenfoot.*;  

public class Bomb extends Actor
{
    public Bomb()
    {
        GreenfootImage bomb = getImage();
        bomb.scale(70, 50);
        setImage(bomb);
    }
    
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
