

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chatbox extends Frame implements ActionListener{

    TextArea ta;
    TextField tf;
    Button bt;
    public Chatbox()  {
        setLayout(null);
        
        ta = new TextArea();
        tf= new TextField();
        bt = new Button("Send");
        
        ta.setBounds(50,50,300,300);
        
        tf.setBounds(50,370,200,20);
        
        bt.setBounds(270,370,50,20);
        
        add(ta);
        add(tf);
        add(bt);
        
        ta.setEditable(false);
        bt.addActionListener(this);
        tf.addActionListener(this);
    }
    
    
    public static void main(String[] args) {
        Chatbox obj = new Chatbox();
        obj.setSize(500,500);
        obj.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    ta.append(tf.getText()+"\n");
    tf.setText("");
    tf.requestFocus();
    
    }
}
