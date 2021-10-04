import java.awt.*;
import java.applet.*;
public class myapplet extends Applet
{
    public void init()
    {
        System.out.println("Applet iontialized");
    }
    public void start()
    {
        System.out.println("Applet execution started");
    }
    public void stop()
    {
        System.out.println("Applet execution stoped");
    }
    public void paint(Graphics g)
    {
        System.out.println("Painting");
    }
    public void destroy()
    {
        System.out.println("applet distroyed");
    }
}