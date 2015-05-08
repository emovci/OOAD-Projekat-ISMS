import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class supervizor_vozac_prozor {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					supervizor_vozac_prozor window = new supervizor_vozac_prozor();
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
	public supervizor_vozac_prozor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 262, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(24, 39, 196, 93);
		frame.getContentPane().add(table);
		
		JButton btnZaposliVozaa = new JButton("Zaposli voza\u010Da");
		btnZaposliVozaa.setBounds(24, 141, 200, 50);
		frame.getContentPane().add(btnZaposliVozaa);
		
		JButton btnOtpustiVozaa = new JButton("Otpusti voza\u010Da");
		btnOtpustiVozaa.setBounds(24, 205, 200, 50);
		frame.getContentPane().add(btnOtpustiVozaa);
		
		JButton btnIzmjeniVozaa = new JButton("Izmjeni voza\u010Da");
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
