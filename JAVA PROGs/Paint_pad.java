

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author VarunTHK7
 */
public class Paint_pad extends JFrame implements MouseMotionListener{
    ArrayList<paint_pad_arraylist> al = new ArrayList<>();
    int i=0,j=0 ;
    int x1_val,y1_val;
    int x2_val,y2_val;
    int x1_val_temp,y1_val_temp;
    int p,q;
    public Paint_pad()  {
        
//        addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e){
//            dispose();
//            
//            }
//        });
        addMouseMotionListener(this);
//        addMouseListener(new MouseAdapter() {
//         public void mouseReleased(MouseEvent e) {
//         i=i+1;
//         repaint();
//         }
//        });
    }
    
    
    
    public static void main(String[] args) {
        Paint_pad obj = new Paint_pad();
        obj.setVisible(true);
        obj.setSize(500, 500);
    }
    
   

    @Override
    public void mouseDragged(MouseEvent e) {
       al.add(new paint_pad_arraylist(e.getX(), e.getY()));
       i=0;
        
       repaint();
//       p=al.get(i).x;
//       q=al.get(i).y;
//       
//       x1_val_temp=al.get(0).x;
//       y1_val_temp=al.get(0).y;
//         draw();
//       x2_val=al.get(i).x;
//       y2_val=al.get(i).y;
         
              
       
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    
    }
    
   
    
    public void paint(Graphics g){
        
       if(j==0){
        //g.setColor(Color.red);
        getContentPane().setBackground(Color.YELLOW);
        
        j=1;
       }
       if(j>0){
           g.setColor(Color.red);
        while(i<al.size()){
            
            g.drawString("#", al.get(i).x,al.get(i).y);
//             g.drawLine(al.get(i).x, al.get(i).y, al.get(i+1).x, al.get(i+1).y);
           i++;  
              
        }
       }
    }
      
        
         
     
    }
    


