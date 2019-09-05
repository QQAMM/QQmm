package com.great.JDBCTest;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class qwe extends JFrame{

	public qwe(){
		JLabel j1=new JLabel("这是我得第一个窗体");
		
		this.setTitle("合金弹头");
		j1.setHorizontalAlignment(SwingUtilities.CENTER);
		
		this.getContentPane().setBackground(Color.yellow);
		this.getContentPane().add(j1);
		this.setSize(900, 600);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new qwe();
	}
}
