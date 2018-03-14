package com.spacecraft;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SpaceCraft extends JFrame {

    public SpaceCraft() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        setResizable(false);
        pack();
        
        setTitle("Space Craft");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SpaceCraft ex = new SpaceCraft();
                ex.setVisible(true);
            }
        });
    }
}
