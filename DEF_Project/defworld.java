// PRAEW GIFT KHANG
import greenfoot.*;  

public class defworld extends World
{
    
    
    private int score;
    public int time;
    
    public defworld()
    {    
        super(780, 500, 1); 
        
        
        prepare();
        score = 0;
        time = 2000;
        showScore();
        showTime();
        showEndMessage();

    }

    public void addScore(int value) 
    {
        score = score + value;
        showText("Score: " + score, 80, 25);

    }

    private void showScore()
    {
        showText("Score: " + score, 80, 25);
    }

    public void act()
    {

        if (Greenfoot.getRandomNumber(100) < .5)
        {
            addObject(new Bomb(), 779, Greenfoot.getRandomNumber(360));

        }
        if (Greenfoot.getRandomNumber(100) < 4)
        {
            addObject(new Snow(), 779, Greenfoot.getRandomNumber(360));
        }   
        if (Greenfoot.getRandomNumber(100) < 4)
        {
            addObject(new Carrot(), 779, Greenfoot.getRandomNumber(360));

        }
       
       
        countTime();
        showTime();
        showEndMessage();

    }

 
    private void prepare()
    {
        Car car = new Car();
        addObject(car, 83, 179);

      
    }

    private void countTime()
    {
        time--;
        showTime();
        if (time == 0)
        {
            showEndMessage();
            Greenfoot.stop();
        }

    }      

    private void showTime()
    {
        showText("Time:" + time, 700, 25);
    }

    private void showEndMessage()
    {   
        if (time == 0)
        {

            showText("Time is up you win!", 390, 150);
            showText("Your final score " + score + " points", 390, 170);
        }

    }

    private void endGame()
    {
        if (score < 0)

        {
            Greenfoot.stop();
        }

    }
}  

