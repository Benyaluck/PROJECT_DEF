import greenfoot.*; 


public class Car extends Actor
{
    public Car()
    {
        GreenfootImage car = getImage();
        car.scale(140, 120);
        setImage(car);
    }
    
    /** 
     * Check whether we are touching a bacterium or virus. Remove 
     * bacteria. Game over if we hit a virus.
     */
    private void checkCollision()
    {
        if (isTouching(Power.class))
        { 
            Greenfoot.playSound("floop2_x.wav");
            removeTouching(Power.class);

            defworld defworld =(defworld) getWorld();
            defworld.addScore(20);
        }
        if (isTouching(Spike.class))
        {
            Greenfoot.playSound("explosion_x.wav");
            defworld defworld =(defworld) getWorld();
            removeTouching(Spike.class);
            defworld.addScore(-50);

        }
    }

    public void act() 
    {
        checkKeyPress();
        checkCollision();

    }


    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-4);
        }

        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+4);
        }
        if (Greenfoot.isKeyDown("left") )
        {
            move(-3);

        }
        if (Greenfoot.isKeyDown("right") )
        {
            move (3);

        }
        
        
    }   

}
