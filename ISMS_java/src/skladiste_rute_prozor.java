import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class skladiste_rute_prozor {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					skladiste_rute_prozor window = new skladiste_rute_prozor();
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
	public skladiste_rute_prozor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 420, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblListaRuta = DefaultComponentFactory.getInstance().createLabel("Lista ruta");
		lblListaRuta.setBounds(25, 24, 92, 14);
		frame.getContentPane().add(lblListaRuta);
		
		table = new JTable();
		table.setBounds(25, 51, 347, 129);
		frame.getContentPane().add(table);
		
		JButton btnDodajRutu = new JButton("Dodaj mjesto");
		btnDodajRutu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDodajRutu.setBounds(99, 199, 200, 50);
		frame.getContentPane().add(btnDodajRutu);
	}
}
