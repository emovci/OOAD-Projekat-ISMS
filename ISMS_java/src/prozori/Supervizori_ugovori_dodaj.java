package prozori;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;


public class Supervizori_ugovori_dodaj {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void novi_prozor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supervizori_ugovori_dodaj window = new Supervizori_ugovori_dodaj();
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
	public Supervizori_ugovori_dodaj() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 453, 424);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIzaberiKlijenta = DefaultComponentFactory.getInstance().createLabel("Izaberi klijenta");
		lblIzaberiKlijenta.setBounds(10, 11, 92, 14);
		frame.getContentPane().add(lblIzaberiKlijenta);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 32, 137, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblDatumPotpisivanja = DefaultComponentFactory.getInstance().createLabel("Datum potpisivanja");
		lblDatumPotpisivanja.setBounds(10, 63, 92, 14);
		frame.getContentPane().add(lblDatumPotpisivanja);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 83, 28, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(58, 83, 28, 20);
		frame.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(104, 83, 47, 20);
		frame.getContentPane().add(comboBox_3);
		
		JLabel lblDatumIsteka = DefaultComponentFactory.getInstance().createLabel("Datum isteka");
		lblDatumIsteka.setBounds(10, 114, 92, 14);
		frame.getContentPane().add(lblDatumIsteka);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(10, 136, 28, 20);
		frame.getContentPane().add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(58, 136, 28, 20);
		frame.getContentPane().add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(104, 136, 47, 20);
		frame.getContentPane().add(comboBox_6);
		
		JLabel lblIzaberiRobu = DefaultComponentFactory.getInstance().createLabel("Izaberi robu");
		lblIzaberiRobu.setBounds(10, 167, 92, 14);
		frame.getContentPane().add(lblIzaberiRobu);
		
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

		scrollPane.setBounds(10, 192, 420, 135);
		frame.getContentPane().add(scrollPane);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

		
		JButton btnNewButton = new JButton("Dodaj");
		btnNewButton.setBounds(10, 336, 146, 41);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.setBounds(284, 338, 146, 41);
		frame.getContentPane().add(btnOdustani);
	}
}
