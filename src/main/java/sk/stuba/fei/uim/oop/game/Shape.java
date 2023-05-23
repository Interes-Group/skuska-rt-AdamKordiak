package sk.stuba.fei.uim.oop.game;

import java.awt.*;

public enum Shape {
    CIRCLE,
    SQUARE,
    TIMER;
    public void paintComponent(Point actualPoint,Graphics g, int radius) {
        if (this.equals(CIRCLE)) {

            g.fillOval(actualPoint.x - radius, actualPoint.y - radius, radius * 2, radius * 2);
        }
        else if (this.equals(SQUARE)) {

            g.fillRect(actualPoint.x - radius, actualPoint.y - radius, radius * 2, radius * 2);
        }
        else if (this.equals(TIMER)) {

            g.fillRect(actualPoint.x - radius, actualPoint.y - radius, radius * 2, radius * 2);
            //nwm zatial
        }

        }
    }


