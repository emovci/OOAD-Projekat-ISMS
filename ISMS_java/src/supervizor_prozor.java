import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class supervizor_prozor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					supervizor_prozor window = new supervizor_prozor();
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
	public supervizor_prozor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 278, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnOtvoriSpisakRadnika = new JButton("Otvori spisak radnika");
		btnOtvoriSpisakRadnika.setBounds(29, 22, 200, 50);
		frame.getContentPane().add(btnOtvoriSpisakRadnika);
		
		JButton btnOtvoriSpisakVozaa = new JButton("Otvori spisak voza\u010Da");
		btnOtvoriSpisakVozaa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOtvoriSpisakVozaa.setBounds(29, 83, 200, 50);
		frame.getContentPane().add(btnOtvoriSpisakVozaa);
		
		JButton btnNewButton = new JButton("Otvori spisak ugovora");
		btnNewButton.setBounds(29, 144, 200, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnKreirajNoviUgovor = new JButton("Otvori spisak klijenata");
		btnKreirajNoviUgovor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnKreirajNoviUgovor.setBounds(29, 202, 200, 50);
		frame.getContentPane().add(btnKreirajNoviUgovor);
		
		JButton button = new JButton("Pogledaj statistiku fabrike");
		button.setBounds(29, 263, 200, 50);
		frame.getContentPane().add(button);
	}

}
