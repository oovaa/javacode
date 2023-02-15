import javax.swing.JFrame;
import javax.swing.JTable;

public class test {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(300, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTable jt = new JTable();
        jt.setSize(200, 200);
        jt.setLocation(100, 50);

        jf.add(jt);
        jf.setVisible(true);
    }
}
