package sk.stuba.fei.uim.oop;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class MyCanvas extends JPanel implements MouseListener, MouseMotionListener, ChangeListener, ActionListener {
    private int length;
    private int radius;
    private int spacing;
    private Shape shape;

    MyCanvas() {
        this.length = 50;
        this.radius = 5;
        this.spacing = 5;
        this.shape = Shape.CIRCLE;
        this.shape = Shape.SQUARE;

        addMouseMotionListener(this);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

        this.repaint();


    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Point point = new Point();

        g.setColor(Color.red);
       if (this.shape.equals(Shape.CIRCLE)) {
            this.shape.paint(point, g, this.radius);
        }
        if (this.shape.equals(Shape.SQUARE)) {
            this.shape.paint(point, g, this.radius);

        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        this.mouseMoved(e);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.repaint();


    }

    @Override
    public void mousePressed(MouseEvent e) {

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
}
