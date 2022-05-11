import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	    getContentPane().setLayout(null);
	    setTitle("A Buntch Of Stufs In Kebele.");
	    ImageIcon image = new ImageIcon("realCartoonPicEyesCorrectedAndDotedFiltered.png");
		setIconImage(image.getImage());
		setVisible(true);
	    
	    
		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setBackground(new Color(204, 255, 204));
		panel.setBounds(0, 0, 1365, 744);
		getContentPane().add(panel);
		panel.setLayout(null);
		panel.setSize(1365,744);
		
	
		JButton IdLabel = new JButton("Identification Cared");
		IdLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IdCardFillingForm IdForm = new IdCardFillingForm();
				IdForm.setVisible(true);
			}
		});
		IdLabel.setIcon(new ImageIcon("Icon_1.png"));
		IdLabel.setBackground(new Color(240, 230, 140));
		IdLabel.setForeground(SystemColor.activeCaptionText);
		IdLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
		IdLabel.setBounds(10, 30, 302, 46);
		panel.add(IdLabel);
		
		setVisible(true);
		
		
		JButton CupoonLabel = new JButton("Cupoon");
		CupoonLabel.setBackground(new Color(240, 230, 140));
		CupoonLabel.setForeground(SystemColor.activeCaptionText);
		CupoonLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
		CupoonLabel.setBounds(400, 30, 120, 46);
		CupoonLabel.setFocusable(false);
		panel.add(CupoonLabel);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1366, 112);
		panel.add(panel_1);
		panel_1.setBackground(Color.ORANGE);
		panel_1.setLayout(null);
		
		JButton BirthButton = new JButton("Birth Certeficate");
		BirthButton.setBounds(605, 27, 197, 49);
		panel_1.add(BirthButton);
		BirthButton.setBackground(new Color(240, 230, 140));
		BirthButton.setForeground(SystemColor.activeCaptionText);
		BirthButton.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
		BirthButton.setFocusable(false);
		
		JButton databaseButton = new JButton("Statistics");
		databaseButton.setBounds(907, 28, 150, 46);
		panel_1.add(databaseButton);
		databaseButton.setBackground(new Color(240, 230, 140));
		databaseButton.setForeground(SystemColor.activeCaptionText);
		databaseButton.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
		databaseButton.setFocusable(false);
		databaseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent et) {
			setVisible(false);
			new Statistics();
			}
		});
		
		JButton aboutButoon = new JButton("About Us");
		aboutButoon.setBounds(1181, 28, 130, 46);
		panel_1.add(aboutButoon);
		aboutButoon.setBackground(new Color(240, 230, 140));
		aboutButoon.setForeground(SystemColor.activeCaptionText);
		aboutButoon.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
		aboutButoon.setFocusable(false);
		String nameOfKebele = "03";
		
		
		
		JLabel lblNewLabel = new JLabel("Wellcome To Kebele " + nameOfKebele + '.');
		lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 30));
		lblNewLabel.setBounds(502, 160, 361, 46);
		panel.add(lblNewLabel);
		
		JButton backButton = new JButton("Back");
		backButton.setBackground(new Color(250, 128, 114));
		backButton.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 20));
		backButton.setBounds(1157, 692, 160, 23);
		backButton.setFocusable(false);
		backButton.setIcon(new ImageIcon("dismiss.contrast-white(36).png"));
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new Login();
			}
		});
		panel.add(backButton);
		
		
		
		
		
	}
}
