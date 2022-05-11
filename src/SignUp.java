import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
public SignUp() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(300, 15, 600, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 255, 0));
		panel.setBounds(0, 0, getWidth(), getHeight());
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 0));
		panel_1.setBounds(0, 0, 600, 84);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign UP Form");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 33));
		lblNewLabel.setBounds(158, 11, 250, 63);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(77, 100, 172, 35);
		panel.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(316, 100, 172, 35);
		panel.add(textField);
		textField.setColumns(10);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(77, 175, 172, 35);
		panel.add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setBounds(316, 175, 172, 35);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Date Of Birth");
		lblNewLabel_3.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(77, 250, 172, 35);
		panel.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(318, 250, 172, 35);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		
		
		JLabel lblNewLabel_4 = new JLabel("User Name");
		lblNewLabel_4.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(77, 325, 172, 35);
		panel.add(lblNewLabel_4);

		textField_3 = new JTextField();
		textField_3.setBounds(316, 325, 172, 35);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_5.setBounds(77, 400, 171, 35);
		panel.add(lblNewLabel_5);

		textField_4 = new JTextField();
		textField_4.setBounds(316, 400, 172, 35);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		
		
		JLabel lblNewLabel_8 = new JLabel("New Password");
		lblNewLabel_8.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_8.setBounds(77, 475, 173, 35);
		panel.add(lblNewLabel_8);

		passwordField = new JPasswordField();
		passwordField.setBounds(316, 475, 172, 35);
		panel.add(passwordField);
		
		
		
		JLabel lblNewLabel_9 = new JLabel("Password Again");
		lblNewLabel_9.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_9.setBounds(77, 550, 182, 35);
		panel.add(lblNewLabel_9);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(316, 550, 172, 35);
		panel.add(passwordField_1);
		
		JButton confirmButton = new JButton("Confirm");
		confirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		confirmButton.setBackground(Color.GREEN);
		confirmButton.setForeground(new Color(255, 0, 51));
		confirmButton.setFont(new Font("Rockwell", Font.BOLD, 20));
		confirmButton.setBounds(307, 685, 121, 23);
		panel.add(confirmButton);
		
		JButton closeButton = new JButton("Close");
		closeButton.setForeground(Color.GREEN);
		closeButton.setBackground(new Color(255, 0, 51));
		closeButton.setFont(new Font("Rockwell", Font.BOLD, 20));
		closeButton.setBounds(458, 685, 106, 23);
		panel.add(closeButton);
		
		JComboBox fqcomboBox = new JComboBox();
		fqcomboBox.setBounds(77, 613, 30, 22);
		panel.add(fqcomboBox);
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		

		
		
	}
}
