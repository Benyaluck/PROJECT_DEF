import greenfoot.*;
public class GameOverScreen extends Actor
{
    public void act(){
        
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new Title());
            
        }
    }
}
