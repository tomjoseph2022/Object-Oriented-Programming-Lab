import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class CBGroup extends Applet implements ItemListener
{
String msg="";
Checkbox Red,Green,Yellow;
CheckboxGroup cbg;
public void init()
{
    cbg=new CheckboxGroup();
    Red=new Checkbox("RED",cbg,false);
    Green=new Checkbox("GREEN",cbg,false);
    Yellow=new Checkbox("YELLOW",cbg,false);
    add(Red);
    add(Yellow);
    add(Green);
    Red.addItemListener(this);
    Green.addItemListener(this);
    Yellow.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
    repaint();
    }
    public void paint(Graphics g)
    {
    //g.drawOval(10,10,50,50);
    if(cbg.getSelectedCheckbox().getLabel()=="RED")
    {
    g.setColor(Color.red);
    g.fillOval(10,10,50,50);
    } if(cbg.getSelectedCheckbox().getLabel()=="YELLOW")
    {
    g.setColor(Color.yellow);
    g.fillOval(10,10,50,50);
    }
    if(cbg.getSelectedCheckbox().getLabel()=="GREEN")
    {
    g.setColor(Color.green);
    g.fillOval(10,10,50,50);
    }
    }
    }