package prozori;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;


public class Supervizor_vozac {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void novi_prozor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supervizor_vozac window = new Supervizor_vozac();
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
	public Supervizor_vozac() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 537, 497);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Vector< Vector <String>> rowData = new Vector<Vector<String>>();
		Vector<String> temprow = new Vector<String>();
		for (int i = 0; i < 4; i++) 
	    {
	    		temprow.addElement("123456789123456789");
	    }	
	      for (int j = 0; j < 20; j++)
	      rowData.add(temprow);
	      //rowData.add(temprow);
	      Vector<String> columnNames = new Vector<String>();
	      columnNames.addElement("Ime 1");
	      columnNames.addElement("Ime 2");
	      columnNames.addElement("Ime 3");
	      columnNames.addElement("Ime 4");
		table = new JTable(rowData, columnNames)
		{
	        private static final long serialVersionUID = 1L;

	        public boolean isCellEditable(int row, int column) 
	        {                
	                return false;               
	        };
	    };
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(arg0.getClickCount()==2)
				{
					int row = table.getSelectedRow();
			        int col = table.getSelectedColumn();
			        JOptionPane.showMessageDialog(null, "Broj reda: "+(row+1)+", broj kolone: "+(col+1));
					
				}
			}
		});
		//table.setBounds(10, 52, 253, 237);
		//frame.getContentPane().add(table); 
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});

		scrollPane.setBounds(10, 39, 501, 215);
		frame.getContentPane().add(scrollPane);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		

		
		JButton btnZaposliVozaa = new JButton("Zaposli voza\u010Da");
		btnZaposliVozaa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Supervizor_zaposli_vozac np= new Supervizor_zaposli_vozac ();
				np.novi_prozor();
			}
		});
		btnZaposliVozaa.setBounds(160, 265, 200, 50);
		frame.getContentPane().add(btnZaposliVozaa);
		
		JButton btnOtpustiVozaa = new JButton("Otpusti voza\u010Da");
		btnOtpustiVozaa.setBounds(311, 326, 200, 50);
		frame.getContentPane().add(btnOtpustiVozaa);
		
		JButton btnIzmjeniVozaa = new JButton("Izmjeni voza\u010Da");
		btnIzmjeniVozaa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Supervizor_izmjeni_vozac np= new Supervizor_izmjeni_vozac ();
				np.novi_prozor();
			}
		});
		btnIzmjeniVozaa.setBounds(311, 387, 200, 50);
		frame.getContentPane().add(btnIzmjeniVozaa);
		
		JLabel lblSpisakVozaca = DefaultComponentFactory.getInstance().createLabel("Spisak voza\u010Da");
		lblSpisakVozaca.setBounds(24, 14, 92, 14);
		frame.getContentPane().add(lblSpisakVozaca);
		
		JButton btnDodajKamion = new JButton("Dodaj kamion");
		btnDodajKamion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDodajKamion.setBounds(10, 326, 200, 50);
		frame.getContentPane().add(btnDodajKamion);
		
		JButton btnIzbaciKamion = new JButton("Izbaci kamion");
		btnIzbaciKamion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIzbaciKamion.setBounds(10, 387, 200, 50);
		frame.getContentPane().add(btnIzbaciKamion);
	}
}
