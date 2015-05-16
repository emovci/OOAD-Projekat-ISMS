package prozori;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JTable;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Supervizor_ugovori {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void novi_prozor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supervizor_ugovori window = new Supervizor_ugovori();
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
	public Supervizor_ugovori() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 243, 297);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblListaUgovora = DefaultComponentFactory.getInstance().createLabel("Lista ugovora");
		lblListaUgovora.setBounds(10, 11, 92, 14);
		frame.getContentPane().add(lblListaUgovora);
		
		table = new JTable();
		table.setBounds(10, 29, 204, 118);
		frame.getContentPane().add(table);
		
		JButton btnNewButton = new JButton("Dodaj novi ugovor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Supervizori_ugovori_dodaj np= new Supervizori_ugovori_dodaj ();
				np.novi_prozor();
			}
		});
		btnNewButton.setBounds(10, 158, 204, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnRaskiniUgovor = new JButton("Raskini ugovor");
		btnRaskiniUgovor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRaskiniUgovor.setBounds(10, 208, 204, 39);
		frame.getContentPane().add(btnRaskiniUgovor);
	}
}
