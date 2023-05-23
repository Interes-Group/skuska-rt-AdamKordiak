package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    MyCanvas canvas = new MyCanvas();
    private JSlider length;
    private JSlider radius;
    private JSlider spacing;


    Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        setLayout(new BorderLayout());

       rightPanel(canvas);
        add(canvas);
        this.setVisible(true);
    }

    public void rightPanel(MyCanvas canvas){


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


        this.length = lenghtSlider;
        this.radius = radiusSlider;
        this.spacing = spacingSlider;

        sliders.add(this.length);
        sliders.add(this.radius);
        sliders.add(this.spacing);


        JComboBox<Shape> combobox = new JComboBox<>();
        combobox.addItem(Shape.CIRCLE);
        combobox.addItem(Shape.SQUARE);
        combobox.addItem(Shape.HOURGLASS);

        sideMenu.add(texts, BorderLayout.NORTH);
        sideMenu.add(sliders, BorderLayout.CENTER);
        sideMenu.add(combobox,BorderLayout.SOUTH);

        add(sideMenu,BorderLayout.EAST);

    }

    }


