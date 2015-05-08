import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class supervizor_radmici_prozor {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					supervizor_radmici_prozor window = new supervizor_radmici_prozor();
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
	public supervizor_radmici_prozor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 262, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSpisakRadnika = DefaultComponentFactory.getInstance().createLabel("Spisak radnika");
		lblSpisakRadnika.setBounds(26, 11, 92, 14);
		frame.getContentPane().add(lblSpisakRadnika);
		
		table = new JTable();
		table.setBounds(26, 36, 196, 93);
		frame.getContentPane().add(table);
		
		JButton btnNewButton = new JButton("Zaposli radnika");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(26, 138, 200, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Otpusti radnika");
		btnNewButton_1.setBounds(26, 202, 200, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnIzmjeniRadnika = new JButton("Izmjeni radnika");
		btnIzmjeniRadnika.setBounds(26, 263, 200, 50);
		frame.getContentPane().add(btnIzmjeniRadnika);
	}
}
