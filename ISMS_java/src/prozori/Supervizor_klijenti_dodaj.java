package prozori;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;


public class Supervizor_klijenti_dodaj {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
	private JButton btnDodajKlijenta;
	private JButton btnOdustani;

	/**
	 * Launch the application.
	 */
	public static void novi_prozor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supervizor_klijenti_dodaj window = new Supervizor_klijenti_dodaj();
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
	public Supervizor_klijenti_dodaj() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 193, 379);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblImeKlijenta = DefaultComponentFactory.getInstance().createLabel("Ime klijenta");
		lblImeKlijenta.setBounds(10, 11, 92, 14);
		frame.getContentPane().add(lblImeKlijenta);
		
		textField = new JTextField();
		textField.setBounds(10, 33, 125, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblRobaNaRaspolaganju = DefaultComponentFactory.getInstance().createLabel("Roba na raspolaganju");
		lblRobaNaRaspolaganju.setBounds(10, 61, 125, 14);
		frame.getContentPane().add(lblRobaNaRaspolaganju);
		
		table = new JTable();
		table.setBounds(10, 86, 156, 144);
		frame.getContentPane().add(table);
		
		btnDodajKlijenta = new JButton("Dodaj klijenta");
		btnDodajKlijenta.setBounds(10, 236, 157, 43);
		frame.getContentPane().add(btnDodajKlijenta);
		
		btnOdustani = new JButton("Odustani");
		btnOdustani.setBounds(10, 290, 157, 43);
		frame.getContentPane().add(btnOdustani);
	}
}
