package prozori;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;


public class Skladiste_rute_dodaj {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void novi_prozor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Skladiste_rute_dodaj window = new Skladiste_rute_dodaj();
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
	public Skladiste_rute_dodaj() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 241, 401);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSelektujUgovor = DefaultComponentFactory.getInstance().createLabel("Selektuj ugovor");
		lblSelektujUgovor.setBounds(27, 11, 92, 14);
		frame.getContentPane().add(lblSelektujUgovor);
		
		JList list_1 = new JList();
		list_1.setBounds(75, 76, 1, 1);
		frame.getContentPane().add(list_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(27, 36, 157, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblUnesiNazivMjesta = DefaultComponentFactory.getInstance().createLabel("Unesi naziv mjesta");
		lblUnesiNazivMjesta.setBounds(27, 67, 92, 14);
		frame.getContentPane().add(lblUnesiNazivMjesta);
		
		textField = new JTextField();
		textField.setBounds(27, 92, 169, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblUnesiUdaljenostOd = DefaultComponentFactory.getInstance().createLabel("Unesi udaljenost od drugih mjesta");
		lblUnesiUdaljenostOd.setBounds(27, 123, 177, 14);
		frame.getContentPane().add(lblUnesiUdaljenostOd);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.setBounds(27, 246, 177, 50);
		frame.getContentPane().add(btnDodaj);
		
		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.setBounds(27, 303, 177, 50);
		frame.getContentPane().add(btnOdustani);
		
		table = new JTable();
		table.setBounds(55, 181, 1, 1);
		frame.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setBounds(27, 148, 169, 87);
		frame.getContentPane().add(table_1);
	}
}
