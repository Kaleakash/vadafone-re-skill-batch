package com;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame implements ActionListener{
	JButton b1;
	public MyFrame() {
		Container con = getContentPane();
		con.setLayout(null);
		b1 = new JButton("Click Here");
		b1.setBounds(150, 100, 120, 30);
		con.add(b1);
		b1.addActionListener(this);// register the event 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("event fired");
		
	}
}
public class Demo {
	
	public static void main(String[] args) {
		MyFrame obj = new MyFrame();
		obj.setVisible(true);
		obj.setSize(400, 400);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
