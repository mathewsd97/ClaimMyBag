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
import javax.swing.JPanel;

public class OurApplication {

	private JFrame frame;
	private JTextField claimNumbertxt;

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

		JLabel lblNewLabel_1 = new JLabel("Claim Number");
		lblNewLabel_1.setBounds(25, 61, 115, 20);
		frame.getContentPane().add(lblNewLabel_1);

		claimNumbertxt = new JTextField();
		claimNumbertxt.setBounds(148, 58, 146, 26);
		frame.getContentPane().add(claimNumbertxt);
		claimNumbertxt.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Search");
		lblNewLabel_5.setBounds(15, 16, 69, 20);
		frame.getContentPane().add(lblNewLabel_5);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					FileReading.luggage();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String airline = lblNewLabel_1.getText();
				Comparable ClaimNumber = lblNewLabel_1.getText();
				
				if(Search.indexOf(FileReading.totalLuggage, ClaimNumber) == -1){
					System.out.println("not found");
				}else{
					System.out.println("found");
				}
			
			
			

			}
		});
		btnNewButton.setBounds(179, 100, 115, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
