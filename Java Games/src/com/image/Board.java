package com.image;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel {
	
	private Image picture;
	
	public Board(){
		initBoard();
	}
	
	private void initBoard(){
		loadImage();
		int w = picture.getWidth(this);
		int h = picture.getHeight(this);
		setPreferredSize(new Dimension(w, h));
	}
	
	private void loadImage(){
		ImageIcon ii = new ImageIcon("images/star.png");
		picture = ii.getImage();
	} 
	
	@Override
	public void paintComponent(Graphics g){
		g.drawImage(picture, 0, 0, null);
	}
	
}
