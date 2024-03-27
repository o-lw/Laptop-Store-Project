import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* 
 * In charge of title: name
 */

@SuppressWarnings("serial")
	public class TitleFrame extends JFrame implements ActionListener{

		//Set background and 3 buttons
		JLabel backgroundLabel = new JLabel(new ImageIcon("images/HomePage.jpg"));
		JButton inventoryButton = new JButton("");//We don't need to put words in the button because the background image has it
		JButton educationButton = new JButton("");
		JButton surveyButton = new JButton("");
		
		
		public TitleFrame(){
			
			setLayout(new BorderLayout());
			
			//set the size of the frame
			setSize(1440,900);
			
			//set the title of the frame
			setTitle("TechCanada Home Page");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			backgroundLabel.setLayout(null);
			
			add(backgroundLabel);
			
			//Set resizable be false so that users can not modify it
			setResizable(false);
			
			//Set the frame to be visible
			setVisible(true);
			
			//Set the bound of inventory
			inventoryButton.setBounds(200,355,360,155);
			inventoryButton.addActionListener(this);
			//Add it to the background frame
			backgroundLabel.add(inventoryButton);
			//Set it to be unable to view
			inventoryButton.setOpaque(false);
			inventoryButton.setBorderPainted(false);
			inventoryButton.setContentAreaFilled(false);
			
			//Set the bound of education
			educationButton.setBounds(900,355,360,155);
			educationButton.addActionListener(this);
			//Add it to the background frame
			backgroundLabel.add(educationButton);
			//Set it to be unable to view
			educationButton.setOpaque(false);
			educationButton.setBorderPainted(false);
			educationButton.setContentAreaFilled(false);
			
			//Set the bound of survey
			surveyButton.setBounds(553,579,360,155);
			surveyButton.addActionListener(this);
			//Add it to the background frame
			backgroundLabel.add(surveyButton);
			//Set it to be unable to view
			surveyButton.setOpaque(false);
			surveyButton.setBorderPainted(false);
			surveyButton.setContentAreaFilled(false);
			
		}


		@Override
		public void actionPerformed(ActionEvent event) {
//			if (event.getSource() == inventoryButton) {
//				// shows the inventory screen and hide the title screen
//				setVisible(false);
//				InventoryFrame inventoryFrame = new InventoryFrame();
//				inventoryFrame.setVisible(true);// goes to the inventory screen
//				
//			}
			if (event.getSource() == educationButton) {
				// shows the education screen and hide the title screen
				setVisible(false);
				EducationFrame educationFrame = new EducationFrame();
				educationFrame.setVisible(true);// goes to the education screen
				
			}
//			else if (event.getSource() == surveyButton) {
//				// shows the survey screen and hide the title screen
//				setVisible(false);
////				SurveyFrame surveyFrame = new SurveyFrame();
////				surveyFrame.setVisible(true);
////				This part is Thomas's work
//				
//			}	

		
	}
}