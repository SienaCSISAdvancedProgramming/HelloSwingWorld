import javax.swing.JFrame;
import javax.swing.JLabel;

/**
   A "Hello, World" program for Java Swing run as a Java application.

   Based on a very similar example by Darren Lim.

   @author Jim Teresco
   @version Spring 2020
*/

public class HelloSwingWorld {

    public static void main(String args[]) {

	// The main method is responsible for creating a thread (more
	// about those later) that will construct and show the graphical
	// user interface.
	javax.swing.SwingUtilities.invokeLater(new Runnable() {

		/**
		   The run method that will be invoked by this thread.
		*/
		@Override
		public void run() {

		    // in more complex examples, you will often just
		    // have this call a separate method
		    
		    // set up the GUI "look and feel" which should match
		    // the OS on which we are running
		   // JFrame.setDefaultLookAndFeelDecorated(true);

		    // create a JFrame in which we will build our very
		    // tiny GUI, and give the window a name
		    JFrame frame = new JFrame("HelloSwingWorld");

		    // tell the JFrame that when someone closes the
		    // window, the application should terminate
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    // create a JLabel containing our message, and add
		    // it to our JFrame
		    JLabel label = new JLabel("Hello, Swing World!");
		    frame.add(label);

		    // display the window we've created
		    frame.pack();
		    frame.setVisible(true);
		}
	    }
	    );
    }
}
   
