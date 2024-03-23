package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class View {
    public JFrame root;

    public View(){
        //1. Create the frame.
        root = new JFrame();

        //remove borders
        root.setUndecorated(true);

        //set transparent background
        root.setBackground(new Color(0,0,0,0));

        //2. Optional: What happens when the window closes?
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3. Create components and put them in the window.
        JLabel emptyLabel = new JLabel();
        ImageIcon image = new ImageIcon("assets/small.png");
        emptyLabel.setIcon(image);
        root.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        //4. Size the window.
        root.pack();

        //5. Show it.
        root.setVisible(true);
        root.setSize(300, 300);
    }

    public void addMouseListener(MouseListener listener){
        root.addMouseListener(listener);
    }

    public void addMouseMotionListener(MouseMotionListener listener){
        root.addMouseMotionListener(listener);
    }
}
