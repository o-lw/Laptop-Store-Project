
/*
 * Group: Oliver Lai Wai, name, name, name
 * Date: Wed May 18, 2022
 * 
 * Note: I only included the ones that I worked on (except for the title frame because it's needed to run the program)

 * Title: Laptop Store
 
 * Description:
	This application replicates a store that sells laptops like BestBuy, Amazon, etc. 
	On the main screen (title frame), you have the option to select buttons: 
	Survey (which leads to the Results), Inventory (which allows you to browse and filter the laptops), 
	and Education (which teaches and advises you on different laptops). 
	Additionally, you can navigate around the store by clicking on the buttons that are in a minimalistic, user friendly 
	format. However, BEWARE of the FEROCIOUS bugs scattered around the store!
	
 * Bugs to be aware:
	- In the Education Frame, if you click on “Top 5 Trending Laptops,” the display of images are malfunctioning. If the images appear 
	  on other parts in the display box, you can either restart the application or click on “Send” → “Continue” to reset the frame
    - There might be some issues with the Inventory display because of the spreadsheet
	
 * Major Skills:
   
   Swing GUI components:
	- Extends JFrame, implements Action Listener
	- JLabel, JPanel, JButton, JTextField, JScrollPane
	- actionPerformed (ActionEvent event)
		- If, else if statements
	- textArea
	- .setBounds/Background/Text/Editable/Visible/etc…
	- .add( )
   
   Main method
   Constructor (public method)
   Arrays
	- All 40 laptops
	
 * Added Features:
	- Pop up frame when clicking “Send”
 

 * Contribution to Assignment:
	- Student Name: Oliver Lai Wai 
		- What I was assigned: LaptopApplication and Education Frame (GUI)
		- Other: 
			- Managed, coordinated, and tried to communicate with the group as much as possible outside school hours
			- Tried to help each member do their task by clarifying the assignment
			- Completed the Spreadsheet for my budget range (Mid-priced $500 - 1000), as well as organized the whole group’s computer info to make it clean 
			  and consistent. (I also did some additional research on missing information for my team)
			- Updated the Spreadsheet by adding columns and separating data values for the whole group
			- Worked on Laptop class (for name), helped with the inputFile (for name and name), updated both Laptop and inputFile 
			  to match the updated spreadsheet
			- Chose the colour theme of the whole store application
 */

// This application runs and connects the whole laptop store program
public class LaptopStoreApplication {
	
	// Creates an array containing 40 laptops
	public static Laptop[] laptopArray = new Laptop[40];

	// Creates a variable for the titleFrame class 
	// Makes it public so that it's accessible to all programs
	public static TitleFrame titleFrame = new TitleFrame();
	
	// This method allows the program to start
	public static void main(String[] args) {	
		
		// Calls the class that obtains and sets all data ready-to-go
//		new InputFile();
		
		// Makes the title frame visible
		titleFrame.setVisible(true);
		
	} // End of main method

} // End of application
