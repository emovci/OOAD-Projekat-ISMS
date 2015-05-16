package prozori;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;


public class Supervizor_izmjeni_vozac {

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
					Supervizor_izmjeni_vozac window = new Supervizor_izmjeni_vozac();
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
	public Supervizor_izmjeni_vozac() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 181, 432);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("Odustani");
		button.setBounds(10, 337, 147, 50);
		frame.getContentPane().add(button);
		
		JButton btnIzmjeni = new JButton("Izmjeni");
		btnIzmjeni.setBounds(10, 276, 147, 50);
		frame.getContentPane().add(btnIzmjeni);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 238, 147, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 182, 147, 20);
		frame.getContentPane().add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 125, 28, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(58, 125, 28, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(104, 125, 47, 20);
		frame.getContentPane().add(comboBox_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 73, 147, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 27, 147, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblIme = DefaultComponentFactory.getInstance().createLabel("Ime");
		lblIme.setBounds(10, 11, 92, 14);
		frame.getContentPane().add(lblIme);
		
		JLabel lblPrezime = DefaultComponentFactory.getInstance().createLabel("Prezime");
		lblPrezime.setBounds(10, 58, 92, 14);
		frame.getContentPane().add(lblPrezime);
		
		JLabel lblDatumRoenja = DefaultComponentFactory.getInstance().createLabel("Datum ro\u0111enja");
		lblDatumRoenja.setBounds(10, 104, 92, 14);
		frame.getContentPane().add(lblDatumRoenja);
		
		JLabel lblBrojTelefona = DefaultComponentFactory.getInstance().createLabel("Broj telefona");
		lblBrojTelefona.setBounds(10, 157, 92, 14);
		frame.getContentPane().add(lblBrojTelefona);
		
		JLabel lblPlata = DefaultComponentFactory.getInstance().createLabel("Plata");
		lblPlata.setBounds(10, 213, 92, 14);
		frame.getContentPane().add(lblPlata);
	}
}
