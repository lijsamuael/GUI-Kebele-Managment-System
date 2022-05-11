import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.Box;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField UserNameTextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */					

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
				
					frame.setVisible(true);
					frame.setSize(500,500);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setTitle("Kebele Managment System");
					ImageIcon image = new ImageIcon("realCartoonPicEyesCorrectedAndDotedFiltered.png");

					frame.setIconImage(image.getImage());

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Kebele Managment System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 1366, 768);
		setExtendedState(MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//setIconImage(image.getImage());
		//setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(10, 11, 1340, 707);
		panel.setBackground(new Color(204, 255, 204));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1340, 121);
		panel_1.setBackground(Color.ORANGE);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Login Form");
		lblNewLabel_2.setFont(new Font("Bell MT", Font.BOLD, 50));
		lblNewLabel_2.setBounds(509, 11, 285, 78);
		panel_1.add(lblNewLabel_2);
		
		JLabel PasswordLabel = new JLabel("Password");
		PasswordLabel.setBounds(444, 373, 152, 37);
		panel.add(PasswordLabel);
		PasswordLabel.setBackground(Color.ORANGE);
		PasswordLabel.setFont(new Font("Bell MT", Font.PLAIN, 34));
		
		
		JLabel userNameLabel = new JLabel("User Name");
		userNameLabel.setBounds(444, 260, 171, 44);
		panel.add(userNameLabel);
		userNameLabel.setBackground(Color.ORANGE);
		userNameLabel.setFont(new Font("Bell MT", Font.PLAIN, 34));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(715, 373, 168, 29);
		panel.add(passwordField);
		passwordField.setBackground(SystemColor.info);
		
		UserNameTextField = new JTextField();
		UserNameTextField.setBounds(715, 274, 168, 29);
		panel.add(UserNameTextField);
		UserNameTextField.setBackground(SystemColor.info);
		UserNameTextField.setColumns(10);
		
		JButton logInButton = new JButton("Login");
		logInButton.setBounds(458, 484, 157, 44);
		logInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(UserNameTextField.getText().equals("admin") && passwordField.getText().equals("admin")) {
					setVisible(false);
					Home home = new Home();
					home.setVisible(true);
				}
				else if(UserNameTextField.getText().equals("") || passwordField.getText().equals("")) {
				
					JOptionPane.showMessageDialog(logInButton, "One or more empty fields. Plese fill all the required ones", getTitle(), JOptionPane.ERROR_MESSAGE);
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Incorrect username or password.\nPlease try again");

				}
				
				
				
					
				
			}
		});
		logInButton.setForeground(new Color(0, 0, 255));
		logInButton.setBackground(new Color(255, 215, 0));
		logInButton.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 30));
		panel.add(logInButton);
		
		JButton closeBetton = new JButton("Close");
		closeBetton.setBounds(715, 484, 152, 44);
		closeBetton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		closeBetton.setForeground(new Color(255, 0, 0));
		closeBetton.setBackground(new Color(255, 215, 0));
		closeBetton.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 30));
		panel.add(closeBetton);
		
		JButton forgotButton = new JButton("Forgot Password???");
		forgotButton.setBounds(476, 631, 358, 44);
		forgotButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//setVisible(false);
				ForgotPassword forgot = new ForgotPassword();
				forgot.setVisible(true);
			}
		});
		forgotButton.setForeground(new Color(255, 255, 255));
		forgotButton.setBackground(SystemColor.activeCaption);
		forgotButton.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 30));
		panel.add(forgotButton, BorderLayout.NORTH);
		
		
		JButton signUpButton = new JButton("Sign UP");
		signUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp signUp = new SignUp();
				signUp.setVisible(true);
			}
		});
		signUpButton.setForeground(new Color(0, 51, 51));
		signUpButton.setBackground(new Color(153, 255, 0));
		signUpButton.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 30));
		signUpButton.setBounds(561, 557, 192, 49);
		signUpButton.setBorder(BorderFactory.createLoweredBevelBorder());
		panel.add(signUpButton);
		
		
		
		
		
		
		ImageIcon buttonImage = new ImageIcon("lock(2).py");
		setIconImage(buttonImage.getImage());
		setVisible(true);
		
	


	}
}
