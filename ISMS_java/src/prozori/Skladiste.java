package prozori;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import java.util.Vector;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Skladiste {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnGeneriiNaredbe;
	private JButton btnPrikaiRute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Skladiste window = new Skladiste();
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
	public Skladiste() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 526, 336);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTrenutnoStanjeU = DefaultComponentFactory.getInstance().createLabel("Trenutno stanje u skladu\u0161tu (sedmi\u010Dni podaci)");
		lblTrenutnoStanjeU.setBounds(37, 27, 226, 14);
		frame.getContentPane().add(lblTrenutnoStanjeU);
		
	    Object[][] cellData = { { "1-1", "1-2" }, { "2-1", "2-2" } , { "1-1", "1-2" }, { "2-1", "2-2" } , { "1-1", "1-2" }, { "2-1", "2-2" } , { "1-1", "1-2" }, { "2-1", "2-2" }, { "1-1", "1-2" }, { "2-1", "2-2" } , { "1-1", "1-2" }, { "2-1", "2-2" } , { "1-1", "1-2" }, { "2-1", "2-2" }  };
	    String[] columnNames = { "col1", "col2" };
		table = new JTable(cellData, columnNames);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		table.setBounds(37, 52, 226, 192);
		frame.getContentPane().add(table); 
		
		btnNewButton = new JButton("Prija\u0161nja stanja");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(37, 255, 229, 32);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Prika\u017Ei trenutna zadu\u017Eenja voza\u010Da");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Skladiste_zaduzenja_vozaca np= new Skladiste_zaduzenja_vozaca ();
				np.novi_prozor();
			}
		});
		btnNewButton_1.setBounds(273, 67, 197, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Prika\u017Ei trenutna zadu\u017Eenja radnika");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Skladiste_zaduzenja_radnika np= new Skladiste_zaduzenja_radnika ();
				np.novi_prozor();
			}
		});
		btnNewButton_2.setBounds(273, 115, 197, 34);
		frame.getContentPane().add(btnNewButton_2);
		
		btnGeneriiNaredbe = new JButton("Generi\u0161i zadu\u017Eenja");
		btnGeneriiNaredbe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Skladiste_zaduzenja np= new Skladiste_zaduzenja ();
				np.novi_prozor();
			}
		});
		btnGeneriiNaredbe.setBounds(273, 163, 197, 34);
		frame.getContentPane().add(btnGeneriiNaredbe);
		
		btnPrikaiRute = new JButton("Uredi rute");
		btnPrikaiRute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Skladiste_rute np= new Skladiste_rute ();
				np.novi_prozor();
			}
		});
		btnPrikaiRute.setBounds(273, 210, 197, 34);
		frame.getContentPane().add(btnPrikaiRute);
		
	}
}
