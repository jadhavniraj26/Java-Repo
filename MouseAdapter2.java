import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  
public class MouseAdapter2 extends MouseAdapter{  
    JFrame f;  
    MouseAdapter2(){  
        f=new JFrame("Mouse Adapter");  
        f.addMouseListener(this);  
   
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
    public void mouseClicked(MouseEvent e) {  
        Graphics g=f.getGraphics();  
        g.setColor(Color.BLUE);  
        g.fillOval(e.getX(),e.getY(),10,10);
        int x = e.getX();
        int y = e.getY();
        System.out.println("Co-ordinates of Mouse: " +x+ "," +y);  
    }  
      
public static void main(String[] args) {  
    new MouseAdapter2();  
}  
}  