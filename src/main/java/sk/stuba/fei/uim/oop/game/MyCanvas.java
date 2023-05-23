package sk.stuba.fei.uim.oop.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class MyCanvas extends JPanel implements MouseListener, MouseMotionListener, ActionListener {
    private int length;
    private int radius;
    private int spacing;
    private Shape shape;

    private List<Point> points;

    MyCanvas() {
        this.length = 50;
        this.radius = 5;
        this.spacing = 5;
        this.shape = Shape.CIRCLE;
        this.points = new ArrayList<>();



        addMouseMotionListener(this);
    }

    public void setLength(int length) {
        this.length = length;

    }
    public void setRadius(int radius) {
        this.radius = radius;

    }
    public void setSpacing(int spacing) {
        this.spacing = spacing;

    }
    public void setShape(Shape shape) {
        this.shape = shape;

    }
    @Override
    public void mouseMoved(MouseEvent e) {

        this.repaint();


    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = points.size() - 1; i >= 0; i--) {
            g.setColor(Color.red);

            Point point = points.get(i);

            if (i % this.spacing == 0 || i == points.size() - 1) {
                this.shape.paint(point,g, this.radius);
            }

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
    public void mouseClicked(MouseEvent e) {


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
