package prozori;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTable;


public class Skladiste_zaduzenja {

	private JFrame frame;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void novi_prozor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Skladiste_zaduzenja window = new Skladiste_zaduzenja();
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
	public Skladiste_zaduzenja() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 430, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblZaduenjaZaVozae = DefaultComponentFactory.getInstance().createLabel("Voza\u010Di");
		lblZaduenjaZaVozae.setBounds(80, 24, 35, 14);
		frame.getContentPane().add(lblZaduenjaZaVozae);
		
		JLabel lblZaduenjaZaRadnike = DefaultComponentFactory.getInstance().createLabel("Radnici");
		lblZaduenjaZaRadnike.setBounds(283, 24, 35, 14);
		frame.getContentPane().add(lblZaduenjaZaRadnike);
		
		table = new JTable();
		table.setBounds(26, 51, 156, 169);
		frame.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setBounds(224, 51, 156, 169);
		frame.getContentPane().add(table_1);
	}
}