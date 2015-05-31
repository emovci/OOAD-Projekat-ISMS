package prozori;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JTable;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;


public class Supervizor_ugovori {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void novi_prozor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supervizor_ugovori window = new Supervizor_ugovori();
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
	public Supervizor_ugovori() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 504, 378);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblListaUgovora = DefaultComponentFactory.getInstance().createLabel("Lista ugovora");
		lblListaUgovora.setBounds(10, 11, 92, 14);
		frame.getContentPane().add(lblListaUgovora);
		
		Vector< Vector <String>> rowData = new Vector<Vector<String>>();
		for (int j=0; j<Glavni_prozor.ugovori.get_ugovori().size(); j++)
		{
				
				Vector<String> temprow = new Vector<String>();
				temprow.addElement(Glavni_prozor.ugovori.get_ugovori().elementAt(j).get_klijent().get_naziv_firme());
				
				if(Glavni_prozor.ugovori.get_ugovori().elementAt(j).get_kupovina()==true)
					temprow.addElement("Kupovina");
				else
					temprow.addElement("Prodaja");
				if(Glavni_prozor.ugovori.get_ugovori().elementAt(j).get_valjanost()==true)
					temprow.addElement("Valjan");
				else
					temprow.addElement("Istekao");
				temprow.addElement(Glavni_prozor.ugovori.get_ugovori().elementAt(j).get_roba().firstElement().get_vrsta_robe().get_ime());
				rowData.add(temprow);
		}
			
	      //rowData.add(temprow);
	      Vector<String> columnNames = new Vector<String>();
	      columnNames.addElement("Klijent");
	      columnNames.addElement("Kupovina/Prodaja");
	      columnNames.addElement("Valjanost");
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

		scrollPane.setBounds(10, 29, 468, 250);
		frame.getContentPane().add(scrollPane);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		
				
		JButton btnNewButton = new JButton("Dodaj novi ugovor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Supervizori_ugovori_dodaj np= new Supervizori_ugovori_dodaj ();
				np.novi_prozor();
			}
		});
		btnNewButton.setBounds(274, 290, 204, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnRaskiniUgovor = new JButton("Raskini ugovor");
		btnRaskiniUgovor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Object[] options = { "DA", "NE" };
				int odgovor=JOptionPane.showOptionDialog(null, "Da li ste sigurni da želite da raskinete ugovor?", "Potvrda",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,	null, options, options[0]);
			
				//int odgovor = JOptionPane.showConfirmDialog(null, "Da li ste sigurni da želite da otpustite radnika?", "Potvrda",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (odgovor == 1) 
						return;
					
				Glavni_prozor.ugovori.ukloni_ugovor(table.getSelectedRow());
				JOptionPane.showMessageDialog(null, "Ugovor raskinut!");
									
				
		}
		});
		btnRaskiniUgovor.setBounds(10, 290, 204, 39);
		frame.getContentPane().add(btnRaskiniUgovor);
	}
}
