import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class radnik_izbaci_robu_prozor {

	private JFrame frame;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					radnik_izbaci_robu_prozor window = new radnik_izbaci_robu_prozor();
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
	public radnik_izbaci_robu_prozor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 324, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setText("Komentar");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(35, 222, 230, 62);
		frame.getContentPane().add(textField);
		
		JLabel lblIzbaciRobuZa = DefaultComponentFactory.getInstance().createLabel("Izbaci robu za premjestiti");
		lblIzbaciRobuZa.setBounds(91, 11, 120, 14);
		frame.getContentPane().add(lblIzbaciRobuZa);
		
		table = new JTable();
		table.setBounds(35, 36, 230, 166);
		frame.getContentPane().add(table);
		
		JButton btnIzbaci = new JButton("Izbaci");
		btnIzbaci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIzbaci.setBounds(35, 295, 230, 50);
		frame.getContentPane().add(btnIzbaci);
		
		JButton button_1 = new JButton("Odsustani");
		button_1.setBounds(35, 356, 230, 50);
		frame.getContentPane().add(button_1);
	}
}
