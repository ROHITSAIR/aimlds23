package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class student_registration {

	private JFrame frame;
	private JTextField TB1;
	private JTextField TB2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student_registration window = new student_registration();
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
	public student_registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("        Student Registration");
		lblNewLabel.setBounds(120, 21, 434, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel LB1 = new JLabel("name");
		LB1.setBackground(new Color(128, 255, 255));
		LB1.setBounds(35, 61, 61, 21);
		frame.getContentPane().add(LB1);
		
		JLabel LB2 = new JLabel("roll");
		LB2.setBackground(new Color(240, 240, 240));
		LB2.setBounds(35, 100, 46, 14);
		frame.getContentPane().add(LB2);
		
		JLabel GP1 = new JLabel("branch");
		GP1.setBackground(new Color(240, 240, 240));
		GP1.setBounds(35, 140, 46, 14);
		frame.getContentPane().add(GP1);
		
		TB1 = new JTextField();
		TB1.setBounds(146, 61, 86, 20);
		frame.getContentPane().add(TB1);
		TB1.setColumns(10);
		
		TB2 = new JTextField();
		TB2.setBounds(146, 97, 86, 20);
		frame.getContentPane().add(TB2);
		TB2.setColumns(10);
		
		JComboBox LB3 = new JComboBox();
		LB3.setModel(new DefaultComboBoxModel(new String[] {"SELECT\t", "DS", "CS", "IOT", "MECH", "AIML"}));
		LB3.setToolTipText("C1");
		LB3.setBounds(146, 136, 86, 22);
		frame.getContentPane().add(LB3);
		
		JLabel G1 = new JLabel("gender");
		G1.setBackground(new Color(240, 240, 240));
		G1.setBounds(35, 176, 46, 14);
		frame.getContentPane().add(G1);
		
		JRadioButton GM = new JRadioButton("MALE");
		GM.setBounds(146, 172, 109, 23);
		frame.getContentPane().add(GM);
		
		JRadioButton GW = new JRadioButton("FEMALE");
		GW.setBounds(276, 172, 109, 23);
		frame.getContentPane().add(GW);
		
		JLabel P = new JLabel("program");
		P.setBackground(new Color(240, 240, 240));
		P.setBounds(35, 215, 46, 14);
		frame.getContentPane().add(P);
		
		JButton BTN = new JButton("submit");
		BTN.setBackground(new Color(240, 240, 240));
		BTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=TB1.getText();
				String roll=TB2.getText();
				String branch=(String) LB3.getSelectedItem();
				JOptionPane.showMessageDialog(BTN, "NAME "+name+"\n ROLL"+roll+"\n BRANCH"+branch );
				
				
				
				
			}
		});
		BTN.setBounds(146, 238, 89, 23);
		frame.getContentPane().add(BTN);
		
		JRadioButton P1 = new JRadioButton("JAVA");
		P1.setBounds(146, 211, 86, 23);
		frame.getContentPane().add(P1);
		
		JRadioButton P2 = new JRadioButton("C");
		P2.setBounds(234, 211, 54, 23);
		frame.getContentPane().add(P2);
		
		JRadioButton P3 = new JRadioButton("PYTHON");
		P3.setBounds(303, 211, 109, 23);
		frame.getContentPane().add(P3);
	}
}
