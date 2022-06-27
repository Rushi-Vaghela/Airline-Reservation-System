package prac;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChooseFlight {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseFlight window = new ChooseFlight();
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
	public ChooseFlight() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 518, 344);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("DOMESTIC FLIGHT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Booking.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(65, 132, 155, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnInternationalFlight = new JButton("INTERNATIONAL FLIGHT");
		btnInternationalFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				International.main(null);
			}
		});
		btnInternationalFlight.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnInternationalFlight.setBounds(271, 132, 195, 43);
		frame.getContentPane().add(btnInternationalFlight);
	}

}
