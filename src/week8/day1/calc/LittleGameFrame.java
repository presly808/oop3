package week8.day1.calc;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LittleGameFrame extends JFrame {

	private JButton[] buttons = new JButton[9];
	private boolean chooser = true;
	
	public LittleGameFrame(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,600);
		init();
		setVisible(true);
	}
	
	
	private void init(){
		
		GameListener gameListener = new GameListener();
		
		for(int i = 0; i < buttons.length; i++){
			JButton jButton = new JButton();
			jButton.addActionListener(gameListener);
			buttons[i] = jButton;
		}
		
		setLayout(new GridLayout(3,3));
		
		for(JButton b : buttons){ 
			getContentPane().add(b);
		}
	}
	
	private class GameListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			b.setText(chooser ? "X" : "O");
			chooser = !chooser; // !true = false 
			b.setEnabled(false);
		}
		
	}
	
	private void check(){
		if(buttons[0].getText().equals(buttons[1].getText()) && 
				buttons[1].getText().equals(buttons[2].getText())) {
			
		}
		
		if(buttons[3].getText().equals(buttons[4].getText()) && 
				buttons[4].getText().equals(buttons[5].getText())) {
			
		}
		
		if(buttons[6].getText().equals(buttons[7].getText()) && 
				buttons[7].getText().equals(buttons[8].getText())) {
			
		}
	}
	
	
}
