import greenfoot.*;
import java.util.ArrayList;
public class Monster1 extends Actor
{
     public Monster1(){
        GreenfootImage Monster1 = getImage();
        Monster1.scale(30,30);
        setImage(Monster1);
    
    }
    
     boolean[] intersections = new boolean[19];
     int teleportCount=0;
    public void act() 
    {
        //starting position
       if(this.isTouching(TeleportWall.class))
        {
           teleportCount++;
           if(teleportCount%2==1)
           {
            this.setLocation(495,200);
           }
           if(teleportCount%2==0)
           {
           this.setLocation(117,199);
            }
       }
       //move to middle position
         if(getX()!=300&&intersections[18]==false)
        {
         moveRight();   
        }
        else if(getX()==300&&intersections[18]==false)
        {
         intersections[18]=true;
        }
       //0
        else if(getY()!=160&&intersections[0]==false)
        {
         moveUp();   
        }
        else if(getY()==160&&intersections[0]==false)
        {
         intersections[0]=true;
        }
        
        //1
        else if(getX()!=324&&intersections[1]==false)
        {
            moveRight();
        }
        else if(getX()==324&&intersections[1]==false)
        {
            intersections[1]=true;
        }
        
        //2
        else if(getY()!=121&&intersections[2]==false)
        {
            moveUp();
        }
       else if(getY()==121&&intersections[2]==false)
        {
            intersections[2]=true;
        }
        
        //3
       else if(getX()!=367&&intersections[3]==false)
        {
            moveRight();
        }
        else if(getX()==367&&intersections[3]==false)
        {
            intersections[3]=true;
        }
        
        //4
         else if(getY()!=82&&intersections[4]==false)
        {
            moveUp();
        }
         else if(getY()==82&&intersections[4]==false)
        {
            intersections[4]=true;
        }
         
        //5
         else if(getX()!=413&&intersections[5]==false)
        {
            moveRight();
        }
         else if(getX()==413&&intersections[5]==false)
        {
            intersections[5]=true;
        }
         
        //6
         else if(getY()!=126&&intersections[6]==false)
        {
            moveDown();
        }
         else if(getY()==126&&intersections[6]==false)
        {
            intersections[6]=true;
        }
         
        //7
         else if(getX()!=489&&intersections[7]==false)
        {
            moveRight();
        }
         else if(getX()==489&&intersections[7]==false)
        {
            intersections[7]=true;
        }
         
        //8
         else if(getY()!=32&&intersections[8]==false)
        {
            moveUp();
        }
         else if(getY()==32&&intersections[8]==false)
        {
            intersections[8]=true;
        }
         
        //9
         else if(getX()!=320&&intersections[9]==false)
        {
            moveLeft();
        }
         else if(getX()==320&&intersections[9]==false)
        {
            intersections[9]=true;
        }
         
        //10
         else if(getY()!=82&&intersections[10]==false)
        {
            moveDown();
        }
         else if(getY()==82&&intersections[10]==false)
        {
            intersections[10]=true;
        }
         
        //11
         else if(getX()!=113&&intersections[11]==false)
        {
            moveLeft();
        }
         else if(getX()==113&&intersections[11]==false)
        {
            intersections[11]=true;
        }
         
        //12
         else if(getY()!=120&&intersections[12]==false)
        {
            moveDown();
        }
         else if(getY()==120&&intersections[12]==false)
        {
            intersections[12]=true;
        }
         
        //13
         else if(getX()!=187&&intersections[13]==false)
        {
            moveRight();
        }
         else if(getX()==187&&intersections[13]==false)
        {
            intersections[13]=true;
        }
         
        //14
         else if(getY()!=199&&intersections[14]==false)
        {
            moveDown();
        }
         else if(getY()==199&&intersections[14]==false)
        {
            intersections[14]=true;
        }
         
        //15
         else if(getX()!=370&&intersections[15]==false)
        {
            moveLeft();
        }
         else if(getX()==370&&intersections[15]==false)
        {
            intersections[15]=true;
        }
         
        //16
         else if(getY()!=160&&intersections[16]==false)
        {
            moveUp();
        }
         else if(getY()==160&&intersections[16]==false)
        {
            intersections[16]=true;
        }
         
        //17
         else if(getX()!=324&&intersections[17]==false)
        {
            moveLeft();
        }
         else if(getX()==324&&intersections[17]==false)
        {
            intersections[17]=true;
            for(int i=1;i<intersections.length-1;i++)
            {
                intersections[i]=false;
            }
        }
    }
    public void moveLeft()
    {
           move(-1);
    }
    public void moveRight()
    {
           setRotation(0);
           move(1);
    }
    public void moveUp()
    {
           setLocation(getX(),getY()-1);
    }
    public void moveDown()
    {
           setLocation(getX(),getY()+1);
    }
}
