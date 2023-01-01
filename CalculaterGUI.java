//import java.util.Stack;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.omg.CORBA.BAD_PARAM;

import java.swing.*;
import java.time.chrono.ThaiBuddhistChronology;


public class CalculaterGUI extends JFrame // ActionListener
{

    public static void main(String[] args) {
        //Stack <Integer> OP = new Stack<Integer>();

        JTextField textField = new JTextField(25);
        textField.setBounds(80, 10, 150, 35);
        textField.setEnabled(false);









        JButton b1 = new JButton("1");
        b1.setBounds(105, 50, 50, 50);
        b1.addActionListener(e -> textField.setText("1"));
        
        //
        JButton b2 = new JButton("2");
        b2.setBounds(160, 50, 50, 50);
       // b2.addActionListener(new ActionListener()){

        
     
        //
        JButton b3 = new JButton("3");
        b3.setBounds(215, 50, 50, 50);
        //b3.addActionListener(e -> OP.push(3));
        //
        JButton b4 = new JButton("4");
        b4.setBounds(105, 110, 50, 50);
        //b4.addActionListener(e -> OP.push(4));
        //
        JButton b5 = new JButton("5");
        b5.setBounds(160, 110, 50, 50);
        //b5.addActionListener(e -> OP.push(5));
        //
        JButton b6 = new JButton("6");
        b6.setBounds(215, 110, 50, 50);
        //b6.addActionListener(e -> OP.push(6));
        //
        JButton b7 = new JButton("7");
        b7.setBounds(105, 170, 50, 50);
       // b7.addActionListener(e -> OP.push(7));
        //
        JButton b8 = new JButton("8");
        b8.setBounds(160, 170, 50, 50);
        //b8.addActionListener(e -> OP.push(8));
        //
        JButton b9 = new JButton("9");
        b9.setBounds(215, 170, 50, 50);
        //b9.addActionListener(e -> OP.push(9));
        //
        JButton b0 = new JButton("0");
        b0.setBounds(105, 230, 50, 50);
        //b0.addActionListener(e -> OP.push(0));
        //
        JButton bs = new JButton("+");
        bs.setBounds(50, 230, 50, 50);
        //bs.addActionListener(e -> textField.setText("+"));
        //
        JButton bm = new JButton("x");
        bm.setBounds(50, 50, 50, 50);
       // bs.addActionListener(e -> textField.setText("x"));
        //
        JButton bd = new JButton("/");
        bd.setBounds(50, 110, 50, 50);
       // bs.addActionListener(e -> textField.setText("+"));
       //
       JButton bmin = new JButton("-");
        bmin.setBounds(50, 170, 50, 50);
        //bs.addActionListener(e -> textField.setText("+"));
        //
        JButton bdel = new JButton("d");
        bdel.setBounds(160, 230, 50, 50);
       // bs.addActionListener(e -> textField.setText("+"));
       //
       JButton bclr = new JButton("c");
        bclr.setBounds(215, 230, 50, 50);
        bs.addActionListener(e -> textField.setText("+"));
 //@Override
         /*public void actionPerformed (e) {
            if (e.getSource() = b0)
            System.out.println(0);


         }*/
       
        
        JFrame frame = new JFrame();
        
        
        frame.setSize(350,500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("cal");
        frame.setBackground(Color.CYAN);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b0);
        frame.add(bs);
        frame.add(bm);
        frame.add(bd);
        frame.add(bmin);
        frame.add(bdel);
        frame.add(bclr);
        frame.add(textField);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        


    }



    
}


