import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTable;


public class skladiste_zaduzenja_radnika_prozor {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					skladiste_zaduzenja_radnika_prozor window = new skladiste_zaduzenja_radnika_prozor();
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
	public skladiste_zaduzenja_radnika_prozor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 448, 296);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTrenutnaZaduenjaRadnika = DefaultComponentFactory.getInstance().createLabel("Trenutna zadu\u017Eenja radnika");
		lblTrenutnaZaduenjaRadnika.setBounds(149, 28, 144, 14);
		frame.getContentPane().add(lblTrenutnaZaduenjaRadnika);
		
		table = new JTable();
		table.setBounds(27, 58, 381, 177);
		frame.getContentPane().add(table);
	}
}
