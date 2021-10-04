import java.awt.*;
import java.applet.*;

public class shapesapplet extends  Applet {
    public void paint(Graphics g)
    {
        g.drawRect(10, 15, 100, 150);
        g.setColor(Color.pink);
        g.drawOval(150, 102, 100, 130);
        
}
}