package prozori;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Supervizor_klijenti {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void novi_prozor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supervizor_klijenti window = new Supervizor_klijenti();
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
	public Supervizor_klijenti() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 243, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 33, 204, 118);
		frame.getContentPane().add(table);
		
		JButton btnDodajNovogKlijenta = new JButton("Dodaj novog klijenta");
		btnDodajNovogKlijenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Supervizor_klijenti_dodaj np= new Supervizor_klijenti_dodaj ();
				np.novi_prozor();
			}
		});
		btnDodajNovogKlijenta.setBounds(10, 162, 204, 39);
		frame.getContentPane().add(btnDodajNovogKlijenta);
		
		JButton btnIzbaciKlijenta = new JButton("Izbaci klijenta");
		btnIzbaciKlijenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIzbaciKlijenta.setBounds(10, 212, 204, 39);
		frame.getContentPane().add(btnIzbaciKlijenta);
		
		JLabel lblListaKlijenata = DefaultComponentFactory.getInstance().createLabel("Lista klijenata");
		lblListaKlijenata.setBounds(10, 11, 92, 14);
		frame.getContentPane().add(lblListaKlijenata);
	}
}
