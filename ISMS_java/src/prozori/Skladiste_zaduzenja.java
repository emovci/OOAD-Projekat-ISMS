package prozori;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

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
		frame.setBounds(100, 100, 1315, 499);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblZaduenjaZaVozae = DefaultComponentFactory.getInstance().createLabel("Voza\u010Di");
		lblZaduenjaZaVozae.setBounds(10, 24, 210, 14);
		frame.getContentPane().add(lblZaduenjaZaVozae);
		
		JLabel lblZaduenjaZaRadnike = DefaultComponentFactory.getInstance().createLabel("Radnici");
		lblZaduenjaZaRadnike.setBounds(655, 24, 276, 14);
		frame.getContentPane().add(lblZaduenjaZaRadnike);
		
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

		scrollPane.setBounds(655, 49, 635, 402);
		frame.getContentPane().add(scrollPane);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

		

		table_1 = new JTable(rowData, columnNames)
		{
	        private static final long serialVersionUID = 1L;

	        public boolean isCellEditable(int row, int column) 
	        {                
	                return false;               
	        };
	    };
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(arg0.getClickCount()==2)
				{
					int row = table_1.getSelectedRow();
			        int col = table_1.getSelectedColumn();
			        JOptionPane.showMessageDialog(null, "Broj reda: "+(row+1)+", broj kolone: "+(col+1));
					
				}
			}
		});

		JScrollPane scrollPane2 = new JScrollPane(table_1);
		scrollPane2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});

		scrollPane2.setBounds(10, 49, 635, 402);
		frame.getContentPane().add(scrollPane2);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

	}
}
