import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

class GUI {

	public static void main(String[] args) {
		new maframe();
	}
}

class maframe extends JFrame implements ActionListener {
	JCheckBox jch;

	maframe() {
		jch = new JCheckBox();

		this.setSize(600, 500);
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		jch.setText("are u i dont know?");
		jch.setFocusable(false);
		jch.addActionListener(e ->{if (jch.isSelected()) 
			System.out.println("hii");
			else System.out.println("fucc u");
		});
		
			
		this.add(jch);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}