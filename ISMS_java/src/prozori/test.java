package prozori;

import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

import javax.swing.JInternalFrame;
import javax.swing.JTable;

public class test extends JInternalFrame {
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test() {
		getContentPane().setLayout(null);
		
		table_1 = new JTable();
		table_1.setBounds(89, 44, 335, 160);
		getContentPane().add(table_1);


	}
}
