package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InBetween extends JFrame implements ActionListener{
	JButton back = new JButton("Back");
	JButton customer = new JButton("Customer");
	JButton invoice = new JButton("Invoice");
	JButton product = new JButton("Product");
	InBetween(){
		
		back.setBounds(5, 140, 100, 20);
		back.addActionListener(this);
		
		customer.setBounds(5, 20, 100, 20);
		customer.addActionListener(this);
		
		invoice.setBounds(5, 40, 100, 20);
		invoice.addActionListener(this);
		
		product.setBounds(5, 60, 100, 20);
		product.addActionListener(this);
		
		
		
		JLabel label = new JLabel();
		label.setText("For:");
		label.setForeground(Color.white);
		label.setFont(new Font("Calibri",Font.BOLD,20));
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(5, 5, 40, 40);
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(150,200);
		this.setLayout(null);
		this.setVisible(true);
		this.getContentPane().setBackground(new Color(0x123456));
		this.add(back);//yes
		this.add(label);
		this.add(customer);
		this.add(invoice);
		this.add(product);
		this.setResizable(false);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back) {
			this.dispose();
			new Frame();
		}
		if(e.getSource()==customer) {
			this.dispose();
			new CreateWindowCustomer();
		}
		
	}
}
