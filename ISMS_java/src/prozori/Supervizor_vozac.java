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

		
		for (int j=0; j<Glavni_prozor.radnici.get_radnike().size(); j++)
		{
				if(Glavni_prozor.radnici.get_radnike().elementAt(j).get_vrsta_radnika()==0)
				{
					Vector<String> temprow = new Vector<String>();
					temprow.addElement(Glavni_prozor.radnici.get_radnike().elementAt(j).get_ime());
					temprow.addElement(Glavni_prozor.radnici.get_radnike().elementAt(j).get_prezime());
					temprow.addElement(Glavni_prozor.radnici.get_radnike().elementAt(j).get_id()+"");
					if(Glavni_prozor.radnici.get_radnike().elementAt(j).get_status())
							temprow.addElement("DA");
					else
							temprow.addElement("NE");
					rowData.add(temprow);
				}
				//JOptionPane.showMessageDialog(null, "Broj:"+Glavni_prozor.radnici.get_radnike().elementAt(j).get_ime());
				
		}
	      //rowData.add(temprow);
	      Vector<String> columnNames = new Vector<String>();
	      columnNames.addElement("Ime");
	      columnNames.addElement("Ime Prezime");
	      columnNames.addElement("ID");
	      columnNames.addElement("Sposoban za rad");
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
		btnOtpustiVozaa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
					Object[] options = { "DA", "NE" };
					int odgovor=JOptionPane.showOptionDialog(null, "Da li ste sigurni da �elite da otpustite radnika", "Potvrda",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,	null, options, options[0]);
				
					//int odgovor = JOptionPane.showConfirmDialog(null, "Da li ste sigurni da �elite da otpustite radnika?", "Potvrda",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					if (odgovor == 1) 
							return;
						
					Object temp=table.getValueAt(table.getSelectedRow(), 2) ;
					String temp1=(String)temp;
					int id = Integer.parseInt(temp1);
					for(int i=0; i<Glavni_prozor.radnici.get_radnike().size(); i++)
					{
							if(id==Glavni_prozor.radnici.get_radnike().elementAt(i).get_id())
							{
									Glavni_prozor.radnici.ukloni_radnika(i);
									JOptionPane.showMessageDialog(null, "Radnik otpu�ten!");
									break;
							}
					}
			}
		});
		btnOtpustiVozaa.setBounds(311, 326, 200, 50);
		frame.getContentPane().add(btnOtpustiVozaa);
		
		JButton btnIzmjeniVozaa = new JButton("Izmjeni voza\u010Da");
		btnIzmjeniVozaa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Object temp = table.getValueAt(table.getSelectedRow(), 2);
				String temp1=(String)temp;
				int id = Integer.parseInt(temp1);
				prozori.Supervizor_izmjeni_vozac.novi_prozor(id);

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
