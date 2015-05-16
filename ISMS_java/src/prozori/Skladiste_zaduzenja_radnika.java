package prozori;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTable;


public class Skladiste_zaduzenja_radnika {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void novi_prozor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Skladiste_zaduzenja_radnika window = new Skladiste_zaduzenja_radnika();
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
	public Skladiste_zaduzenja_radnika() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 448, 296);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTrenutnaZaduenjaRadnika = DefaultComponentFactory.getInstance().createLabel("Trenutna zadu\u017Eenja radnika");
		lblTrenutnaZaduenjaRadnika.setBounds(149, 28, 144, 14);
		frame.getContentPane().add(lblTrenutnaZaduenjaRadnika);
		
		table = new JTable();
		table.setBounds(27, 58, 381, 177);
		frame.getContentPane().add(table);
	}
}
