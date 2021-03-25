package project;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.sql.*;


public class CreateWindowCustomer extends JFrame implements ActionListener{
	String Name;
	String Address;
	String Postcode;
	String PhoneNum;
	
	//---------------------------------------
	//Buttons
	JButton back = new JButton("Back");
	JButton submit = new JButton("Submit");
	
	//---------------------------------------
	//TextFields
	JTextArea name = new JTextArea();
	JTextArea address = new JTextArea();
	JTextArea postcode = new JTextArea();
	JTextArea phoneNum = new JTextArea();
	
	//---------------------------------------
	//Labels
	JLabel nameL = new JLabel();
	JLabel addressL = new JLabel();
	JLabel postcodeL = new JLabel();
	JLabel phoneNumL = new JLabel();
	JLabel title = new JLabel();
	JLabel conne = new JLabel();
	
	//Constructor----------------------------
	CreateWindowCustomer(){
		
		
		back.setBounds(5, 200, 100, 20);
		back.addActionListener(this);
		submit.setBounds(150, 200, 100, 20);
		submit.addActionListener(this);
		title.setBounds(5,5,200,20);
		title.setText("Create New Customer");
		title.setForeground(Color.white);
		title.setFont(new Font("Calibri",Font.BOLD,20));
		conne.setVisible(false);
		conne.setBounds(50,200,60,20);
		conne.setForeground(Color.white);
		conne.setText("Connection");
		
		//Name Text And Label
		name.setBounds(100, 40, 150, 20);
		nameL.setBounds(5, 40, 80, 20);
		nameL.setText("Name: ");
		nameL.setForeground(Color.white);
		nameL.setFont(new Font("Calibri",Font.BOLD,18));
		
		//Address Text And Label
		address.setBounds(100, 66, 150, 60);
		addressL.setBounds(5, 66, 80, 20);
		addressL.setText("Address: ");
		addressL.setForeground(Color.white);
		addressL.setFont(new Font("Calibri",Font.BOLD,18));
		
		//Postcode Text And Label
		postcode.setBounds(100, 132, 150, 20);
		postcodeL.setBounds(5, 132, 80, 20);
		postcodeL.setText("Postcode: ");
		postcodeL.setForeground(Color.white);
		postcodeL.setFont(new Font("Calibri",Font.BOLD,18));
		
		//PhoneNum Text And Label
		phoneNum.setBounds(100, 158, 150, 20);
		phoneNumL.setBounds(5, 158, 91, 20);
		phoneNumL.setText("PhoneNum:");
		phoneNumL.setForeground(Color.white);
		phoneNumL.setFont(new Font("Calibri",Font.BOLD,18));
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(0x123456));
		this.setSize(400,400);
		this.setLayout(null);
		this.setVisible(true);
		this.add(back);//yes
		this.add(name);
		this.add(nameL);
		this.add(address);
		this.add(addressL);
		this.add(title);
		this.add(postcode);
		this.add(postcodeL);
		this.add(phoneNum);
		this.add(phoneNumL);
		this.add(submit);
		this.setResizable(false);
		this.add(conne);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back) {
			this.dispose();
			new Frame();
		}
		if(e.getSource()==submit) {
			try {
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb" , "root" , "qwerty");
				Statement myStmt = conn.createStatement();
				String sql = "INSERT INTO CUSTOMER (name, address, postcode, phoneNum) VALUES ('" + name.getText() + "', '" + address.getText() + "', '" + postcode.getText() + "', '" + phoneNum.getText() + "')";
				boolean pass;
				while(name.getText()==null && address.getText()==null && postcode.getText()==null && phoneNum.getText()==null) {
					
				}
				pass = true;
				
				myStmt.execute(sql);
			
				
				
				conne.setVisible(true);
				
			}catch (Exception exc){
				exc.printStackTrace();
			}
				
			
		}
		
		
	}
}
