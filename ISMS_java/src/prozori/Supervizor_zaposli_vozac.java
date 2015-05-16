package prozori;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;


public class Supervizor_zaposli_vozac {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void novi_prozor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supervizor_zaposli_vozac window = new Supervizor_zaposli_vozac();
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
	public Supervizor_zaposli_vozac() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 184, 432);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 28, 147, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 74, 147, 20);
		frame.getContentPane().add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 126, 28, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(58, 126, 28, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(104, 126, 47, 20);
		frame.getContentPane().add(comboBox_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 183, 147, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 239, 147, 20);
		frame.getContentPane().add(textField_3);
		
		JButton button = new JButton("Zaposli");
		button.setBounds(10, 277, 147, 50);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Odustani");
		button_1.setBounds(10, 338, 147, 50);
		frame.getContentPane().add(button_1);
		
		JLabel lblIme = DefaultComponentFactory.getInstance().createLabel("Ime");
		lblIme.setBounds(10, -11, 200, 50);
		frame.getContentPane().add(lblIme);
		
		JLabel lblPrezime = DefaultComponentFactory.getInstance().createLabel("Prezime");
		lblPrezime.setBounds(10, 59, 92, 14);
		frame.getContentPane().add(lblPrezime);
		
		JLabel lblDatumRoenja = DefaultComponentFactory.getInstance().createLabel("Datum ro\u0111enja");
		lblDatumRoenja.setBounds(10, 105, 92, 14);
		frame.getContentPane().add(lblDatumRoenja);
		
		JLabel lblBrojTelefona = DefaultComponentFactory.getInstance().createLabel("Broj telefona");
		lblBrojTelefona.setBounds(10, 158, 92, 14);
		frame.getContentPane().add(lblBrojTelefona);
		
		JLabel lblPlata = DefaultComponentFactory.getInstance().createLabel("Plata");
		lblPlata.setBounds(10, 214, 92, 14);
		frame.getContentPane().add(lblPlata);
	}
}
