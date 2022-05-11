import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;

public class Statistics extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	
	
	
	
	public  Statistics() {
		getContentPane().setFont(new Font("Bell MT", Font.BOLD, 20));
		getContentPane().setBackground(UIManager.getColor("inactiveCaption"));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Statistics");
		lblNewLabel.setFont(new Font("Bell MT", Font.BOLD, 30));
		lblNewLabel.setBounds(282, 28, 133, 31);
		getContentPane().add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(10, 106, 664, 294);
		getContentPane().add(table);
		
		JPanel staticsPanel = new JPanel();
		staticsPanel.setBackground(UIManager.getColor("info"));
		staticsPanel.setBounds(10, 0, 664, 89);
		getContentPane().add(staticsPanel);
		setBackground(Color.LIGHT_GRAY);
	setBounds(0,0,700,450);
	
	}
}
