package prozori;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;


public class Radnik {

	private JFrame frame;
	private JTable table;
	final static String LOOKANDFEEL="WINDOWS";

	/**
	 * Launch the application.
	 */
	public static void novi_prozor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Radnik window = new Radnik();
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
	public Radnik() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 447, 500);
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

		scrollPane.setBounds(10, 120, 410, 263);
		frame.getContentPane().add(scrollPane);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);


		JToggleButton tglbtnIzbaciRobuZa = new JToggleButton("Izbaci robu za premjestiti");
		tglbtnIzbaciRobuZa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Pokušaj poruke");
				Radnik_izbaci_robu np = new Radnik_izbaci_robu ();
				np.novi_prozor();
			}
		});
		tglbtnIzbaciRobuZa.setBounds(10, 394, 200, 50);
		frame.getContentPane().add(tglbtnIzbaciRobuZa);
		
		JToggleButton toggleButton_1 = new JToggleButton("Prihvatam zadu\u017Eenje");
		toggleButton_1.setBounds(10, 37, 200, 50);
		frame.getContentPane().add(toggleButton_1);
		
		JCheckBox checkBox = new JCheckBox("Status zadu\u017Eenja");
		checkBox.setSelected(true);
		checkBox.setEnabled(false);
		checkBox.setBounds(10, 7, 133, 23);
		frame.getContentPane().add(checkBox);
		
		JLabel lblRobaZaPremjestiti = DefaultComponentFactory.getInstance().createLabel("Roba za premjestiti");
		lblRobaZaPremjestiti.setBounds(10, 98, 181, 14);
		frame.getContentPane().add(lblRobaZaPremjestiti);
		
		JToggleButton toggleButton_2 = new JToggleButton("Zavr\u0161eno zadu\u017Eenje");
		toggleButton_2.setBounds(220, 394, 200, 50);
		frame.getContentPane().add(toggleButton_2);
	}
}
