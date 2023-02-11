/**
*
*
*
*@Author Niraj Jadhav
*This program is implementation of MouseAdapter in JFrames
*/ 

import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;
/**
* Extending MouseAdapter in JFrames
*/
  
public class MousePosition extends MouseAdapter{  
    JFrame f;  
/**
*Preparing Layout For JFrame
*Implementinng MouseListener
*/ 
    MousePosition(){  
        f=new JFrame("Mouse Adapter");  
        f.addMouseListener(this);  
   
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
    } 
/**
*Creating MouseEvent 
*Deciding Graphics of Mouse 
*Reading the Co-Ordinates of Mouse using Mouselistener
*/
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