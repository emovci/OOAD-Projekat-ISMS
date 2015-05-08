import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

import com.jgoodies.forms.factories.DefaultComponentFactory;


public class skladiste_zaduzenja_vozaca_prozor {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					skladiste_zaduzenja_vozaca_prozor window = new skladiste_zaduzenja_vozaca_prozor();
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
	public skladiste_zaduzenja_vozaca_prozor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTrenutnaZaduenjaVozaa = DefaultComponentFactory.getInstance().createLabel("Trenutna zadu\u017Eenja voza\u010Da");
		lblTrenutnaZaduenjaVozaa.setBounds(154, 26, 133, 14);
		frame.getContentPane().add(lblTrenutnaZaduenjaVozaa);
		
		table = new JTable();
		table.setBounds(33, 56, 378, 177);
		frame.getContentPane().add(table);

	}
}
