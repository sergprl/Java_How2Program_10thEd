public class Main {
    public static void main(String[] args) {

        int height = 211;
        int width = 234;

        double x0 = 0;
        double x1 = 0;
        double y0 = 0;
        double y1 = 211;
        double x0t, x1t, y0t, y1t;
        double cx = (1.0/2) * width;
        double cy = (1.0/2) * height;


        double theta = Math.toRadians(90);

        // first offset
        x0t = x0 - cx;
        x1t = x1 - cx;
        y0t = y0 - cy;
        y1t = y1 - cy;

        System.out.println(x0t);
        System.out.println(y0t);

        // rotate
        x0t = x0t * Math.cos(theta) - y0t * Math.sin(theta);

        System.out.println(Math.sin(theta));
        System.out.println(x0t);

            y0t = x0t * Math.sin(theta) + y0t * Math.cos(theta);

            x1t = x1t * Math.cos(theta) - y1t * Math.sin(theta);
            y1t = x1t * Math.sin(theta) + y1t * Math.cos(theta);

            // translate back to origin
            x0t += cx;
            y0t += cy;

            x1t += cx;
            y1t += cy;


    }
}