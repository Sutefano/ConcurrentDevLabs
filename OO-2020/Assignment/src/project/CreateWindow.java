package project;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class CreateWindow extends JFrame implements ActionListener{
	
	JButton back = new JButton("Back");
	CreateWindow(){
		back.setBounds(5, 5, 100, 20);
		back.addActionListener(this);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,400);
		this.setLayout(null);
		this.setVisible(true);
		this.add(back);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back) {
			this.dispose();
			new Frame();
		}
		
	}
}
