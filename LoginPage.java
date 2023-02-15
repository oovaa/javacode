import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage {
    private JFrame frame;
    private JTextField emailField;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JLabel emailLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel confirmPasswordLabel;

    public LoginPage() {
        // Initialize the JFrame
        frame = new JFrame("Library Login");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(30, 30, 30));
        frame.setResizable(false);

        // Initialize the email label
        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(30, 30, 50, 20);
        emailLabel.setForeground(new Color(255, 255, 255));
        frame.add(emailLabel);

        // Initialize the email field
        emailField = new JTextField();
        emailField.setBounds(170, 30, 150, 20);
        emailField.setBackground(new Color(50, 50, 50));
        emailField.setForeground(new Color(0, 255, 0));
        frame.add(emailField);

        // Initialize the username label
        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(30, 60, 70, 20);
        usernameLabel.setForeground(new Color(255, 255, 255));
        frame.add(usernameLabel);

        // Initialize the username field
        usernameField = new JTextField();
        usernameField.setBounds(170, 60, 150, 20);
        usernameField.setBackground(new Color(50, 50, 50));
        usernameField.setForeground(new Color(0, 255, 0));
        frame.add(usernameField);

        // Initialize the password label
        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(30, 90, 70, 20);
        passwordLabel.setForeground(new Color(255, 255, 255));
        frame.add(passwordLabel);

        // Initialize the password field
        passwordField = new JPasswordField();
        passwordField.setName("passwordField");
        passwordField.setBounds(170, 90, 150, 20);
        passwordField.setBackground(new Color(50, 50, 50));
        passwordField.setForeground(new Color(0, 255, 0));
        frame.add(passwordField);

        // Initialize the confirm password label
        confirmPasswordLabel = new JLabel("Confirm Pass:");
        confirmPasswordLabel.setBounds(30, 120, 110, 20);
        confirmPasswordLabel.setForeground(new Color(255, 255, 255));
        frame.add(confirmPasswordLabel);

        // Initialize the confirm password field
        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setName("confirmPasswordField");
        confirmPasswordField.setBounds(170, 120, 150, 20);
        confirmPasswordField.setBackground(new Color(50, 50, 50));
        confirmPasswordField.setForeground(new Color(0, 255, 0));
        frame.add(confirmPasswordField);

        // Initialize the rest button
        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(190, 170, 80, 25);
        resetButton.setBackground(new Color(99, 99, 99));
        resetButton.setForeground(new Color(249, 249, 249));
        frame.add(resetButton);

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                emailField.setText("");
                passwordField.setText("");
                confirmPasswordField.setText("");
                usernameField.setText("");
            }
        });
        
        // Initialize the login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(90, 170, 80, 25);
        loginButton.setBackground(new Color(99, 99, 99));
        loginButton.setForeground(new Color(249, 249, 249));
        frame.add(loginButton);

        // Add an action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());
                // check if the email field contains "@" and if the password and confirm
                // password fields match
                if (password.length() > 8 || password.length() <= 3) {
                    JOptionPane.showMessageDialog(frame, "Password wrong length it should be 4-8", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
                if (username.length() < 3) {
                    JOptionPane.showMessageDialog(frame, "name wrong length it should be >2", "Error",
                            JOptionPane.ERROR_MESSAGE);

                }
                if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(frame, "The passwords aren't the same ", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
                if (!email.contains("@")) {
                    JOptionPane.showMessageDialog(frame, "email should contain |@| ", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
                if (email.contains("@") && password.equals(confirmPassword) && !(username.length() < 3)
                        && !(password.length() > 8 || password.length() <= 3)) {
                    // proceed to the home page
                    // create a new instance of the home page
                    new maHonePage();
                    // make the home page visible
                    // close the login page
                    frame.dispose();
                }

            }
        });

    }

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
    }
}
