package prozori;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import klase.Datum;

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
	public static void novi_prozor(int id) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supervizor_izmjeni_vozac window = new Supervizor_izmjeni_vozac(id);
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
	public Supervizor_izmjeni_vozac(int id) {
		initialize(id);
	}

	/**
	 * Initialize the contents of the frame.
	 */
		private void initialize(int id) {
			frame = new JFrame();
			frame.setBounds(100, 100, 351, 372);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(10, 28, 315, 20);
			frame.getContentPane().add(textField);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(10, 74, 315, 20);
			frame.getContentPane().add(textField_1);
			
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
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(10, 183, 315, 20);
			frame.getContentPane().add(textField_2);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(10, 239, 315, 20);
			frame.getContentPane().add(textField_3);
			
			JButton btnIzmjeni = new JButton("Izmjeni");
			btnIzmjeni.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					for(int i=0; i<Glavni_prozor.radnici.get_radnike().size(); i++)
					{
							if(id==Glavni_prozor.radnici.get_radnike().elementAt(i).get_id())
							{
																	
									if(textField.getText()=="")
									{
										JOptionPane.showMessageDialog(null, "Pogrešno uneseno ime!");
										return;
									}
									if(textField_1.getText()=="")
									{
										JOptionPane.showMessageDialog(null, "Pogrešno uneseno prezime!");
										return;
									}
									
									if(textField_2.getText()=="")
									{
										JOptionPane.showMessageDialog(null, "Pogrešno unesen broj telefona!");
										return;
									}
									if(textField_3.getText()=="")
									{
										JOptionPane.showMessageDialog(null, "Pogrešno unesena plata!");
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
									catch(InterruptedException izuzetak) 
									{
										JOptionPane.showMessageDialog(null, "Nepostojeæi datum!");
										return;
									}	
																	
									Glavni_prozor.radnici.get_radnike().elementAt(i).set_Ime(textField.getText());
									Glavni_prozor.radnici.get_radnike().elementAt(i).set_prezime(textField_1.getText());
									Glavni_prozor.radnici.get_radnike().elementAt(i).set_plata_dnevnica(Integer.parseInt(textField_3.getText()));
									try{Glavni_prozor.radnici.get_radnike().elementAt(i).set_datum_rodjenja(new Datum(dan,mjesec,godina,0,0));}
									catch( InterruptedException izuzetak) {};
									
									JOptionPane.showMessageDialog(null, "Radnik izmjenjen!");
									break;
							}
					}
				}
			});
			btnIzmjeni.setBounds(10, 270, 315, 50);
			frame.getContentPane().add(btnIzmjeni);
			
			JButton button_1 = new JButton("Odustani");
			button_1.setBounds(24, 340, 147, 50);
			frame.getContentPane().add(button_1);
			
			JLabel lblIme = DefaultComponentFactory.getInstance().createLabel("Ime");
			lblIme.setBounds(10, 11, 128, 14);
			frame.getContentPane().add(lblIme);
			
			JLabel lblPrezime = DefaultComponentFactory.getInstance().createLabel("Prezime");
			lblPrezime.setBounds(10, 59, 92, 14);
			frame.getContentPane().add(lblPrezime);
			
			JLabel lblDatumRoenja = DefaultComponentFactory.getInstance().createLabel("Datum ro\u0111enja");
			lblDatumRoenja.setBounds(10, 105, 128, 14);
			frame.getContentPane().add(lblDatumRoenja);
			
			JLabel lblBrojTelefona = DefaultComponentFactory.getInstance().createLabel("Broj telefona");
			lblBrojTelefona.setBounds(10, 169, 128, 14);
			frame.getContentPane().add(lblBrojTelefona);
			
			JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Plata");
			lblNewJgoodiesLabel.setBounds(10, 214, 147, 39);
			frame.getContentPane().add(lblNewJgoodiesLabel);
	}
}
