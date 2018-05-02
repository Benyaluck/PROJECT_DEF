import greenfoot.*;
import java.util.ArrayList;
public class Monster3 extends Actor
{
    public Monster3(){
        GreenfootImage Monster3 = getImage();
        Monster3.scale(30,30);
        setImage(Monster3);
    
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
          moveLeft();   
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
        else if(getX()!=278&&intersections[1]==false)
        {
            moveLeft();
        }
        else if(getX()==278&&intersections[1]==false)
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
       else if(getX()!=233&&intersections[3]==false)
        {
            moveLeft();
        }
        else if(getX()==233&&intersections[3]==false)
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
         else if(getX()!=322&&intersections[5]==false)
        {
            moveRight();
        }
         else if(getX()==322&&intersections[5]==false)
        {
            intersections[5]=true;
        }
         
        //6
         else if(getY()!=29&&intersections[6]==false)
        {
            moveUp();
        }
         else if(getY()==29&&intersections[6]==false)
        {
            intersections[6]=true;
        }
         
        //7
         else if(getX()!=412&&intersections[7]==false)
        {
            moveRight();
        }
         else if(getX()==412&&intersections[7]==false)
        {
            intersections[7]=true;
        }
         
        //8
         else if(getY()!=354&&intersections[8]==false)
        {
            moveDown();
        }
         else if(getY()==354&&intersections[8]==false)
        {
            intersections[8]=true;
        }
         
        //9
         else if(getX()!=489&&intersections[9]==false)
        {
            moveRight();
        }
         else if(getX()==489&&intersections[9]==false)
        {
            intersections[9]=true;
        }
         
        //10
         else if(getY()!=395&&intersections[10]==false)
        {
            moveDown();
        }
         else if(getY()==395&&intersections[10]==false)
        {
            intersections[10]=true;
        }
         
        //11
         else if(getX()!=111&&intersections[11]==false)
        {
            moveLeft();
        }
         else if(getX()==111&&intersections[11]==false)
        {
            intersections[11]=true;
        }
         
        //12
         else if(getY()!=356&&intersections[12]==false)
        {
            moveUp();
        }
         else if(getY()==356&&intersections[12]==false)
        {
            intersections[12]=true;
        }
         
        //13
         else if(getX()!=185&&intersections[13]==false)
        {
            moveRight();
        }
         else if(getX()==185&&intersections[13]==false)
        {
            intersections[13]=true;
        }
         
        //14
         else if(getY()!=199&&intersections[14]==false)
        {
            moveUp();
        }
         else if(getY()==199&&intersections[14]==false)
        {
            intersections[14]=true;
        }
         
        //15
         else if(getX()!=369&&intersections[15]==false)
        {
            moveLeft();
        }
         else if(getX()==369&&intersections[15]==false)
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
         else if(getX()!=300&&intersections[17]==false)
        {
            moveLeft();
        }
         else if(getX()==300&&intersections[17]==false)
        {
            intersections[17]=true;
            for(int i=0;i<intersections.length-1;i++)
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
