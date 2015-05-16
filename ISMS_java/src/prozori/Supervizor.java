package prozori;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Supervizor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supervizor window = new Supervizor();
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
	public Supervizor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 278, 370);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnOtvoriSpisakRadnika = new JButton("Otvori spisak radnika");
		btnOtvoriSpisakRadnika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Supervizor_radmici np= new Supervizor_radmici ();
				np.novi_prozor();
			}
		});
		btnOtvoriSpisakRadnika.setBounds(29, 22, 200, 50);
		frame.getContentPane().add(btnOtvoriSpisakRadnika);
		
		JButton btnOtvoriSpisakVozaa = new JButton("Otvori spisak voza\u010Da");
		btnOtvoriSpisakVozaa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Supervizor_vozac np= new Supervizor_vozac ();
				np.novi_prozor();
			}
		});
		btnOtvoriSpisakVozaa.setBounds(29, 83, 200, 50);
		frame.getContentPane().add(btnOtvoriSpisakVozaa);
		
		JButton btnNewButton = new JButton("Otvori spisak ugovora");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Supervizor_ugovori np= new Supervizor_ugovori ();
				np.novi_prozor();
			}
		});
		btnNewButton.setBounds(29, 144, 200, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnKreirajNoviUgovor = new JButton("Otvori spisak klijenata");
		btnKreirajNoviUgovor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Supervizor_klijenti np= new Supervizor_klijenti ();
				np.novi_prozor();
			}
		});
		btnKreirajNoviUgovor.setBounds(29, 202, 200, 50);
		frame.getContentPane().add(btnKreirajNoviUgovor);
		
		JButton button = new JButton("Pogledaj statistiku fabrike");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(29, 263, 200, 50);
		frame.getContentPane().add(button);
	}

}
