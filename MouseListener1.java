import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*;  
public class MouseListener1 extends JFrame implements MouseListener{  
    Label l;  
    JFrame f;
    MouseListener1(){  
        addMouseListener(this);  
          
        l=new Label();  
        l.setBounds(20,50,100,20);  
        add(l);  
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);
        
    }  


    public void mouseClicked(MouseEvent e) {  
        l.setText("Mouse Clicked");
        int x = e.getX();
        int y = e.getY();
        System.out.println("Co-ordinates of Mouse: " +x+ "," +y);  
    }  
    public void mouseEntered(MouseEvent e) {  
        l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        l.setText("Mouse Pressed");  
    } 
    public void mouseClicked1(MouseEvent e){
        Graphics g=f.getGraphics();  
        g.setColor(Color.BLUE);  
        g.fillOval(e.getX(),e.getY(),10,10);
    }
    public void mouseReleased(MouseEvent e) {  
        l.setText("Mouse Released");  
    }  
public static void main(String[] args) {  
    new MouseListener1();  
}  
}  