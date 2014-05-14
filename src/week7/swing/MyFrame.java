package week7.swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	private JTextField textField;
	private JButton jButton;
	private JTextArea textArea;
	
	public MyFrame(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		init();
		
		setVisible(true);
	}
	
	private void init(){
		jButton = new JButton("Ok!!!");
		MyListener l = new MyListener();
		jButton.addActionListener(l);
		
		textField = new JTextField();
		
		GridLayout gl = new GridLayout(1, 2);
		JPanel jPanel = new JPanel(gl);
		
		jPanel.add(textField, BorderLayout.SOUTH);
		jPanel.add(jButton, BorderLayout.NORTH);
		
		textArea = new JTextArea();
		
		getContentPane().add(textArea, BorderLayout.CENTER);
		getContentPane().add(jPanel, BorderLayout.SOUTH);
		
	}
	
	
	private class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String res = 
					MyReader.readAll(textField.getText().trim());
			textArea.setText(res);
		}
		
	}
	
	
}
