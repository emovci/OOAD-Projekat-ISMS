package prozori;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
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
import java.awt.Font;


public class Skladiste {

	private JFrame frame;
	private JTable table;
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
		frame.setBounds(100, 100, 784, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTrenutnoStanjeU = DefaultComponentFactory.getInstance().createLabel("Trenutno stanje u skladu\u0161tu (sedmi\u010Dni podaci)");
		lblTrenutnoStanjeU.setBounds(37, 27, 408, 14);
		frame.getContentPane().add(lblTrenutnoStanjeU);
		
	    Object[][] cellData = { { "1-1", "1-2" }, { "2-1", "2-2" } , { "1-1", "1-2" }, { "2-1", "2-2" } , { "1-1", "1-2" }, { "2-1", "2-2" } , { "1-1", "1-2" }, { "2-1", "2-2" }, { "1-1", "1-2" }, { "2-1", "2-2" } , { "1-1", "1-2" }, { "2-1", "2-2" } , { "1-1", "1-2" }, { "2-1", "2-2" }  };
	    //String[] columnNames = { "a", "b","c","d" };
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

		scrollPane.setBounds(10, 52, 526, 318);
		frame.getContentPane().add(scrollPane);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		
		btnNewButton = new JButton("Prija\u0161nja stanja");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(37, 381, 229, 32);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Prika\u017Ei trenutna zadu\u017Eenja voza\u010Da");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Skladiste_zaduzenja_vozaca np= new Skladiste_zaduzenja_vozaca ();
				np.novi_prozor();
			}
		});
		btnNewButton_1.setBounds(540, 112, 218, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Prika\u017Ei trenutna zadu\u017Eenja radnika");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Skladiste_zaduzenja_radnika np= new Skladiste_zaduzenja_radnika ();
				np.novi_prozor();
			}
		});
		btnNewButton_2.setBounds(540, 160, 218, 34);
		frame.getContentPane().add(btnNewButton_2);
		
		btnGeneriiNaredbe = new JButton("Generi\u0161i zadu\u017Eenja");
		btnGeneriiNaredbe.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnGeneriiNaredbe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Skladiste_zaduzenja np= new Skladiste_zaduzenja ();
				np.novi_prozor();
			}
		});
		btnGeneriiNaredbe.setBounds(540, 208, 218, 34);
		frame.getContentPane().add(btnGeneriiNaredbe);
		
		btnPrikaiRute = new JButton("Uredi rute");
		btnPrikaiRute.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnPrikaiRute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Skladiste_rute np= new Skladiste_rute ();
				np.novi_prozor();
			}
		});
		btnPrikaiRute.setBounds(540, 255, 218, 34);
		frame.getContentPane().add(btnPrikaiRute);
		
	}
}
