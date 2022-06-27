package prac;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSlider;

public class Choose {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Choose window = new Choose();
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
	public Choose() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 536, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE ADMIN OR USER");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel.setBounds(111, 25, 384, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ADMIN");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin.main(null);
			}
		});
		btnNewButton.setBounds(88, 148, 114, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnUser = new JButton("USER");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hhsss.main(null);
			}
		});
		btnUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUser.setBounds(310, 148, 114, 43);
		frame.getContentPane().add(btnUser);
	}
}
