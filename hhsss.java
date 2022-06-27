package prac;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class hhsss {

	private JFrame frame;
	private JPasswordField passwordField;
	private final Action action = new SwingAction();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hhsss window = new hhsss();
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
	public hhsss() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 651, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				//initialize.actionPerformed();
//			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String password = passwordField.getText();
				
				if(password.contains("123456")&&username.contains("Rushi")) {
					textField.setText(null);
					passwordField.setText(null);
					Rushi.main(null);
				}
				else if(password.contains("123456") && username.contains("Harit")){
					textField.setText(null);
					passwordField.setText(null);
					//JOptionPane.showConfirmDialog(null, "Hey Harit");
					Rushi.main(null);
				}
				else {
					JOptionPane.showConfirmDialog(null, "INVALID LOGIN","ERROR",JOptionPane.ERROR_MESSAGE);
					textField.setText(null);
					passwordField.setText(null);
				}
				//JOptionPane.showConfirmDialog(null, "Hey, You are logged in");
			}
		});
		btnNewButton.setBounds(24, 191, 120, 33);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(143, 129, 219, 26);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(24, 72, 97, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(24, 125, 97, 29);
		frame.getContentPane().add(lblPassword);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnReset.setForeground(Color.BLACK);
		btnReset.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btnReset.setBackground(Color.CYAN);
		btnReset.setBounds(189, 191, 120, 33);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btnExit.setBackground(Color.CYAN);
		btnExit.setBounds(348, 191, 120, 33);
		frame.getContentPane().add(btnExit);
		
		textField = new JTextField();
		textField.setBounds(143, 76, 219, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("USER LOGIN");
		lblNewLabel_1.setFont(new Font("Palatino Linotype", Font.BOLD, 17));
		lblNewLabel_1.setBounds(261, 20, 195, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Choose.main(null);
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btnBack.setBackground(Color.CYAN);
		btnBack.setBounds(24, 263, 120, 33);
		frame.getContentPane().add(btnBack);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
