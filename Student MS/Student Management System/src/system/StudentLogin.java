package system;

import java.awt.EventQueue;
import system.StudentSecondPage;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentLogin {

	private JFrame frame;
	private JTextField textUserName;
	private JPasswordField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentLogin window = new StudentLogin();
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
	public StudentLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 248, 220));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Management System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(49, 10, 340, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(152, 45, 115, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("User Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(21, 101, 109, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(21, 152, 109, 25);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		textUserName = new JTextField();
		textUserName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textUserName.setBounds(159, 101, 253, 25);
		frame.getContentPane().add(textUserName);
		textUserName.setColumns(10);
		
		textPassword = new JPasswordField();
		textPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPassword.setBounds(159, 150, 253, 25);
		frame.getContentPane().add(textPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = textPassword.getText();
				String username = textUserName.getText();
				
				if(username.contains("user")&& password.contains("abc123")) {
					textUserName.setText(null);
					textPassword.setText(null);
					
					StudentSecondPage next = new StudentSecondPage();
					next.main(null);	
				}else {
					JOptionPane.showMessageDialog(null,"Invalid Login Details", "Login Error",JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		btnLogin.setBackground(new Color(175, 238, 238));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLogin.setBounds(21, 222, 95, 31);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Rest");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textUserName.setText(null);
				textPassword.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.setBackground(new Color(175, 238, 238));
		btnReset.setBounds(173, 222, 95, 31);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frmLoginSystem = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmLoginSystem, "Confirm if you want to exit",
						"Login System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
					
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnExit.setBackground(new Color(175, 238, 238));
		btnExit.setBounds(317, 222, 95, 31);
		frame.getContentPane().add(btnExit);
	}
}
