import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class vozac_izbaci_rutu_prozor {

	private JFrame frame;
	private JTable table;
	private JTextField txtDfsd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vozac_izbaci_rutu_prozor window = new vozac_izbaci_rutu_prozor();
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
	public vozac_izbaci_rutu_prozor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblListaRuta = DefaultComponentFactory.getInstance().createLabel("Lista ruta");
		lblListaRuta.setBounds(114, 13, 57, 14);
		frame.getContentPane().add(lblListaRuta);
		
		table = new JTable();
		table.setBounds(30, 38, 230, 166);
		frame.getContentPane().add(table);
		
		JButton btnIzbaciRute = new JButton("Izbaci rute");
		btnIzbaciRute.setBounds(30, 303, 230, 50);
		frame.getContentPane().add(btnIzbaciRute);
		
		JButton btnOsustani = new JButton("Odsustani");
		btnOsustani.setBounds(30, 364, 230, 50);
		frame.getContentPane().add(btnOsustani);
		
		txtDfsd = new JTextField();
		txtDfsd.setHorizontalAlignment(SwingConstants.CENTER);
		txtDfsd.setText("Komentar");
		txtDfsd.setBounds(30, 233, 230, 62);
		frame.getContentPane().add(txtDfsd);
		txtDfsd.setColumns(10);
	}
}
