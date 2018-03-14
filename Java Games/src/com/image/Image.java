package com.image;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Image extends JFrame {
	
	public Image(){
		initUI();
	}
	
	private void initUI(){
		add(new Board());
		pack();
		setTitle("Image");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				Image ex = new Image();
				ex.setVisible(true);
			}
		});
	}
}
