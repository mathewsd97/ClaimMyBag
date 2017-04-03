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
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class NewSearch extends JFrame {

	private JPanel contentPane;
	private JPanel rateroute;
	private JTextField textField_1;
	//private final Action action = new SwingAction();
	private int results;
	private String statement;
	private JTextField textField;

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
		setBounds(100, 100, 488, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewSearch = new JLabel("New Search");
		lblNewSearch.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewSearch.setBounds(136, 11, 133, 39);
		contentPane.add(lblNewSearch);
		
		JLabel lblNewLabel = new JLabel("Claim Number");
		lblNewLabel.setBounds(25, 84, 124, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(146, 78, 230, 26);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileReading.luggage();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//String airline = lblNewLabel.getText();
				String ClaimNumber = lblNewLabel.getText();
				results = Search.indexOf(FileReading.totalLuggage, ClaimNumber);
				if(Search.indexOf(FileReading.totalLuggage, ClaimNumber) == -1 ){
					statement = "Luggage not found.";
					textField.setText(statement);
				}else{
					statement = "Luggage Found.";
					textField.setText(statement);
				}
				}
		});
		//btnNewButton.setAction(action);
		btnNewButton.setBounds(223, 126, 153, 49);
		contentPane.add(btnNewButton);
		

		JButton btnHome = new JButton("Rate My Route");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RateMyRoute rate = new RateMyRoute();
				rate.setVisible(true);
				contentPane.setVisible(false);
				
			}
		});
		btnHome.setBounds(83, 126, 133, 49);
		contentPane.add(btnHome);
		
		textField = new JTextField();
		textField.setBounds(83, 234, 293, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblResults = new JLabel("Results:");
		lblResults.setBounds(83, 212, 69, 20);
		contentPane.add(lblResults);

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
