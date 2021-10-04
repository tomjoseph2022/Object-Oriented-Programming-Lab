import java.awt.*;
import java.awt.event.*;
public class choice
{
    choice()//con
    {
        Frame f=new Frame();
        final Label label=new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);
        Button b=new Button("show");
        b.setBounds(200,100,50,20);
        final Choice c=new Choice();//choice class object
        c.setBounds(100,100,75,75);
        c.add("c");
        c.add("c++");
        c.add("PHP");
        c.add("android");
        f.add(c);
        f.add(label);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String data="program language select:" +c.getItem(c.getSelectedIndex());
                label.setText(data);

            }
        });

        
    }
    public static void main(String[] args) {
        new choice();
    }
}