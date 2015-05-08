import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;


public class supervizor_izmjeni_radnika {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					supervizor_izmjeni_radnika window = new supervizor_izmjeni_radnika();
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
	public supervizor_izmjeni_radnika() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 216, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(24, 31, 147, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(24, 77, 147, 20);
		frame.getContentPane().add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(24, 129, 28, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(72, 129, 28, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(118, 129, 47, 20);
		frame.getContentPane().add(comboBox_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(24, 185, 147, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(24, 241, 147, 20);
		frame.getContentPane().add(textField_3);
		
		JButton btnIzmjeni = new JButton("Izmjeni");
		btnIzmjeni.setBounds(24, 279, 147, 50);
		frame.getContentPane().add(btnIzmjeni);
		
		JButton button_1 = new JButton("Odustani");
		button_1.setBounds(24, 340, 147, 50);
		frame.getContentPane().add(button_1);
		
		JLabel lblIme = DefaultComponentFactory.getInstance().createLabel("Ime");
		lblIme.setBounds(24, 11, 92, 14);
		frame.getContentPane().add(lblIme);
		
		JLabel lblPrezime = DefaultComponentFactory.getInstance().createLabel("Prezime");
		lblPrezime.setBounds(24, 62, 92, 14);
		frame.getContentPane().add(lblPrezime);
		
		JLabel lblDatumRoenja = DefaultComponentFactory.getInstance().createLabel("Datum ro\u0111enja");
		lblDatumRoenja.setBounds(24, 160, 92, 14);
		frame.getContentPane().add(lblDatumRoenja);
		
		JLabel lblBrojTelefona = DefaultComponentFactory.getInstance().createLabel("Broj telefona");
		lblBrojTelefona.setBounds(24, 216, 92, 14);
		frame.getContentPane().add(lblBrojTelefona);
	}
}
