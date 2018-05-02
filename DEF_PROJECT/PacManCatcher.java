import greenfoot.*;
import java.util.ArrayList;
public class PacManCatcher extends Actor
{
    public Object returnIntersectingBalls()
    {
        return this.getOneIntersectingObject(Banana.class);
    }
    public Object returnIntersectingFruit()
    {
        return this.getOneIntersectingObject(Fruit.class);
    }
    public Object returnIntersectingRedGhost()
    {
        return this.getOneIntersectingObject(Monster2.class);
    }
    public Object returnIntersectingPinkGhost()
    {
        return this.getOneIntersectingObject(Monster1.class);
    }
    public Object returnIntersectingBlueGhost()
    {
        return this.getOneIntersectingObject(Monster4.class);
    }
    public Object returnIntersectingOrangeGhost()
    {
        return this.getOneIntersectingObject(Monster3.class);
    }
    public Object returnIntersectingBigBall()
    {
        return this.getOneIntersectingObject(Mushroom.class);
    }
}
