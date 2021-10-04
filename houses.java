import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class houses extends Applet implements MouseListener , Runnable {

    private Color textColor = Color.BLACK;
  
    public void paint (Graphics g)
    {
        g.setColor (new Color(139,69,19)); 
        int x[] = {98,300,501};
        int y[] = {250,130,250};
        g.drawPolygon(x,y,3);
        g.drawRect (100,250,400,200);
         
    }
    public void init(){
        this.setSize(200,200);
        addMouseListener(this);
    
    }
    public void run()//taking a exception
    {
        while(true)
        {
            repaint();
            try{
                Thread.sleep(17);
            
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void mouseClicked(MouseEvent e)
    {
        int x=e.getX(), y=e.getY();
        if(x>=60&&x<=120 && y>=80 && y<=95)
        textColor=Color.red;
        else{
            textColor=Color.blue;
            repaint();
            System.out.println("Mouse x="+x+"  y="+y+" ");

        } 
       
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}


}  
