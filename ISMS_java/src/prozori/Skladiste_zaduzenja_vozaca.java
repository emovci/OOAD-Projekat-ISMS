package prozori;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

import com.jgoodies.forms.factories.DefaultComponentFactory;


public class Skladiste_zaduzenja_vozaca {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void novi_prozor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Skladiste_zaduzenja_vozaca window = new Skladiste_zaduzenja_vozaca();
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
	public Skladiste_zaduzenja_vozaca() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTrenutnaZaduenjaVozaa = DefaultComponentFactory.getInstance().createLabel("Trenutna zadu\u017Eenja voza\u010Da");
		lblTrenutnaZaduenjaVozaa.setBounds(154, 26, 133, 14);
		frame.getContentPane().add(lblTrenutnaZaduenjaVozaa);
		
		table = new JTable();
		table.setBounds(33, 56, 378, 177);
		frame.getContentPane().add(table);

	}
}
