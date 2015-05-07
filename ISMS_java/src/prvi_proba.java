import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.List;
import java.awt.Button;
import javax.swing.JSeparator;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Checkbox;
import java.awt.Canvas;
import java.awt.Choice;
import java.awt.TextField;
import java.awt.Label;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;


public class prvi_proba {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prvi_proba window = new prvi_proba();
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
	public prvi_proba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 497, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(0, 0, 31, 464);
		separator_5.setOrientation(SwingConstants.VERTICAL);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(31, 0, 30, 464);
		frame.getContentPane().add(separator_6);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(61, 210, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(150, 210, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(239, 0, 30, 464);
		frame.getContentPane().add(separator);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(269, 210, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(358, 0, 30, 464);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(388, 0, 30, 464);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(418, 0, 31, 464);
		separator_2.setOrientation(SwingConstants.VERTICAL);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(449, 0, 30, 464);
		frame.getContentPane().add(separator_1);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(41, 161, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(150, 119, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		Checkbox checkbox = new Checkbox("New check box");
		checkbox.setBounds(67, 252, 95, 22);
		frame.getContentPane().add(checkbox);
		
		List list = new List();
		list.setBounds(67, 288, 65, 45);
		frame.getContentPane().add(list);
		
		Canvas canvas = new Canvas();
		canvas.setBounds(239, 23, 65, 60);
		frame.getContentPane().add(canvas);
		
		Choice choice = new Choice();
		choice.setBounds(205, 281, 120, 23);
		frame.getContentPane().add(choice);
		
		TextField textField = new TextField();
		textField.setBounds(37, 350, 106, 23);
		frame.getContentPane().add(textField);
		
		Label label = new Label("New label");
		label.setBounds(37, 379, 95, 23);
		frame.getContentPane().add(label);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(0, 421, 175, 14);
		frame.getContentPane().add(progressBar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(239, 350, 89, 60);
		frame.getContentPane().add(textArea);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(287, 106, 121, 23);
		frame.getContentPane().add(tglbtnNewToggleButton);
	}
}
