import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class supervizor_klijenti_prozor {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					supervizor_klijenti_prozor window = new supervizor_klijenti_prozor();
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
	public supervizor_klijenti_prozor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 243, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 33, 204, 118);
		frame.getContentPane().add(table);
		
		JButton btnDodajNovogKlijenta = new JButton("Dodaj novog klijenta");
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
