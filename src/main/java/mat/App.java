package mat;

import javax.swing.*;
import org.math.plot.*;
import java.awt.Dimension;

public class App {
    public static void main(String args[])
	{

        double t = 46513487263d; 
        int i = 0; 
        long n = 100000;
        double[] x = new double[(int) n];

        double[] y = new double[(int) n];
        while (true) {
            x[i] = t;
            y[i] = i;
            if (t == 1) {
                break;
            }
            i++;
            if (t % 2 == 0)
                t /= 2;
            else {
                t = 3 * t + 1;
            }
        }
        Plot2DPanel plot = new Plot2DPanel();
        plot.addLinePlot("my plot", y, x);
        JFrame frame = new JFrame("a plot panel");
        frame.setContentPane(plot);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.setVisible(true);
    }
}
