import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
       
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        time = 1000;
        prepare();
        score = 0;
       setPaintOrder(Border.class);
        showTime();
        showScore();
        
    }
    private void showTime()
    {
        showText("Time:" + time, 700, 25);
    }
    
       private void countTime()
    {
        time--;
        showTime();
        if (time == 0) 
        {
            Greenfoot.stop();
            showEndMessage();
        }
    }
    private void showScore()

    {
        showText ("Score:" + score, 80, 25);
    }
    private void showEndMessage()
    {
        showText("Time is up!", 390, 350);
        showText("your final score" + score + "points", 390, 170);
    }
    public void addScore(int points)
    {
        score = score + points;
        showScore();
        if (score < 0) 
        {
            Greenfoot.stop();
            Greenfoot.playSound("game-over.wav");
            
        }
    }
    public void act() {
        
        
        
        
      
  