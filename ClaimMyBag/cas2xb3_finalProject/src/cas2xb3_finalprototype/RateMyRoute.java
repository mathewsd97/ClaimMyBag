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

public class RateMyRoute extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RateMyRoute frame = new RateMyRoute();
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
	public RateMyRoute() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 297);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRateMyRoute = new JLabel("Rate My Route");
		lblRateMyRoute.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRateMyRoute.setBounds(120, 11, 158, 27);
		contentPane.add(lblRateMyRoute);
		
		JLabel lblStart = new JLabel("Departure");
		lblStart.setBounds(22, 83, 49, 14);
		contentPane.add(lblStart);
		
		JLabel lblArrival = new JLabel("Arrival");
		lblArrival.setBounds(40, 135, 31, 14);
		contentPane.add(lblArrival);
		
		textField = new JTextField();
		textField.setBounds(120, 80, 211, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(120, 132, 211, 20);
		contentPane.add(textField_1);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBounds(214, 177, 146, 53);
		contentPane.add(btnEnter);
		
		JButton button = new JButton("Home");
		button.setBounds(58, 177, 146, 53);
		contentPane.add(button);
	}

}
