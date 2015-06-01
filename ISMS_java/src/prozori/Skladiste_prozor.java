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


public class Skladiste_prozor {

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
	public static void novi_prozor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Skladiste_prozor window = new Skladiste_prozor();
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
	public Skladiste_prozor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 784, 474);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTrenutnoStanjeU = DefaultComponentFactory.getInstance().createLabel("Trenutno stanje u skladi\u0161tu (sedmi\u010Dni podaci)");
		lblTrenutnoStanjeU.setBounds(37, 27, 408, 14);
		frame.getContentPane().add(lblTrenutnoStanjeU);
		
	    //testni prozor
		Vector< Vector <String>> rowData = new Vector<Vector<String>>();
		for (int j=0; j<Glavni_prozor.radnici.get_radnike().size(); j++)
		{		
				Vector<String> temprow = new Vector<String>();
				if(Glavni_prozor.radnici.get_radnike().elementAt(j).get_vrsta_radnika()==1){
				if(Glavni_prozor.radnici.get_radnike().elementAt(j).get_trenutna_naredba_r().size()>0){
				for(int i=0;i<Glavni_prozor.radnici.get_radnike().elementAt(j).get_trenutna_naredba_r().size();i++){
					if(Glavni_prozor.radnici.get_radnike().elementAt(j).get_trenutna_naredba_r().elementAt(i).get_naredba_izvrsena()==true){
				temprow.addElement(Glavni_prozor.radnici.get_radnike().elementAt(j).get_trenutna_naredba_r().elementAt(i).get_roba_za_premjestanje().firstElement().get_vrsta_robe().get_ime());
				temprow.addElement(Double.toString(Glavni_prozor.radnici.get_radnike().elementAt(j).get_trenutna_naredba_r().elementAt(i).get_roba_za_premjestanje().firstElement().get_kolicina()));
				temprow.addElement(Double.toString(Glavni_prozor.radnici.get_radnike().elementAt(j).get_trenutna_naredba_r().elementAt(i).cijena_naredbe()));
				temprow.addElement(Glavni_prozor.radnici.get_radnike().elementAt(j).get_id()+"");

				rowData.add(temprow);
				}}
				}}
		}
	      //rowData.add(temprow);
	      Vector<String> columnNames = new Vector<String>();
	      columnNames.addElement("Roba");
	      columnNames.addElement("Kolicina");
	      columnNames.addElement("Cijena");
	      columnNames.addElement("ID Radnika");
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
