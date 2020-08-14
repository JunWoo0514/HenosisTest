package AASTestCase.MavenTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductModuleTestStarter extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductModuleTestStarter frame = new ProductModuleTestStarter();
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
	public ProductModuleTestStarter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 364);
		contentPane =  new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 514, 301);
		contentPane.add(tabbedPane);
		
		JPanel panel1 = new JPanel();
		tabbedPane.addTab("2.1 PT Settings", null, panel1, null);
		panel1.setLayout(null);
		
		JPanel panel2 = new JPanel();
		tabbedPane.addTab("2.2 Product Settings", null, panel2, null);
		panel2.setLayout(null);
		
		JPanel panel3 = new JPanel();
		tabbedPane.addTab("2.3 Product Skin Setting", null, panel3, null);
		panel3.setLayout(null);
		
		JPanel panel4 = new JPanel();
		tabbedPane.addTab("2.4 ExtraPT", null, panel4, null);
		panel4.setLayout(null);
		
	
		
		JLabel username_lbl = new JLabel("User Name");
		username_lbl.setBounds(65, 54, 86, 25);
		panel4.add(username_lbl);
		
		JLabel pt_lbl = new JLabel("PT Value");
		pt_lbl.setBounds(65, 91, 86, 25);
		panel4.add(pt_lbl);
		
		textField = new JTextField();
		textField.setBounds(204, 54, 136, 25);
		panel4.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(204, 94, 136, 25);
		panel4.add(textField_1);
		
		JButton ExtraPT_btn = new JButton("Run Test");
		ExtraPT_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ExtraPT_btn.setBounds(204, 175, 136, 25);
		panel4.add(ExtraPT_btn);
	}
}
