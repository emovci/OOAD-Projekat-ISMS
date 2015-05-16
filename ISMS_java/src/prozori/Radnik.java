package prozori;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Radnik {

	private JFrame frame;
	private JTable table;
	final static String LOOKANDFEEL="WINDOWS";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		frame.setBounds(100, 100, 269, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(28, 120, 200, 123);
		frame.getContentPane().add(table);

		JToggleButton tglbtnIzbaciRobuZa = new JToggleButton("Izbaci robu za premjestiti");
		tglbtnIzbaciRobuZa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Pokušaj poruke");
				Radnik_izbaci_robu np = new Radnik_izbaci_robu ();
				np.novi_prozor();
			}
		});
		tglbtnIzbaciRobuZa.setBounds(28, 252, 200, 50);
		frame.getContentPane().add(tglbtnIzbaciRobuZa);
		
		JToggleButton toggleButton_1 = new JToggleButton("Prihvatam zadu\u017Eenje");
		toggleButton_1.setBounds(28, 37, 200, 50);
		frame.getContentPane().add(toggleButton_1);
		
		JCheckBox checkBox = new JCheckBox("Status zadu\u017Eenja");
		checkBox.setSelected(true);
		checkBox.setEnabled(false);
		checkBox.setBounds(75, 7, 133, 23);
		frame.getContentPane().add(checkBox);
		
		JLabel lblRobaZaPremjestiti = DefaultComponentFactory.getInstance().createLabel("Roba za premjestiti");
		lblRobaZaPremjestiti.setBounds(87, 95, 181, 14);
		frame.getContentPane().add(lblRobaZaPremjestiti);
		
		JToggleButton toggleButton_2 = new JToggleButton("Zavr\u0161eno zadu\u017Eenje");
		toggleButton_2.setBounds(28, 308, 200, 50);
		frame.getContentPane().add(toggleButton_2);
	}
}
