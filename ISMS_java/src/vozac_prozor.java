import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JTable;


public class vozac_prozor {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vozac_prozor window = new vozac_prozor();
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
	public vozac_prozor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 276, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JToggleButton tglbtnPrihvatamZaduenje = new JToggleButton("Prihvatam zadu\u017Eenje");
		tglbtnPrihvatamZaduenje.setBounds(34, 47, 200, 50);
		frame.getContentPane().add(tglbtnPrihvatamZaduenje);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Status zadu\u017Eenja");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setEnabled(false);
		chckbxNewCheckBox.setBounds(81, 17, 133, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Rute:");
		lblNewJgoodiesLabel.setBounds(44, 108, 183, 23);
		frame.getContentPane().add(lblNewJgoodiesLabel);
		
		table = new JTable();
		table.setBounds(34, 130, 200, 123);
		frame.getContentPane().add(table);
		
		JToggleButton tglbtnZavrenoZaduenje = new JToggleButton("Zavr\u0161eno zadu\u017Eenje");
		tglbtnZavrenoZaduenje.setBounds(34, 333, 200, 50);
		frame.getContentPane().add(tglbtnZavrenoZaduenje);
		
		JToggleButton tglbtnIzbaciRutu = new JToggleButton("Izbaci rutu");
		tglbtnIzbaciRutu.setBounds(34, 264, 200, 50);
		frame.getContentPane().add(tglbtnIzbaciRutu);
	}
}
