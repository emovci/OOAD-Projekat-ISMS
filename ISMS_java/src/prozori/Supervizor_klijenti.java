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


public class Supervizor_klijenti {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void novi_prozor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supervizor_klijenti window = new Supervizor_klijenti();
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
	public Supervizor_klijenti() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 487, 344);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Vector< Vector <String>> rowData = new Vector<Vector<String>>();
		for (int j=0; j<Glavni_prozor.klijenti.get_klijenti().size(); j++)
		{
				
				Vector<String> temprow = new Vector<String>();
				temprow.addElement(Glavni_prozor.klijenti.get_klijenti().elementAt(j).get_naziv_firme());
				temprow.addElement(Glavni_prozor.klijenti.get_klijenti().elementAt(j).get_roba_na_raspolaganju().firstElement().get_vrsta_robe().get_ime());
				
				rowData.add(temprow);
			
				
		}
	      //rowData.add(temprow);
	      Vector<String> columnNames = new Vector<String>();
	      columnNames.addElement("Naziv firme");
	      columnNames.addElement("Roba");
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

		scrollPane.setBounds(10, 33, 449, 212);
		frame.getContentPane().add(scrollPane);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		
		JButton btnDodajNovogKlijenta = new JButton("Dodaj novog klijenta");
		btnDodajNovogKlijenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Supervizor_klijenti_dodaj np= new Supervizor_klijenti_dodaj ();
				np.novi_prozor();
			}
		});
		btnDodajNovogKlijenta.setBounds(10, 256, 204, 39);
		frame.getContentPane().add(btnDodajNovogKlijenta);
		
		JButton btnIzbaciKlijenta = new JButton("Izbaci klijenta");
		btnIzbaciKlijenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIzbaciKlijenta.setBounds(255, 256, 204, 39);
		frame.getContentPane().add(btnIzbaciKlijenta);
		
		JLabel lblListaKlijenata = DefaultComponentFactory.getInstance().createLabel("Lista klijenata");
		lblListaKlijenata.setBounds(10, 11, 92, 14);
		frame.getContentPane().add(lblListaKlijenata);
	}
}
