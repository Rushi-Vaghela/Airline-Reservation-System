package prac;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Plane {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Plane window = new Plane();
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
	public Plane() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 556, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PLANE LAYOUT");
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.PLAIN, 22));
		lblNewLabel.setBounds(209, 26, 200, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("A1");
		chckbxNewCheckBox.setBounds(55, 124, 93, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxA = new JCheckBox("A2");
		chckbxA.setBounds(55, 167, 93, 21);
		frame.getContentPane().add(chckbxA);
		
		JCheckBox chckbxA_1 = new JCheckBox("A3");
		chckbxA_1.setBounds(55, 216, 93, 21);
		frame.getContentPane().add(chckbxA_1);
		
		JCheckBox chckbxA_2 = new JCheckBox("A4");
		chckbxA_2.setBounds(55, 262, 93, 21);
		frame.getContentPane().add(chckbxA_2);
		
		JCheckBox chckbxA_3 = new JCheckBox("A5");
		chckbxA_3.setBounds(55, 316, 93, 21);
		frame.getContentPane().add(chckbxA_3);
		
		JCheckBox chckbxA_4 = new JCheckBox("A6");
		chckbxA_4.setBounds(55, 366, 93, 21);
		frame.getContentPane().add(chckbxA_4);
		
		JCheckBox chckbxA_5 = new JCheckBox("A7");
		chckbxA_5.setBounds(55, 410, 93, 21);
		frame.getContentPane().add(chckbxA_5);
		
		JCheckBox chckbxA_6 = new JCheckBox("A8");
		chckbxA_6.setBounds(55, 457, 93, 21);
		frame.getContentPane().add(chckbxA_6);
		
		JCheckBox chckbxA_7 = new JCheckBox("A9");
		chckbxA_7.setBounds(152, 124, 93, 21);
		frame.getContentPane().add(chckbxA_7);
		
		JCheckBox chckbxA_8 = new JCheckBox("A10");
		chckbxA_8.setBounds(152, 167, 93, 21);
		frame.getContentPane().add(chckbxA_8);
		
		JCheckBox chckbxA_9 = new JCheckBox("A11");
		chckbxA_9.setBounds(152, 216, 93, 21);
		frame.getContentPane().add(chckbxA_9);
		
		JCheckBox chckbxA_10 = new JCheckBox("A12");
		chckbxA_10.setBounds(152, 262, 93, 21);
		frame.getContentPane().add(chckbxA_10);
		
		JCheckBox chckbxA_11 = new JCheckBox("A13");
		chckbxA_11.setBounds(152, 316, 93, 21);
		frame.getContentPane().add(chckbxA_11);
		
		JCheckBox chckbxA_12 = new JCheckBox("A14");
		chckbxA_12.setBounds(152, 366, 93, 21);
		frame.getContentPane().add(chckbxA_12);
		
		JCheckBox chckbxA_13 = new JCheckBox("A15");
		chckbxA_13.setBounds(152, 410, 93, 21);
		frame.getContentPane().add(chckbxA_13);
		
		JCheckBox chckbxA_14 = new JCheckBox("A16");
		chckbxA_14.setBounds(150, 457, 93, 21);
		frame.getContentPane().add(chckbxA_14);
		
		JButton btnNewButton = new JButton("CONFIRM");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(268, 124, 101, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnReset.setBounds(268, 167, 101, 21);
		frame.getContentPane().add(btnReset);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBack.setBounds(268, 216, 101, 21);
		frame.getContentPane().add(btnBack);
	}
}
