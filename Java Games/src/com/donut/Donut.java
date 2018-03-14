// Game Entry point
package com.donut;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Donut extends JFrame{
	
	public Donut(){
		initUI();
	}
	
	private void initUI(){
		//Place board to center of JFrame
		add(new Board());
		// Sets window size
		setSize(330, 330);
		setTitle("Donut");
		// Allows application to be closed when click close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Setting null centers JFrame to screen center
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			@Override
			public void run(){
				Donut ex = new Donut();
				ex.setVisible(true);
			}
		});
	}
	
}
