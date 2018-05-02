import greenfoot.*;
import java.util.ArrayList;
public class Monster2 extends Actor
{
    public Monster2(){
        GreenfootImage Monster2 = getImage();
        Monster2.scale(30,30);
        setImage(Monster2);
    
    }
    
     boolean[] intersections = new boolean[24];
     int teleportCount=0;
     int soundCount=0;
    public void act() 
    {
        if(soundCount%120==0)
        {
          Greenfoot.playSound("siren_sound.mp3");
        }
        soundCount++;
        //starting position
       if(this.isTouching(TeleportWall.class))
       {
        teleportCount++;
       if(teleportCount%2==1)
       {
          this.setLocation(497,200);
       }
       if(teleportCount%2==0)
       {
          this.setLocation(117,199);
       }
       }
       //move to middle position
         if(getX()!=300&&intersections[23]==false)
        {
         moveRight();   
        }
        else if(getX()==300&&intersections[23]==false)
        {
         intersections[23]=true;
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
        else if(getX()!=366&&intersections[1]==false)
        {
            moveRight();
        }
        else if(getX()==366&&intersections[1]==false)
        {
            intersections[1]=true;
        }
        
        //2
        else if(getY()!=276&&intersections[2]==false)
        {
            moveDown();
        }
       else if(getY()==276&&intersections[2]==false)
        {
            intersections[2]=true;
        }
        
        //3
       else if(getX()!=326&&intersections[3]==false)
        {
            moveLeft();
        }
        else if(getX()==326&&intersections[3]==false)
        {
            intersections[3]=true;
        }
        
        //4
         else if(getY()!=315&&intersections[4]==false)
        {
            moveDown();
        }
         else if(getY()==315&&intersections[4]==false)
        {
            intersections[4]=true;
        }
         
        //5
         else if(getX()!=231&&intersections[5]==false)
        {
            moveLeft();
        }
         else if(getX()==231&&intersections[5]==false)
        {
            intersections[5]=true;
        }
         
        //6
         else if(getY()!=356&&intersections[6]==false)
        {
            moveDown();
        }
         else if(getY()==356&&intersections[6]==false)
        {
            intersections[6]=true;
        }
         
        //7
         else if(getX()!=278&&intersections[7]==false)
        {
            moveRight();
        }
         else if(getX()==278&&intersections[7]==false)
        {
            intersections[7]=true;
        }
         
        //8
         else if(getY()!=394&&intersections[8]==false)
        {
            moveDown();
        }
         else if(getY()==394&&intersections[8]==false)
        {
            intersections[8]=true;
        }
         
        //9
         else if(getX()!=114&&intersections[9]==false)
        {
            moveLeft();
        }
         else if(getX()==114&&intersections[9]==false)
        {
            intersections[9]=true;
        }
         
        //10
         else if(getY()!=361&&intersections[10]==false)
        {
            moveUp();
        }
         else if(getY()==361&&intersections[10]==false)
        {
            intersections[10]=true;
        }
         
        //11
         else if(getX()!=140&&intersections[11]==false)
        {
            moveRight();
        }
         else if(getX()==140&&intersections[11]==false)
        {
            intersections[11]=true;
        }
         
        //12
         else if(getY()!=320&&intersections[12]==false)
        {
            moveUp();
        }
         else if(getY()==320&&intersections[12]==false)
        {
            intersections[12]=true;
        }
         
        //13
         else if(getX()!=113&&intersections[13]==false)
        {
            moveLeft();
        }
         else if(getX()==113&&intersections[13]==false)
        {
            intersections[13]=true;
        }
         
        //14
         else if(getY()!=279&&intersections[14]==false)
        {
            moveUp();
        }
         else if(getY()==279&&intersections[14]==false)
        {
            intersections[14]=true;
        }
         
        //15
         else if(getX()!=186&&intersections[15]==false)
        {
            moveRight();
        }
         else if(getX()==186&&intersections[15]==false)
        {
            intersections[15]=true;
        }
         
        //16
         else if(getY()!=81&&intersections[16]==false)
        {
            moveUp();
        }
         else if(getY()==81&&intersections[16]==false)
        {
            intersections[16]=true;
        }
         
        //17
         else if(getX()!=233&&intersections[17]==false)
        {
            moveRight();
        }
         else if(getX()==233&&intersections[17]==false)
        {
            intersections[17]=true;
        }
        
         
        //18
         else if(getY()!=120&&intersections[18]==false)
        {
            moveDown();
        }
         else if(getY()==120&&intersections[18]==false)
        {
            intersections[18]=true;
        }
         
        //19
         else if(getX()!=277&&intersections[19]==false)
        {
            moveRight();
        }
         else if(getX()==277&&intersections[19]==false)
        {
            intersections[19]=true;
        }
         
        //20
         else if(getY()!=160&&intersections[20]==false)
        {
            moveDown();
        }
         else if(getY()==160&&intersections[20]==false)
        {
            intersections[20]=true;
        }
         
        //21
         else if(getX()!=300&&intersections[21]==false)
        {
            moveRight();
        }
         else if(getX()==300&&intersections[21]==false)
        {
            intersections[21]=true;
            for(int i=1;i<intersections.length-2;i++)
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
