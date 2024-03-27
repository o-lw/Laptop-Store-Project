
/*
 * Created by: Oliver
 */

// Imports
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// By extending the class with JFrame, it acts like a screen
public class popUpFrame extends JFrame implements ActionListener{

	// Labels
	JLabel background = new JLabel();
	JLabel warningMessage = new JLabel("This question has been sent to our administrative." + "\n If you want a direct response, please contact us.");	
	
	// Button
	JButton confirmation = new JButton("Continue");
	

	// Constructor
	public popUpFrame() {
		
		// Sets the size of the pop up frame and doesn't allow the user to resize
		setSize(700, 200);
		setLayout(null);
		setResizable(false);
		
		// Creates the background
		background.setLayout(null);
		background.setBounds(0, 0, 700, 200);
		background.setOpaque(true);
		
		// Adds the background onto the frame
		add(background);
		
		// Sets the bounds of the warning message label
		warningMessage.setBounds(30, 10, 900, 100);
		
		// Sets the bounds of the confirmation button
		confirmation.setBounds(270, 90, 100, 40);
		confirmation.addActionListener(this);

		// Adds to the background
		background.add(warningMessage);
		background.add(confirmation);
		
		// Makes the frame visible
		setVisible(true);
		
		}

	// Listens to the actions performed (e.g. clicking a button) and proceeds accordingly
	@Override
	public void actionPerformed(ActionEvent event) {
		
		// If the user clicks on the button, it will go back to the education frame (overwrites)
		if (event.getSource() == confirmation) {
			
			// Calls the Education Frame class
			new EducationFrame();

		}
		
	} // End of action performed
		
} // End of class
