package prozori;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

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
		for (int j=0; j<Glavni_prozor.radnici.get_radnike().size(); j++)
		{
				if(Glavni_prozor.radnici.get_radnike().elementAt(j).get_vrsta_radnika()==1){
				Vector<String> temprow = new Vector<String>();
				temprow.addElement(Glavni_prozor.radnici.get_radnike().elementAt(j).get_ime());
				temprow.addElement(Glavni_prozor.radnici.get_radnike().elementAt(j).get_prezime());
				temprow.addElement(Glavni_prozor.radnici.get_radnike().elementAt(j).get_id()+"");
				if(Glavni_prozor.radnici.get_radnike().elementAt(j).get_status()==true)
					temprow.addElement("DA");
				else
					temprow.addElement("NE");
				rowData.add(temprow);
				}
				
		}
	      //rowData.add(temprow);
	      Vector<String> columnNames = new Vector<String>();
	      columnNames.addElement("Ime");
	      columnNames.addElement("Prezime");
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
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
					Object[] options = { "DA", "NE" };
					int odgovor=JOptionPane.showOptionDialog(null, "Da li ste sigurni da želite da otpustite radnika", "Potvrda",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,	null, options, options[0]);
				
					//int odgovor = JOptionPane.showConfirmDialog(null, "Da li ste sigurni da želite da otpustite radnika?", "Potvrda",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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
									JOptionPane.showMessageDialog(null, "Radnik otpušten!");
									break;
							}
					}
			}
		});
		btnNewButton_1.setBounds(309, 398, 200, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnIzmjeniRadnika = new JButton("Izmjeni radnika");
		btnIzmjeniRadnika.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//Supervizor_izmjeni_radnika np= new Supervizor_izmjeni_radnika ();
				Object temp = table.getValueAt(table.getSelectedRow(), 2);
				String temp1=(String)temp;
				int id = Integer.parseInt(temp1);
				prozori.Supervizor_izmjeni_radnika.novi_prozor(id);
			}
		});
		btnIzmjeniRadnika.setBounds(10, 398, 200, 50);
		frame.getContentPane().add(btnIzmjeniRadnika);
	}
}
