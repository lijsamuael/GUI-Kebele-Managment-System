import java.awt.BorderLayout;
import java.sql.*;
import project.ConnectionProvider;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class IdCardFillingForm extends JFrame {

	private JPanel contentPane;
	private JTextField IdTF;
	private JTextField FirstNameTF;
	private JTextField MIddleNameTF;
	private JTextField BirthDateTF;
	private JTextField PlaceOfBirthTF;
	private JTextField textField_7;
	private JTextField KebeleTF;

	
	public IdCardFillingForm() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(402, 84, 561, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
        setResizable(false);		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 545, 562);

		
	    contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(173, 216, 230));
		panel_1.setBounds(0, 0, 545, 74);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Identification Card Form");
		lblNewLabel.setFont(new Font("Bell MT", Font.BOLD, 20));
		lblNewLabel.setBounds(158, 11, 229, 52);
		panel_1.add(lblNewLabel);
		
		JLabel Id = new JLabel("Id");
		Id.setFont(new Font("Bell MT", Font.BOLD, 18));
		Id.setBounds(73, 101, 60, 14);
		panel.add(Id);
		
		JLabel FirstName = new JLabel("First Name");
		FirstName.setFont(new Font("Bell MT", Font.BOLD, 18));
		FirstName.setBounds(73, 149, 113, 14);
		panel.add(FirstName);
		
		JLabel MiddleName = new JLabel("Father Name");
		MiddleName.setFont(new Font("Bell MT", Font.BOLD, 18));
		MiddleName.setBounds(73, 196, 113, 14);
		panel.add(MiddleName);
		
		JLabel BirthDate = new JLabel("Birth Date");
		BirthDate.setFont(new Font("Bell MT", Font.BOLD, 18));
		BirthDate.setBounds(73, 252, 113, 14);
		panel.add(BirthDate);
		
		JLabel PlaceOfBirth = new JLabel("Place Of Birth");
		PlaceOfBirth.setFont(new Font("Bell MT", Font.BOLD, 18));
		PlaceOfBirth.setBounds(73, 303, 123, 19);
		panel.add(PlaceOfBirth);
		
		JLabel Sex = new JLabel("Sex");
		Sex.setFont(new Font("Bell MT", Font.BOLD, 18));
		Sex.setBounds(76, 361, 70, 14);
		panel.add(Sex);
		
		IdTF = new JTextField();
		IdTF.setFont(new Font("Rockwell", Font.PLAIN, 18));
		IdTF.setForeground(new Color(0, 0, 0));
		IdTF.setBackground(new Color(255, 255, 255));
		IdTF.setBounds(206, 100, 201, 20);
		panel.add(IdTF);
		IdTF.setColumns(10);
		
		FirstNameTF = new JTextField();
		FirstNameTF.setFont(new Font("Rockwell", Font.PLAIN, 18));
		FirstNameTF.setForeground(new Color(0, 0, 0));
		FirstNameTF.setBackground(new Color(255, 255, 255));
		FirstNameTF.setBounds(206, 148, 201, 20);
		panel.add(FirstNameTF);
		FirstNameTF.setColumns(10);
		
		MIddleNameTF = new JTextField();
		MIddleNameTF.setFont(new Font("Rockwell", Font.PLAIN, 18));
		MIddleNameTF.setForeground(new Color(0, 0, 0));
		MIddleNameTF.setBackground(new Color(255, 255, 255));
		MIddleNameTF.setBounds(206, 195, 201, 20);
		panel.add(MIddleNameTF);
		MIddleNameTF.setColumns(10);
		
		BirthDateTF = new JTextField();
		BirthDateTF.setFont(new Font("Rockwell", Font.PLAIN, 18));
		BirthDateTF.setForeground(new Color(0, 0, 0));
		BirthDateTF.setBackground(new Color(255, 255, 255));
		BirthDateTF.setBounds(206, 249, 201, 20);
		panel.add(BirthDateTF);
		BirthDateTF.setColumns(10);
		
		PlaceOfBirthTF = new JTextField();
		PlaceOfBirthTF.setFont(new Font("Rockwell", Font.PLAIN, 18));
		PlaceOfBirthTF.setForeground(new Color(0, 0, 0));
		PlaceOfBirthTF.setBackground(new Color(255, 255, 255));
		PlaceOfBirthTF.setBounds(206, 302, 201, 20);
		panel.add(PlaceOfBirthTF);
		PlaceOfBirthTF.setColumns(10);
		
		
		
		JLabel KebeleLabel = new JLabel("Kebele");
		KebeleLabel.setFont(new Font("Bell MT", Font.BOLD, 20));
		KebeleLabel.setBounds(78, 420, 118, 14);
		panel.add(KebeleLabel);
		
		KebeleTF = new JTextField();
		KebeleTF.setFont(new Font("Rockwell", Font.PLAIN, 18));
		KebeleTF.setBackground(new Color(255, 255, 255));
		KebeleTF.setForeground(new Color(0, 0, 0));
		KebeleTF.setBounds(206, 417, 201, 20);
		panel.add(KebeleTF);
		KebeleTF.setColumns(10);
		
		JButton SaveButton = new JButton("Save");
		SaveButton.setBackground(new Color(240, 230, 140));
		SaveButton.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 20));
		SaveButton.setBounds(155, 473, 89, 23);
		panel.add(SaveButton);
		
		
		
		JButton BackButton = new JButton("Back");
		BackButton.setBounds(325, 473, 89, 23);
		BackButton.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 20));
		panel.add(BackButton);
		BackButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
		}
		});
		
		
		JComboBox SexcomboBox = new JComboBox();
		SexcomboBox.setFont(new Font("Rockwell", Font.BOLD, 18));
		SexcomboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		SexcomboBox.setBounds(206, 357, 201, 22);
		panel.add(SexcomboBox);
		
		
		SaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Id = IdTF.getText();
				String FirstName = FirstNameTF.getText();
				String MiddleName = MIddleNameTF.getText();
                //String LaststName = LastNameTF.getText();
                String BirthDate = BirthDateTF.getText();
                String PlaceOfBirth = PlaceOfBirthTF.getText();
                String Sex = (String) SexcomboBox.getSelectedItem();
                String Kebele = KebeleTF.getText();
                if(Id.equals("") || FirstName.equals("") || MiddleName.equals("") || Sex.equals("")	){
                	JOptionPane.showMessageDialog(null,"One or more fields are Empty.\nPlease fill all the required one.");
                	
                }
                else {
                	try {
                    	String con = "jdbc:sqlserver://hjk;Database = IdForm;integratedSecurity = true";
                    	Connection connection = DriverManager.getConnection(con);
                    	Statement st = connection.createStatement();
                    	 st.executeUpdate("Insert into Users values('"+Id+"', '"+FirstName+"', '"+MiddleName+"',  '"+BirthDate+"', '"+PlaceOfBirth+"', '"+Sex+"', '"+Kebele+"')");
                    	JOptionPane.showMessageDialog(null, "Successfully Updated!!!");
                    	setVisible(false);
                    	new IdCardFillingForm().setVisible(true);
                    	
                    }catch(SQLException er) {
                    	JOptionPane.showMessageDialog(null, "A duplicated Id value.\nPlease enter another Id.");
                    	System.out.println(( er));
                    	setVisible(true);
                    	new IdCardFillingForm().setVisible(true);
                    	
                    	
                    	
                    }
                }
                
			}
			
		});
			
		
			
		}
		
		
		
	}

