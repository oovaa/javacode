import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistrationForm extends JFrame implements ActionListener {

    private JLabel l1, l2, l3, l4, l5;
    private JTextField tf1, tf2;
    private JButton btn1, btn2;
    private JPasswordField p1, p2;
    static RegistrationForm mare;

    public RegistrationForm() {

        setSize(700, 700);

        setLayout(new GridLayout(12, 6));

        setBackground(Color.darkGray);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("---------------------Registration Form in Java------------------");

        l1 = new JLabel("Registration");
        // l1.add(Box.createHorizontalStrut(20));
        l1.setForeground(Color.black);
        // l1.setLayout(new GridLayout(1, 3));
        setBackground(new Color(100, 100, 150));

        l1.setFont(new Font("Serif", Font.BOLD, 30));
         l1.setBorder(BorderFactory.createEmptyBorder(0, 100, 0, 0));
        // l1.setAlignmentX(CENTER_ALIGNMENT);
        l2 = new JLabel(" Name:");

        l3 = new JLabel(" Email-ID:");

        l4 = new JLabel(" Create Passowrd:");

        l5 = new JLabel(" Confirm Password:");

        tf1 = new JTextField();

        tf2 = new JTextField();

        p1 = new JPasswordField();

        p2 = new JPasswordField();

        btn1 = new JButton("Submit"); // creating instance of JButton
        btn2 = new JButton("reset");
        btn2.addActionListener(this);
        btn1.setBounds(199, 100, 150, 150);
        add(l1);
        add(Box.createHorizontalStrut(10)); // Fixed width invisible separator.
        add(l2);
        add(tf1);
        add(l3);
        add(tf2);
        add(l4);
        add(p1);
        add(l5);
        add(p2);
        add(Box.createHorizontalStrut(10)); // Fixed width invisible separator.
        add(Box.createHorizontalStrut(10)); // Fixed width invisible separator.

        add(btn1);
        // add(Box.createHorizontalStrut(10)); // Fixed width invisible separator.
        add(btn2);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn2) {
            tf1.setText("");
            tf2.setText("");
            p1.setText("");
            p2.setText("");

        }
        if (e.getSource() == btn1) {
             if (!tf2.getText().contains("@"))
                JOptionPane.showMessageDialog(tf1, "the Email shout contain |@|", "ERROR", JOptionPane.ERROR_MESSAGE);// forfix

        }
    }

    public static void main(String[] args) {
        mare = new RegistrationForm();

    }
}