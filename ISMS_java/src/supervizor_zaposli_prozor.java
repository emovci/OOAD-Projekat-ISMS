import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class supervizor_zaposli_prozor {

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
					supervizor_zaposli_prozor window = new supervizor_zaposli_prozor();
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
	public supervizor_zaposli_prozor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 182, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIme = DefaultComponentFactory.getInstance().createLabel("Ime");
		lblIme.setBounds(10, 11, 92, 14);
		frame.getContentPane().add(lblIme);
		
		textField = new JTextField();
		textField.setBounds(10, 28, 147, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPrezime = DefaultComponentFactory.getInstance().createLabel("Prezime");
		lblPrezime.setBounds(10, 59, 92, 14);
		frame.getContentPane().add(lblPrezime);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 74, 147, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDatumRoenja = DefaultComponentFactory.getInstance().createLabel("Datum ro\u0111enja");
		lblDatumRoenja.setBounds(10, 101, 92, 14);
		frame.getContentPane().add(lblDatumRoenja);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 126, 28, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(58, 126, 28, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(104, 126, 47, 20);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lblBrojTelefona = DefaultComponentFactory.getInstance().createLabel("Broj telefona");
		lblBrojTelefona.setBounds(10, 157, 92, 14);
		frame.getContentPane().add(lblBrojTelefona);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 182, 147, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Zaposli");
		btnNewButton.setBounds(10, 276, 147, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOdustani.setBounds(10, 337, 147, 50);
		frame.getContentPane().add(btnOdustani);
		
		JLabel lblPlata = DefaultComponentFactory.getInstance().createLabel("Plata");
		lblPlata.setBounds(10, 213, 92, 14);
		frame.getContentPane().add(lblPlata);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 238, 147, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
	}
}
