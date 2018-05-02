import greenfoot.*;  


public class RestartScreen extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("PRINCESS.mp3");
    
    public RestartScreen()
    {    
        
        super(600, 400, 1); 
    }
    
    public void act(){
        backgroundMusic.play();
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new Title());
            backgroundMusic.pause();
        }
    }
}
