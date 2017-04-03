package cas2xb3_finalprototype;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NewSearch extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterAirline;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewSearch frame = new NewSearch();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NewSearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewSearch = new JLabel("New Search");
		lblNewSearch.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewSearch.setBounds(136, 11, 133, 39);
		contentPane.add(lblNewSearch);
		
		JLabel lblAirline = new JLabel("Airline");
		lblAirline.setBounds(46, 71, 29, 14);
		contentPane.add(lblAirline);
		
		JLabel lblNewLabel = new JLabel("Claim Number");
		lblNewLabel.setBounds(10, 124, 65, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblIncidentDate = new JLabel("Incident Date");
		lblIncidentDate.setBounds(10, 169, 65, 14);
		contentPane.add(lblIncidentDate);
		
		JLabel lblClaimType = new JLabel("Claim Type");
		lblClaimType.setBounds(23, 221, 52, 14);
		contentPane.add(lblClaimType);
		
		JLabel lblItem = new JLabel("Item");
		lblItem.setBounds(53, 275, 22, 14);
		contentPane.add(lblItem);
		
		txtEnterAirline = new JTextField();
		txtEnterAirline.setBounds(113, 68, 230, 20);
		contentPane.add(txtEnterAirline);
		txtEnterAirline.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(113, 121, 230, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(113, 166, 230, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(113, 218, 230, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(113, 272, 230, 20);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBounds(101, 349, 181, 61);
		contentPane.add(btnNewButton);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(329, 10, 65, 49);
		contentPane.add(btnHome);
	}
}
