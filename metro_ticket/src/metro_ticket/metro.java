package metro_ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metro {

	private JFrame frame;
	private JTextField lb1;
	private final JComboBox cb2 = new JComboBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metro window = new metro();
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
	public metro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1101, 622);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKET APP");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(207, 11, 624, 94);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(318, 225, 90, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Source");
		lblNewLabel_2.setForeground(Color.CYAN);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(318, 277, 80, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Destination");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setForeground(new Color(255, 175, 175));
		lblNewLabel_3.setBounds(318, 329, 135, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tickets");
		lblNewLabel_4.setForeground(Color.GREEN);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(318, 378, 159, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		lb1 = new JTextField();
		lb1.setBounds(592, 225, 86, 20);
		frame.getContentPane().add(lb1);
		lb1.setColumns(10);
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		cb3.setBounds(592, 376, 86, 22);
		frame.getContentPane().add(cb3);
		
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "JNTU", "KUKATPALLY"}));
		cb1.setBounds(592, 269, 86, 22);
		frame.getContentPane().add(cb1);
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "JNTU", "KUKATPALLY"}));
		cb2.setBounds(592, 323, 90, 31);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name=lb1.getText();
				String Source=(String) cb1.getSelectedItem();
				String Destination=(String) cb2.getSelectedItem();
				String Tickets=(String) cb3.getSelectedItem();
				int n=Integer.parseInt(Tickets);
				if(Source.equals(Destination))
				{
					JOptionPane.showMessageDialog(btnNewButton, "");
					
				}
				else
				{    
					int bill=n*45;
					JOptionPane.showMessageDialog(btnNewButton, "Name"+Name+"\n Source"+Source+"\n Destination"+Destination+"\n Tickets"+Tickets+"\n amount"+bill);
				}
				
			}
		});
		btnNewButton.setBounds(440, 505, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\abc.jpg"));
		lblNewLabel_6.setBounds(0, 0, 1085, 587);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
