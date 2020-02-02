import javax.swing.JFrame;
import javax.swing.JLabel;

/**
   A "Hello, World" program for Java Swing run as a Java application,
   modified to have the class implement the Runnable interface rather
   than creating the Runnable as an anonymous class.

   @author Jim Teresco
   @version Spring 2020
*/

public class HelloSwingWorld2 implements Runnable {

    /**
       The run method to set up the graphical user interface

    */
    @Override
    public void run() {
	
	// set up the GUI "look and feel" which should match
	// the OS on which we are running
	JFrame.setDefaultLookAndFeelDecorated(true);
	
	// create a JFrame in which we will build our very
	// tiny GUI, and give the window a name
	JFrame frame = new JFrame("HelloSwingWorld");
	
	// tell the JFrame that when someone closes the
	// window, the application should terminate
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	// create a JLabel containing our message, and add
	// it to our JPanel
	JLabel label = new JLabel("Hello, Swing World!");
	frame.add(label);
	
	// display the window we've created
	frame.pack();
	frame.setVisible(true);
    }
    
    public static void main(String args[]) {

	// The main method is responsible for creating a thread (more
	// about those later) that will construct and show the graphical
	// user interface.
	javax.swing.SwingUtilities.invokeLater(new HelloSwingWorld2());
    }
}
   
