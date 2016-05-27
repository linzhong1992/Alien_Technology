package com.linechart;

/**
 * Created by zhonglin on 5/24/2016.
 */
import org.jfree.ui.RefineryUtilities;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.IOException;

// An AWT program inherits from the top-level container java.awt.Frame
public class ChartApp extends Frame implements ActionListener {
    private Button btn1;   // Declare a Button component
    private Button btn2;

    // Constructor to setup GUI components and event handlers
    public ChartApp () {
        setLayout(new FlowLayout());
        // "super" Frame (a Container) sets its layout to FlowLayout, which arranges
        // the components from left-to-right, and flow to next row from top-to-bottom.

        btn1 = new Button("Atenna 1");   // construct the Button component
        add(btn1);                    // "super" Frame adds Button
        btn2 = new Button("Atenna 2");
        add(btn2);
        btn1.addActionListener(this);
        // btn1 is the source object that fires ActionEvent when clicked.
        // The source add "this" instance as an ActionEvent listener, which provides
        //  an ActionEvent handler called actionPerformed().
        // Clicking btnC1 invokes actionPerformed().

        setTitle("Atenna Categories");  // "super" Frame sets its title
        setSize(500, 500);        // "super" Frame sets its initial window size

        // For inspecting the components/container objects
        // System.out.println(this);
        // System.out.println(lblCount);
        // System.out.println(tfCount);
        // System.out.println(btn1);

        setVisible(true);         // "super" Frame shows

        // System.out.println(this);
        // System.out.println(lblCount);
        // System.out.println(tfCount);
        // System.out.println(btn1);
    }

    // The entry main() method
    public static void main(String[] args) {
        // Invoke the constructor to setup the GUI, by allocating an instance
        ChartApp app = new ChartApp();
        // or simply "new AWTCounter();" for an anonymous instance
    }

    // ActionEvent handler - Called back upon button-click.
    @Override
    public void actionPerformed(ActionEvent evt){
        try {
            LineChart chart = new LineChart("Lets do a test", "TEST", "Test1.xlsx");
            chart.pack( );
            RefineryUtilities.centerFrameOnScreen( chart );
            chart.setVisible( true );
        }
        catch(IOException e) {
            System.out.print("IOERROR");
        }

    }
}