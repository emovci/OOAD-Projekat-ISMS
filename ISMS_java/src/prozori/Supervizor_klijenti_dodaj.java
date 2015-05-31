package prozori;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;


public class Supervizor_klijenti_dodaj {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
	private JButton btnDodajKlijenta;
	private JButton btnOdustani;

	/**
	 * Launch the application.
	 */
	public static void novi_prozor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supervizor_klijenti_dodaj window = new Supervizor_klijenti_dodaj();
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
	public Supervizor_klijenti_dodaj() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 508, 335);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblImeKlijenta = DefaultComponentFactory.getInstance().createLabel("Ime klijenta");
		lblImeKlijenta.setBounds(10, 11, 92, 14);
		frame.getContentPane().add(lblImeKlijenta);
		
		textField = new JTextField();
		textField.setBounds(10, 33, 125, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblRobaNaRaspolaganju = DefaultComponentFactory.getInstance().createLabel("Roba na raspolaganju");
		lblRobaNaRaspolaganju.setBounds(10, 61, 125, 14);
		frame.getContentPane().add(lblRobaNaRaspolaganju);
		
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

		scrollPane.setBounds(10, 86, 471, 145);
		frame.getContentPane().add(scrollPane);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		

		
		btnDodajKlijenta = new JButton("Dodaj klijenta");
		btnDodajKlijenta.setBounds(10, 242, 157, 43);
		frame.getContentPane().add(btnDodajKlijenta);
		
		btnOdustani = new JButton("Odustani");
		btnOdustani.setBounds(324, 242, 157, 43);
		frame.getContentPane().add(btnOdustani);
	}
}
