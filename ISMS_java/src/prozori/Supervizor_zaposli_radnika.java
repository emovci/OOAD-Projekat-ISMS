package prozori;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import klase.Datum;


public class Supervizor_zaposli_radnika {

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
					Supervizor_zaposli_radnika window = new Supervizor_zaposli_radnika();
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
	public Supervizor_zaposli_radnika() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 351, 372);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIme = DefaultComponentFactory.getInstance().createLabel("Ime");
		lblIme.setBounds(10, 11, 92, 14);
		frame.getContentPane().add(lblIme);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 28, 315, 20);
		frame.getContentPane().add(textField);
		
		JLabel lblPrezime = DefaultComponentFactory.getInstance().createLabel("Prezime");
		lblPrezime.setBounds(10, 59, 92, 14);
		frame.getContentPane().add(lblPrezime);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 74, 315, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblDatumRoenja = DefaultComponentFactory.getInstance().createLabel("Datum ro\u0111enja");
		lblDatumRoenja.setBounds(10, 101, 92, 14);
		frame.getContentPane().add(lblDatumRoenja);
		
		String[] dani = { "1", "2", "3", "4", "5","6", "7", "8", "9", "10","11", "12", "13", "14", "15","16", "17", "18", "19", "20","21", "22", "23", "24", "25","26", "27", "28", "29", "30","31" };
		JComboBox comboBox = new JComboBox(dani);
		comboBox.setBounds(10, 126, 81, 20);
		frame.getContentPane().add(comboBox);
		
		String[] mjeseci = { "1", "2", "3", "4", "5","6", "7", "8", "9", "10","11", "12"};
		JComboBox comboBox_1 = new JComboBox(mjeseci);
		comboBox_1.setBounds(119, 126, 72, 20);
		frame.getContentPane().add(comboBox_1);
		
		String[] godine = { "2015", "2016", "2017", "2018", "2019","2020", "2021", "2022", "2023", "2024","2025", "2026"};
		JComboBox comboBox_2 = new JComboBox(godine);
		comboBox_2.setBounds(216, 126, 109, 20);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lblBrojTelefona = DefaultComponentFactory.getInstance().createLabel("Broj telefona");
		lblBrojTelefona.setBounds(10, 157, 92, 14);
		frame.getContentPane().add(lblBrojTelefona);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 183, 315, 20);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Zaposli");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
            {
					if(textField.getText()=="")
					{
						JOptionPane.showMessageDialog(null, "Pogre�no uneseno ime!");
						return;
					}
					if(textField_1.getText()=="")
					{
						JOptionPane.showMessageDialog(null, "Pogre�no uneseno prezime!");
						return;
					}
					
					if(textField_2.getText()=="")
					{
						JOptionPane.showMessageDialog(null, "Pogre�no unesen broj telefona!");
						return;
					}
					if(textField_3.getText()=="")
					{
						JOptionPane.showMessageDialog(null, "Pogre�no unesena plata!");
						return;
					}
					
					int dan = Integer.parseInt((String) comboBox.getSelectedItem());
					int mjesec = Integer.parseInt((String) comboBox_1.getSelectedItem());
					int godina = Integer.parseInt((String) comboBox_2.getSelectedItem());
					Datum rodjenje=null;
					try
					{
						rodjenje=new Datum (dan,mjesec,godina,0,0);
					}
					catch( InterruptedException izuzetak) 
					{
						JOptionPane.showMessageDialog(null, "Nepostoje�i datum!");
						return;
					}				
					
					Glavni_prozor.radnici.dodaj_radnika(textField.getText(), textField_1.getText(), rodjenje, true, Integer.parseInt(textField_3.getText()), null);
					JOptionPane.showMessageDialog(null, "Radnik uspje�no dodan!");
					
			}
		});
		btnNewButton.setBounds(10, 276, 315, 50);
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
		textField_3.setColumns(10);
		textField_3.setBounds(10, 239, 315, 20);
		frame.getContentPane().add(textField_3);
	}
}
