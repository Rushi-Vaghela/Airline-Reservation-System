package prac;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.JMenuItem;
import javax.swing.JTree;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Booking {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Booking window = new Booking();
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
	public Booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 532, 398);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list.setBounds(101, 85, 83, -29);
		frame.getContentPane().add(list);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Default", "Surat", "Rajkot", "baroda"}));
		comboBox.setBounds(123, 85, 155, 34);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("FROM :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(39, 88, 74, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblTo = new JLabel("TO :");
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTo.setBounds(39, 142, 74, 27);
		frame.getContentPane().add(lblTo);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Default", "HYDRABAD", "MUMBAI", "RAJSTHAN"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_1.setBounds(123, 139, 155, 34);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("DOMESTIC FLIGHT");
		lblNewLabel_1.setFont(new Font("Stencil", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(171, 26, 222, 49);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Plane.main(null);
				//System.exit(0);
				//ChooseFlight.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(52, 224, 100, 34);
		frame.getContentPane().add(btnNewButton);
	}
}
