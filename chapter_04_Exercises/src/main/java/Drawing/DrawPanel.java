package Drawing;

import java.awt.Graphics;
import javax.swing.JPanel;

import java.lang.Math;

public class DrawPanel extends JPanel {

    // draws an X from the corners of the panel
    public void paintComponent (Graphics g)
    {
        // call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);
        drawRotations(g);


    }

    public void drawLine(Graphics g) {
        int width = getWidth();
        int height = getHeight();

        // draw a line from the upper-left to the lower-right
        g.drawLine(0,0,width,height);

        // draw a line from the lower-left to the upper right
        g.drawLine(0, height, width, 0);
    }

    public void drawManyLines(Graphics g) {
        // there are 15 lines
        // they end at line that goes from (0, height, width, 0)
        int width = getWidth();
        int height = getHeight();

        int step = 15;

        for (int i = 0; i<=step; i++){
            g.drawLine(0, 0, (int)((1.0/step)*i*width), (int)(height - ((1.0/step)*i*height)));
        }
    }

    public void drawRotations(Graphics g) {
        // get variables
        int width = getWidth();
        int height = getHeight();
        double x0, x1, y0, y1;
        double cx = (1.0/2) * width;
        double cy = (1.0/2) * height;
        double x0t, x1t, y0t, y1t;

        int step = 20, rotation = 4;
        for (int i = 0; i<=step; i++){
            // get points
            x0 = 0;
            x1 = (1.0/step)*i*width;
            y0 = 0;
            y1 = height - ((1.0/step)*i*height);

            // draw each rotation
            for (int j = 0; j < rotation; j++) {
                // set up the rotation
                double theta = Math.toRadians((360.0/rotation)*j);

                // rotate (translate, then rotate, then translate back)
                x0t = (x0 - cx) * Math.cos(theta) - (y0 - cy) * Math.sin(theta) + cx;
                y0t = (x0 - cx) * Math.sin(theta) + (y0 - cy) * Math.cos(theta) + cy;

                x1t = (x1 - cx) * Math.cos(theta) - (y1 - cy) * Math.sin(theta) + cx;
                y1t = (x1 - cx) * Math.sin(theta) + (y1 - cy) * Math.cos(theta) + cy;

                // draw line
                g.drawLine((int)x0t, (int)y0t, (int)x1t, (int)y1t);


            }
        }

        // for loop for each rotation
    }

    public void drawCurve(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        double x1, y0;

        double steps = 30.0;
        double x_increments = width/steps;
        double y_increments = height/steps;
        int i = 0;

        while (i < steps) {
            y0 = y_increments * i;
            x1 = x_increments * i;

            g.drawLine(0, (int)y0, (int)x1, width);

            i++;
        }
    }

    public void drawManyCurves(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        double x0, x1, y0, y1;

        double steps = 15.0;
        int rotations = 4;
        double x_increments = width/steps;
        double y_increments = height/steps;
        double x0t, x1t, y0t, y1t;
        int i = 0;
        double cx = (1.0/2) * width;
        double cy = (1.0/2) * height;

        while (i < steps) {
            x0 = 0;
            y0 = y_increments * i;
            x1 = x_increments * i;
            y1 = width;


            for (int j = 0; j < rotations; j++) {
                double theta = Math.toRadians((360.0/rotations) * j);

                // perform rotation
                x0t = (x0 - cx) * Math.cos(theta) - (y0 - cy) * Math.sin(theta) + cx;
                y0t = (x0 - cx) * Math.sin(theta) + (y0 - cy) * Math.cos(theta) + cy;

                x1t = (x1 - cx) * Math.cos(theta) - (y1 - cy) * Math.sin(theta) + cx;
                y1t = (x1 - cx) * Math.sin(theta) + (y1 - cy) * Math.cos(theta) + cy;

                g.drawLine((int)x0t, (int)y0t, (int)x1t, (int)y1t);
            }

            i++;
        }

    }
} // end class DrawPanel
