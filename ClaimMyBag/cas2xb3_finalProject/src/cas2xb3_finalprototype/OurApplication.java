package cas2xb3_finalprototype;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OurApplication {

	private JFrame frame;
	private JTextField airlinetxt;
	private JTextField claimNumbertxt;
	private JTextField incidentDatetxt;
	private JTextField claimTypetxt;
	private JTextField itemtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OurApplication window = new OurApplication();
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
	public OurApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 623, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Airline");
		lblNewLabel.setBounds(61, 55, 69, 43);
		frame.getContentPane().add(lblNewLabel);

		airlinetxt = new JTextField();
		airlinetxt.setBounds(138, 63, 146, 26);
		frame.getContentPane().add(airlinetxt);
		airlinetxt.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Claim Number");
		lblNewLabel_1.setBounds(15, 125, 115, 20);
		frame.getContentPane().add(lblNewLabel_1);

		claimNumbertxt = new JTextField();
		claimNumbertxt.setBounds(138, 122, 146, 26);
		frame.getContentPane().add(claimNumbertxt);
		claimNumbertxt.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Incident Date");
		lblNewLabel_2.setBounds(15, 184, 115, 20);
		frame.getContentPane().add(lblNewLabel_2);

		incidentDatetxt = new JTextField();
		incidentDatetxt.setBounds(138, 181, 146, 26);
		frame.getContentPane().add(incidentDatetxt);
		incidentDatetxt.setColumns(10);

		claimTypetxt = new JTextField();
		claimTypetxt.setBounds(138, 235, 146, 26);
		frame.getContentPane().add(claimTypetxt);
		claimTypetxt.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Claim Type");
		lblNewLabel_3.setBounds(30, 238, 115, 20);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Item");
		lblNewLabel_4.setBounds(76, 295, 69, 20);
		frame.getContentPane().add(lblNewLabel_4);

		itemtxt = new JTextField();
		itemtxt.setBounds(138, 292, 146, 26);
		frame.getContentPane().add(itemtxt);
		itemtxt.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Search");
		lblNewLabel_5.setBounds(15, 16, 69, 20);
		frame.getContentPane().add(lblNewLabel_5);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String airline = lblNewLabel.getText();
				int ClaimNumber = Double.parseDouble(lblNewLabel_1.getText());
	//			String incidentDate = lblNewLabel_2.getText();
		//		String ClaimType = lblNewLabel_3.getText();
//				String item = lblNewLabel_4.getText();
				
			Search(FileReading.totalLuggage, ClaimNumber);

			}
		});
		btnNewButton.setBounds(177, 334, 115, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
