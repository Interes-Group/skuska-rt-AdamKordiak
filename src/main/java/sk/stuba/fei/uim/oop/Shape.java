package sk.stuba.fei.uim.oop;

import java.awt.*;

public enum Shape {
    CIRCLE,
    SQUARE,
    TIMER;
    public void paint(Point actualPoint,Graphics g, int radius) {
        if (this.equals(CIRCLE)) {
            g.fillOval(actualPoint.x - radius, actualPoint.y - radius, radius * 2, radius * 2);
        } else if (this.equals(SQUARE)) {
            g.fillRect(actualPoint.x - radius, actualPoint.y - radius, radius * 2, radius * 2);
        } else if (this.equals(TIMER)) {

        }

        }
    }


