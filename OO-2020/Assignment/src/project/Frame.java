package project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JWindow;

public class Frame extends JFrame implements ActionListener{
	
	JButton createButton;
	JButton retrieveButton;
	JButton updateButton;
	JButton deleteButton;
	
	Frame(){
		
		createButton = new JButton();
		createButton.setBounds(5, 50, 400, 100);
		createButton.setFocusable(false);
		createButton.setText("Create Entry");
		createButton.setFont(new Font("Calibri",Font.BOLD,20));
		createButton.addActionListener(this);
		
		retrieveButton = new JButton();
		retrieveButton.setBounds(5, 160, 400, 100);
		retrieveButton.setFocusable(false);
		retrieveButton.setText("Retrieve Entry");
		retrieveButton.setFont(new Font("Calibri",Font.BOLD,20));
		retrieveButton.addActionListener(this);
		
		updateButton = new JButton();
		updateButton.setBounds(5, 270, 400, 100);
		updateButton.setFocusable(false);
		updateButton.setText("Update Entry");
		updateButton.setFont(new Font("Calibri",Font.BOLD,20));
		updateButton.addActionListener(this);
		
		deleteButton = new JButton();
		deleteButton.setBounds(5, 380, 400, 100);
		deleteButton.setFocusable(false);
		deleteButton.setText("Delete Entry");
		deleteButton.setFont(new Font("Calibri",Font.BOLD,20));
		deleteButton.addActionListener(this);
		
		JLabel title = new JLabel();
		title.setText("Manage Customer Entries");
		title.setForeground(Color.white);
		title.setFont(new Font("Calibri",Font.BOLD,30));
		title.setVerticalAlignment(JLabel.TOP);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBounds(5, 5, 400, 40);
		
		
		
		this.setSize(430,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Gui");//sets title of this
		this.setVisible(true); //makes this visible	
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(0x123456));
		this.add(createButton);
		this.add(retrieveButton);
		this.add(updateButton);
		this.add(deleteButton);
		this.add(title);
		this.setResizable(false);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()==createButton) {
			this.dispose();
			new CreateWindow();
		} 
		
		if(e.getSource()==retrieveButton) {
			this.dispose();
			new RetrieveWindow();
		}
		
		if(e.getSource()==updateButton) {
			this.dispose();
			new UpdateWindow();
		}
		
		if(e.getSource()==deleteButton) {
			this.dispose();
			new DeleteWindow();
		}
		
	}

}
