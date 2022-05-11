import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ForgotPassword extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	
	ImageIcon image = new ImageIcon("realCartoonPicEyesCorrectedAndDotedFiltered.png");
	public ForgotPassword() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 100, 490, 449);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Forgot message dialog box.");
		setIconImage(image.getImage());
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 102, 153));
		panel.setBounds(0, 0, 571, 407);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select a Question...");
		lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 15));
		lblNewLabel.setBounds(64, 48, 150, 34);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 153, 102));
		panel_1.setBounds(0, 0, 481, 50);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Forgot Message Dialog Box");
		lblNewLabel_1.setBounds(100, 11, 288, 28);
		lblNewLabel_1.setFont(new Font("Rockwell", Font.PLAIN, 20));
		panel_1.add(lblNewLabel_1);
		
		JButton backButton = new JButton("Back");
		backButton.setBackground(new Color(64, 224, 208));
		backButton.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 20));
		backButton.setBounds(252, 289, 109, 43);
		panel.add(backButton);
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
			
		});
		
		
		JButton saveButton = new JButton("Answer");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer = JOptionPane.showInputDialog("Type your seted answer for your selected question."); 
				
			}
		});
		saveButton.setBackground(new Color(0, 255, 255));
		saveButton.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 20));
		saveButton.setBounds(79, 289, 109, 43);
		panel.add(saveButton);
		
		JComboBox questionscomboBox = new JComboBox();
		questionscomboBox.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 18));
		questionscomboBox.setModel(new DefaultComboBoxModel( new String[] {"What is your nik name?", "What is your favorite food?", "What is your birth of date?", "What is your favorite number?"}));
		questionscomboBox.setBounds(64, 93, 297, 43);
		panel.add(questionscomboBox);
		

		
	}
}
