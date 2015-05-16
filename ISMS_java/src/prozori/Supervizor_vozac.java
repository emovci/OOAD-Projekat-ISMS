package prozori;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Supervizor_vozac {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void novi_prozor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supervizor_vozac window = new Supervizor_vozac();
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
	public Supervizor_vozac() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 262, 493);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(24, 39, 196, 93);
		frame.getContentPane().add(table);
		
		JButton btnZaposliVozaa = new JButton("Zaposli voza\u010Da");
		btnZaposliVozaa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Supervizor_zaposli_vozac np= new Supervizor_zaposli_vozac ();
				np.novi_prozor();
			}
		});
		btnZaposliVozaa.setBounds(24, 141, 200, 50);
		frame.getContentPane().add(btnZaposliVozaa);
		
		JButton btnOtpustiVozaa = new JButton("Otpusti voza\u010Da");
		btnOtpustiVozaa.setBounds(24, 205, 200, 50);
		frame.getContentPane().add(btnOtpustiVozaa);
		
		JButton btnIzmjeniVozaa = new JButton("Izmjeni voza\u010Da");
		btnIzmjeniVozaa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Supervizor_izmjeni_vozac np= new Supervizor_izmjeni_vozac ();
				np.novi_prozor();
			}
		});
		btnIzmjeniVozaa.setBounds(24, 266, 200, 50);
		frame.getContentPane().add(btnIzmjeniVozaa);
		
		JLabel lblSpisakVozaca = DefaultComponentFactory.getInstance().createLabel("Spisak voza\u010Da");
		lblSpisakVozaca.setBounds(24, 11, 92, 14);
		frame.getContentPane().add(lblSpisakVozaca);
		
		JButton btnDodajKamion = new JButton("Dodaj kamion");
		btnDodajKamion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDodajKamion.setBounds(24, 327, 200, 50);
		frame.getContentPane().add(btnDodajKamion);
		
		JButton btnIzbaciKamion = new JButton("Izbaci kamion");
		btnIzbaciKamion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIzbaciKamion.setBounds(24, 387, 200, 50);
		frame.getContentPane().add(btnIzbaciKamion);
	}
}
