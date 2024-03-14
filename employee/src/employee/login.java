package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JPasswordField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 0, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("login page");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(194, 11, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("login");
		btnNewButton_1.setBounds(36, 77, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("password");
		btnNewButton_2.setBounds(36, 146, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JTextArea tb1 = new JTextArea();
		tb1.setBounds(194, 76, 89, 22);
		frame.getContentPane().add(tb1);
		
		JButton btnNewButton_3 = new JButton("submit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String password=tb2.getText();
				//JOptionPane.showMessageDialog(btnNewButton_3, "NAME" +name+"\n password "+password);
                if(name.equals("raju")&& password.equals("1234"))
                {	
                	JOptionPane.showMessageDialog(btnNewButton_3,"VALID USER");
                	
			}
		});
		btnNewButton_3.setBackground(new Color(255, 128, 64));
		btnNewButton_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_3.setBounds(194, 201, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		tb2 = new JPasswordField();
		tb2.setBounds(200, 147, 83, 20);
		frame.getContentPane().add(tb2);
	}
}
