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

import klase.Roba;


public class Radnik_prozor {

	private JFrame frame;
	private JTable table;
	final static String LOOKANDFEEL="WINDOWS";

	/**
	 * Launch the application.
	 */
	public static void novi_prozor(int id) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Radnik_prozor window = new Radnik_prozor(id);
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
	public Radnik_prozor(int id) 
	{
		initialize(id);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int id) 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 721, 500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
			
		
		Vector< Vector <String>> rowData = new Vector<Vector<String>>();
		
		for (int i = 0; i < Glavni_prozor.radnici.get_radnike().size(); i++) 
	    {
				
	    		if(id==Glavni_prozor.radnici.get_radnike().get(i).get_id())
	    		{
	    			
	    			if(Glavni_prozor.radnici.get_radnike().get(i).get_trenutna_naredba_r()==null)
	    					break;
	    					
	    			//JOptionPane.showMessageDialog(null, "došao dovdje"+Glavni_prozor.radnici.get_radnike().get(i).get_trenutna_naredba_r().size());
	    				for(int j=0; j<Glavni_prozor.radnici.get_radnike().get(i).get_trenutna_naredba_r().size(); j++)
	    				{
	    					
	    						for(int z=0; z<Glavni_prozor.radnici.get_radnike().get(i).get_trenutna_naredba_r().get(j).get_roba_za_premjestanje().size(); z++)
	    								{
	    										Vector<String> temprow = new Vector<String>();
	    										
	    										Roba temp=Glavni_prozor.radnici.get_radnike().get(i).get_trenutna_naredba_r().get(j).get_roba_za_premjestanje().get(z);
	    										
	    										temprow.addElement(temp.get_vrsta_robe().get_ime());
	    										
	    										temprow.addElement(""+temp.get_kolicina());
	    										temprow.addElement(Glavni_prozor.radnici.get_radnike().get(i).get_trenutna_naredba_r().get(j).get_vrijeme_za_premjestanje().daj_string());
	    										if(Glavni_prozor.radnici.get_radnike().get(i).get_trenutna_naredba_r().get(j).get_naredba_prihvacena())
	    											temprow.addElement("DA");
	    										else
	    											temprow.addElement("NE");
	    										if(Glavni_prozor.radnici.get_radnike().get(i).get_trenutna_naredba_r().get(j).get_naredba_izvrsena())
	    											temprow.addElement("DA");
	    										else
	    											temprow.addElement("NE");
	    										rowData.add(temprow);
	    										
	    								}
	    				}
	    				
	    	    		break;
	    		}
	    		
	    		
	    }	

	      Vector<String> columnNames = new Vector<String>();
	      columnNames.addElement("Vrsta robe");
	      columnNames.addElement("Kolièina (t)");
	      columnNames.addElement("Do kada premjestiti");
	      columnNames.addElement("Prihvaæena naredba");
	      columnNames.addElement("Izvršena naredba");
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

		scrollPane.setBounds(10, 120, 685, 263);
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
		toggleButton_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) 
			{
				Integer red_br=null;
				for (int i = 0; i < Glavni_prozor.radnici.get_radnike().size(); i++) 	
			    		if(id==Glavni_prozor.radnici.get_radnike().get(i).get_id())
			    			red_br=i;
				if(Glavni_prozor.radnici.get_radnike().get(red_br).get_trenutna_naredba_r()==null)
					return;
					
			//JOptionPane.showMessageDialog(null, "došao dovdje"+Glavni_prozor.radnici.get_radnike().get(i).get_trenutna_naredba_r().size());
				for(int j=0; j<Glavni_prozor.radnici.get_radnike().get(red_br).get_trenutna_naredba_r().size(); j++)
						Glavni_prozor.radnici.get_radnike().get(red_br).get_trenutna_naredba_r().get(j).set_naredba_prihvacena(true);

				
			}
		});
		
		JLabel lblRobaZaPremjestiti = DefaultComponentFactory.getInstance().createLabel("Roba za premjestiti");
		lblRobaZaPremjestiti.setBounds(10, 98, 181, 14);
		frame.getContentPane().add(lblRobaZaPremjestiti);
		
		JToggleButton toggleButton_2 = new JToggleButton("Zavr\u0161eno zadu\u017Eenje");
		toggleButton_2.setBounds(495, 394, 200, 50);
		frame.getContentPane().add(toggleButton_2);
		toggleButton_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e1) 
			{
				Integer red_br=null;
				for (int i = 0; i < Glavni_prozor.radnici.get_radnike().size(); i++) 	
			    		if(id==Glavni_prozor.radnici.get_radnike().get(i).get_id())
			    			red_br=i;
				if(Glavni_prozor.radnici.get_radnike().get(red_br).get_trenutna_naredba_r()==null)
					return;
					
			//JOptionPane.showMessageDialog(null, "došao dovdje"+Glavni_prozor.radnici.get_radnike().get(i).get_trenutna_naredba_r().size());
				for(int j=0; j<Glavni_prozor.radnici.get_radnike().get(red_br).get_trenutna_naredba_r().size(); j++)
						Glavni_prozor.radnici.get_radnike().get(red_br).get_trenutna_naredba_r().get(j).set_naredba_izvrsena(true);

				
			}
		});
	}
}

