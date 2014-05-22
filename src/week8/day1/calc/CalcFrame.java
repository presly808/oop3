package week8.day1.calc;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcFrame extends JFrame {
	
	private JButton jButton1 = new JButton("1");
	private JButton jButton2 = new JButton("2");
	private JButton jButton3 = new JButton("3");
	private JButton jButton4 = new JButton("4");
	private JButton jButton5 = new JButton("5");
	private JButton jButton6 = new JButton("6");
	private JButton jButton7 = new JButton("7");
	private JButton jButton8 = new JButton("8");
	private JButton jButton9 = new JButton("9");
	
	private JTextField textField = new JTextField();
	
	private GridLayout gridLayout = new GridLayout(3,3);
	
	private JPanel jPanel = new JPanel();
	
	
	public CalcFrame(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,600);
		init();
		setVisible(true);
	}


	private void init() {
		jPanel.setLayout(gridLayout);
		
		ButtonActionListener listener = new ButtonActionListener();
		
		jButton1.addActionListener(listener);
		jButton2.addActionListener(listener);
		jButton3.addActionListener(listener);
		jButton4.addActionListener(listener);
		jButton5.addActionListener(listener);
		jButton6.addActionListener(listener);
		jButton7.addActionListener(listener);
		jButton8.addActionListener(listener);
		jButton9.addActionListener(listener);
		
		jButton1.getModel();
		
		jPanel.add(jButton1);
		jPanel.add(jButton2);
		jPanel.add(jButton3);
		jPanel.add(jButton4);
		jPanel.add(jButton5);
		jPanel.add(jButton6);
		jPanel.add(jButton7);
		jPanel.add(jButton8);
		jPanel.add(jButton9);
		
		getContentPane().add(jPanel, BorderLayout.CENTER);
		getContentPane().add(textField, BorderLayout.NORTH);
		
	}
	
	private class ButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			System.out.println(button.getText());	
		}
		
		
	}
	
}
