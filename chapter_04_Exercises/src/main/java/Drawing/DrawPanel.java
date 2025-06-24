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
        drawManyCurves(g, 4, 20);
    }


    // ----------------------------------------------------------------------------------------
    // Basic functions for testing
    // ----------------------------------------------------------------------------------------

    public void drawLine(Graphics g) {
        int width = getWidth();
        int height = getHeight();

        // draw a line from the upper-left to the lower-right
        g.drawLine(0,0,width,height);

        // draw a line from the lower-left to the upper right
        g.drawLine(0, height, width, 0);
    }


    // ----------------------------------------------------------------------------------------
    // Functions for drawing the pictures
    // ----------------------------------------------------------------------------------------

    public void drawManyLines(Graphics g, int rotations, int steps) {
        // get variables
        int width = getWidth();
        int height = getHeight();

        //                 x0t  y0t x1t  y1t
        double[] points = { 0,   0,  0,  0};

        double cx = (1.0/2) * width;
        double cy = (1.0/2) * height;

        for (int i = 0; i<=steps; i++){
            // get points
            points = genSquareLines(steps, i);

            // draw each rotation
            rotateLine(g, rotations, cx, cy, points[0], points[1], points[2], points[3]);
        }

        // for loop for each rotation
    }


    // draw many curves based on rotation and number of steps
    public void drawManyCurves(Graphics g, int rotations, int steps) {
        int width = getWidth();
        int height = getHeight();

        //                 x0t  y0t x1t  y1t
        double[] points = { 0,   0,  0,  0};

        double cx = (1.0/2) * width;
        double cy = (1.0/2) * height;

        int i = 0;
        while (i < steps) {
            points = genCurveLines(i, steps);

            rotateLine(g, rotations, cx, cy, points[0], points[1], points[2], points[3]);

            i++;
        }

    }

    // ----------------------------------------------------------------------------------------
    // Functions for generating lines
    // ----------------------------------------------------------------------------------------

    public double[] genSquareLines(int steps, int step) {
        // there are 15 lines
        // they end at line that goes from (0, height, width, 0)
        int width = getWidth();
        int height = getHeight();

        //                 x0t  y0t x1t  y1t
        double[] points = { 0,   0,  0,  0};

        points[0] = 0;
        points[1] = 0;
        points[2] = (1.0/steps)*step*width;
        points[3] = height - ((1.0/steps)*step*height);

        return points;
    }

    public double[] genCurveLines(int step, int steps) {
        int width = getWidth();
        int height = getHeight();

        //                 x0t  y0t x1t  y1t
        double[] points = { 0,   0,  0,  0};

        double x_increments = width/steps;
        double y_increments = height/steps;

        points[0] = 0;
        points[1] = y_increments * step;
        points[2] = x_increments * step;
        points[3] = width;

        return points;

    }

    // ----------------------------------------------------------------------------------------
    // Functions for rotations
    // ----------------------------------------------------------------------------------------

    // use rotate formula to draw rotated versions of the given lines
    public void rotateLine(Graphics g, int rotations, double cx, double cy,
                           double x0, double y0, double x1, double y1) {
        for (int j = 0; j < rotations; j++) {
            double theta = (360.0/rotations) * j;

            double[] points = rotateFormula(theta, cx, cy, x0, x1, y0, y1);

            g.drawLine((int)points[0], (int)points[1], (int)points[2], (int)points[3]);
        }
    }

    // rotate formula
    public double[] rotateFormula (double degrees, double cx, double cy, double x0, double x1, double y0, double y1) {
        // set theta to rads
        double theta = Math.toRadians(degrees);

        //                 x0t  y0t x1t  y1t
        double[] points = { 0,   0,  0,  0};

        // apply formula
        points[0] = (x0 - cx) * Math.cos(theta) - (y0 - cy) * Math.sin(theta) + cx;
        points[1] = (x0 - cx) * Math.sin(theta) + (y0 - cy) * Math.cos(theta) + cy;

        points[2] = (x1 - cx) * Math.cos(theta) - (y1 - cy) * Math.sin(theta) + cx;
        points[3] = (x1 - cx) * Math.sin(theta) + (y1 - cy) * Math.cos(theta) + cy;

        return points;

    }

} // end class DrawPanel
