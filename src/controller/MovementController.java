package controller;


import state.StartState;
import state.State;
import view.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MovementController implements Controller, MouseListener{
    View view;
    State current;
    Timer movementTimer;

    public MovementController(View view){
        this.view = view;
        this.current = new StartState();
    }

    @Override
    public void start() {
         movementTimer = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.root.setLocation(view.root.getX() + 3, view.root.getY());
            }
        });
        movementTimer.start();
    }

    @Override
    public void stop() {
        movementTimer.stop();
    }

    @Override
    public void updateState() {
        current = current.handle();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        stop();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        start();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
