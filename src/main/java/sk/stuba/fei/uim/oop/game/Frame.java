package sk.stuba.fei.uim.oop.game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;


public class Frame extends JFrame implements ActionListener,ChangeListener {
    MyCanvas canvas = new MyCanvas();
    private JSlider length;
    private JSlider radius;
    private JSlider spacing;
    private Shape shape;


    public Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        setLayout(new BorderLayout());

        rightPanel();
        add(canvas);
        this.setLocationRelativeTo(null);

        this.setVisible(true);

    }

    public void rightPanel(){


        JPanel texts = new JPanel(new GridLayout(1, 3));

        JPanel sideMenu = new JPanel(new BorderLayout());

        texts.add(new JLabel("Length"));
        texts.add(new JLabel("Radius"));
        texts.add(new JLabel("Spacing"));


        JPanel sliders = new JPanel(new GridLayout(1, 3));

        JSlider lenghtSlider = new JSlider();
        lenghtSlider.setOrientation(JSlider.VERTICAL);
        lenghtSlider.setMinimum(20);
        lenghtSlider.setMaximum(200);
        lenghtSlider.setValue(50);
        lenghtSlider.setMajorTickSpacing(10);
        lenghtSlider.setMinorTickSpacing(10);
        lenghtSlider.setPaintTicks(true);
        lenghtSlider.setPaintLabels(true);
        lenghtSlider.setSnapToTicks(true);

        lenghtSlider.addChangeListener(this);



        JSlider radiusSlider = new JSlider();
        radiusSlider.setOrientation(JSlider.VERTICAL);
        radiusSlider.setMinimum(1);
        radiusSlider.setMaximum(20);
        radiusSlider.setValue(5);
        radiusSlider.setMajorTickSpacing(1);
        radiusSlider.setMinorTickSpacing(1);
        radiusSlider.setPaintTicks(true);
        radiusSlider.setPaintLabels(true);
        radiusSlider.setSnapToTicks(true);
        radiusSlider.addChangeListener(this);




        JSlider spacingSlider = new JSlider();
        spacingSlider.setOrientation(JSlider.VERTICAL);
        spacingSlider.setMinimum(1);
        spacingSlider.setMaximum(20);
        spacingSlider.setValue(5);
        spacingSlider.setMajorTickSpacing(1);
        spacingSlider.setMinorTickSpacing(1);
        spacingSlider.setPaintTicks(true);
        spacingSlider.setPaintLabels(true);
        spacingSlider.setSnapToTicks(true);
        spacingSlider.addChangeListener(this);


        this.length = lenghtSlider;
        this.radius = radiusSlider;
        this.spacing = spacingSlider;

        sliders.add(this.length);
        sliders.add(this.radius);
        sliders.add(this.spacing);


        JComboBox<Shape> combobox = new JComboBox<>();
        combobox.addItem(Shape.CIRCLE);
        combobox.addItem(Shape.SQUARE);
        combobox.addItem(Shape.TIMER);
        combobox.addActionListener(this);

        sideMenu.add(texts, BorderLayout.NORTH);
        sideMenu.add(sliders, BorderLayout.CENTER);
        sideMenu.add(combobox,BorderLayout.SOUTH);

        add(sideMenu,BorderLayout.EAST);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Ssss");
        JComboBox<?> comboBox = (JComboBox<?>) e.getSource();
        Object selectedItem = comboBox.getSelectedItem();
        Shape selectedShape = (Shape) selectedItem;
        this.canvas.setShape(selectedShape);


    }
    @Override
    public void stateChanged(ChangeEvent e) {

        if (e.getSource() == this.length) {
            int lengthValue = this.length.getValue();
            this.canvas.setLength(lengthValue);
        }
        if (e.getSource() == this.radius) {
            int radiusValueValue = this.radius.getValue();
            this.canvas.setRadius(radiusValueValue);
        }
        if (e.getSource() == this.spacing) {
            int spacingValue = this.spacing.getValue();
            this.canvas.setSpacing(spacingValue);
        }
        if (e.getSource() == this.shape) {
            this.canvas.setShape(shape);
        }

        this.repaint();
        }

}


