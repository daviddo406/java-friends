package controller;

import javax.swing.*;
import java.awt.event.*;

public class InteractableController implements Controller, MouseListener, MouseMotionListener {
    private JFrame window;
    private int posX, posY = 0;
    public InteractableController(JFrame window){
        this.window = window;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        posX=e.getX();
        posY=e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        window.setLocation(e.getXOnScreen()-posX,e.getYOnScreen()-posY);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void updateState() {

    }
}
