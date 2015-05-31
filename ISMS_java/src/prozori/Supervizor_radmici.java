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


public class Supervizor_radmici {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void novi_prozor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supervizor_radmici window = new Supervizor_radmici();
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
	public Supervizor_radmici() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 535, 511);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSpisakRadnika = DefaultComponentFactory.getInstance().createLabel("Spisak radnika");
		lblSpisakRadnika.setBounds(10, 11, 92, 14);
		frame.getContentPane().add(lblSpisakRadnika);
		
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

		scrollPane.setBounds(10, 36, 499, 290);
		frame.getContentPane().add(scrollPane);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		

		
		JButton btnNewButton = new JButton("Zaposli radnika");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Supervizor_zaposli_radnika np= new Supervizor_zaposli_radnika ();
				np.novi_prozor();
			}
		});
		btnNewButton.setBounds(160, 337, 200, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Otpusti radnika");
		btnNewButton_1.setBounds(309, 398, 200, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnIzmjeniRadnika = new JButton("Izmjeni radnika");
		btnIzmjeniRadnika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Supervizor_izmjeni_radnika np= new Supervizor_izmjeni_radnika ();
				np.novi_prozor();
			}
		});
		btnIzmjeniRadnika.setBounds(10, 398, 200, 50);
		frame.getContentPane().add(btnIzmjeniRadnika);
	}
}
