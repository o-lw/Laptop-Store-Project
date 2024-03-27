/*
 * Group: Oliver, name, name, name
 * In charge of Education Frame: Oliver
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// By extending the class with JFrame, it acts like a screen
// By implementing action listener, you set up objects to respond to events that occur (like clicking buttons)
public class EducationFrame extends JFrame implements ActionListener{
	
	// Fields
	JTextArea textArea = new JTextArea();
	JTextArea imageArea = new JTextArea();

	JScrollPane scrollPane;
	JScrollPane imagePane;

	JPanel displayBox = new JPanel();
	JPanel imageBox = new JPanel();

	// Allows the user to enter a question in the text box
	JTextField enterQuestion = new JTextField();
	
	// Colours
	Color backgroundColour = new Color(25, 14, 59);
	Color fontColour = new Color(255, 255, 255);
	Color titleColour = new Color(0, 255, 255);
	Color displayBackgroundColour = new Color(53, 28, 117);
	Color trendingColour = new Color(230, 145, 56);
	Color displayBoxColour = new Color(143, 0, 238);
	Color buttonsColour = new Color(109, 158, 235);

	// Labels
	JLabel background = new JLabel(); 
	
	JLabel labelTitle = new JLabel("Laptop Purchase Assistance");	
	JLabel labelTrending = new JLabel("TOP 5 TRENDING");
	JLabel labelTrending2 = new JLabel("Laptops in our store!");

	JLabel labelParts = new JLabel("Understand the parts of a laptop.");
	JLabel labelOperating = new JLabel("Pick your operating system!");
	JLabel labelCPU = new JLabel("Know your CPUs.");
	JLabel labelGPU = new JLabel("Select your graphics card!");
	JLabel labelProcessor = new JLabel("Hmm... processor?");
	JLabel labelRAM = new JLabel("How much RAM?");
	JLabel labelStorage = new JLabel("... and Storage Space?");
	JLabel labelPorts = new JLabel("How many ports?");
	
	JLabel labelQuestions = new JLabel("Other questions?");
	
	JLabel labelContactUs = new JLabel("Contact us");
	JLabel labelContactPhone = new JLabel("Phone #: 123-456-789");
	JLabel labelContactAddress = new JLabel("Address: 1234 Heeha Street");
	JLabel labelContactEmail = new JLabel("Contact: TechCanadaStore@gmail.com");
	
	// Buttons
	JButton trending = new JButton("Learn more");
	JButton parts = new JButton("Learn more");
	JButton operating = new JButton("Learn more");
	JButton cpu = new JButton("Learn more");
	JButton gpu = new JButton("Learn more");
	JButton processor = new JButton("Learn more");
	JButton ram = new JButton("Learn more");
	JButton storage = new JButton("Learn more");
	JButton ports = new JButton("Learn more");
	
	JButton send = new JButton("Send");
	
	JButton back = new JButton("Back");
	
	
	// Top 5 Trending Images
	JPanel macbookAirPanel = new JPanel();
	JLabel macbookAirLabel = new JLabel();
	
	JPanel macbookProPanel = new JPanel();
	JLabel macbookProLabel = new JLabel();
	
	JPanel zephyrusPanel = new JPanel();
	JLabel zephyrusLabel = new JLabel();
	
	JPanel lenovoPanel = new JPanel();
	JLabel lenovoLabel = new JLabel();
	
	JPanel microsoftPanel = new JPanel();
	JLabel microsoftLabel = new JLabel();
	
	
	// Constructor
	public EducationFrame() {
		
		// Sets the size and disables frame resizing
		setSize(1440, 900);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		background.setLayout(null);

		
		// Sets the title of the frame (not inside the frame)
		setTitle("TechCanada Education Page");
		
		
		// Labels
		// Sets the bounds, font, and foreground colour of each label
		labelTitle.setBounds(50, 20, 500, 50);
		labelTitle.setFont(new Font("Arial", Font.BOLD, 30));
		labelTitle.setForeground(titleColour);
		
		labelTrending.setBounds(50, 70, 300 ,50);
		labelTrending.setFont(new Font("Arial", Font.BOLD, 17));
		labelTrending.setForeground(trendingColour);
		
		labelTrending2.setBounds(197, 70, 300 ,50);
		labelTrending2.setFont(new Font("Arial", Font.PLAIN, 17));
		labelTrending2.setForeground(fontColour);
		
		
		labelParts.setBounds(50, 110, 300 ,50);
		labelParts.setFont(new Font("Arial", Font.PLAIN, 17));
		labelParts.setForeground(fontColour);

		
		labelOperating.setBounds(50, 150, 300 ,50);
		labelOperating.setFont(new Font("Arial", Font.PLAIN, 17));
		labelOperating.setForeground(fontColour);

		
		labelCPU.setBounds(50, 190, 300 ,50);
		labelCPU.setFont(new Font("Arial", Font.PLAIN, 17));
		labelCPU.setForeground(fontColour);

		
		labelGPU.setBounds(50, 230, 300 ,50);
		labelGPU.setFont(new Font("Arial", Font.PLAIN, 17));
		labelGPU.setForeground(fontColour);


		labelProcessor.setBounds(50, 270, 300 ,50);
		labelProcessor.setFont(new Font("Arial", Font.PLAIN, 17));
		labelProcessor.setForeground(fontColour);


		labelRAM.setBounds(50, 310, 300 ,50);
		labelRAM.setFont(new Font("Arial", Font.PLAIN, 17));
		labelRAM.setForeground(fontColour);

		
		labelStorage.setBounds(50, 350, 300 ,50);
		labelStorage.setFont(new Font("Arial", Font.PLAIN, 17));
		labelStorage.setForeground(fontColour);


		labelPorts.setBounds(50, 390, 300 ,50);
		labelPorts.setFont(new Font("Arial", Font.PLAIN, 17));
		labelPorts.setForeground(fontColour);

		
		labelQuestions.setBounds(50, 460, 300, 50);
		labelQuestions.setFont(new Font("Arial", Font.BOLD, 17));
		labelQuestions.setForeground(titleColour);

		
		labelContactUs.setBounds(50, 680, 300, 50);
		labelContactUs.setFont(new Font("Arial", Font.BOLD, 15));
		labelContactUs.setForeground(titleColour);

		
		labelContactPhone.setBounds(50, 700, 300, 50);
		labelContactPhone.setFont(new Font("Arial", Font.PLAIN, 15));
		labelContactPhone.setForeground(fontColour);

		
		labelContactAddress.setBounds(50, 720, 300, 50);
		labelContactAddress.setFont(new Font("Arial", Font.PLAIN, 15));
		labelContactAddress.setForeground(fontColour);

		
		labelContactEmail.setBounds(50, 740, 300, 50);
		labelContactEmail.setFont(new Font("Arial", Font.PLAIN, 15));
		labelContactEmail.setForeground(fontColour);

		
		// Text Field
		enterQuestion.setBounds(50, 500, 370, 40);
		enterQuestion.setFont(new Font("Arial", Font.PLAIN, 17));
		
		
		// Adds each label to the background
		background.add(labelTitle);
		
		background.add(labelTrending);
		background.add(labelTrending2);
		background.add(labelParts);
		background.add(labelOperating);
		background.add(labelCPU);
		background.add(labelGPU);
		background.add(labelProcessor);
		background.add(labelRAM);
		background.add(labelStorage);
		background.add(labelPorts);
		background.add(labelQuestions);
		
		background.add(labelContactUs);
		background.add(labelContactPhone);
		background.add(labelContactAddress);
		background.add(labelContactEmail);
		
		background.add(enterQuestion);
		
		
		// Buttons
		// Sets the bounds of each button and adds an action listener (makes the buttons reactive)
		trending.setBounds(360, 85, 100, 20);
		trending.setBackground(backgroundColour);
		trending.setForeground(buttonsColour);
		
		trending.addActionListener(this);

		parts.setBounds(310, 125, 100, 20);
		parts.setBackground(backgroundColour);
		parts.setForeground(buttonsColour);

		parts.addActionListener(this);

		operating.setBounds(280, 165, 100, 20);
		operating.setBackground(backgroundColour);
		operating.setForeground(buttonsColour);
		
		operating.addActionListener(this);

		cpu.setBounds(195, 205, 100, 20);
		cpu.setBackground(backgroundColour);
		cpu.setForeground(buttonsColour);
		
		cpu.addActionListener(this);

		gpu.setBounds(260, 245, 100, 20);
		gpu.setBackground(backgroundColour);
		gpu.setForeground(buttonsColour);
		
		gpu.addActionListener(this);

		processor.setBounds(215, 285, 100, 20);
		processor.setBackground(backgroundColour);
		processor.setForeground(buttonsColour);
		
		processor.addActionListener(this);

		ram.setBounds(200, 325, 100, 20);
		ram.setBackground(backgroundColour);
		ram.setForeground(buttonsColour);
		
		ram.addActionListener(this);

		storage.setBounds(235, 365, 100, 20);
		storage.setBackground(backgroundColour);
		storage.setForeground(buttonsColour);
		
		storage.addActionListener(this);

		ports.setBounds(200, 405, 100, 20);
		ports.setBackground(backgroundColour);
		ports.setForeground(buttonsColour);
		
		ports.addActionListener(this);
		
		send.setBounds(318, 545, 100, 20);
		send.setBackground(backgroundColour);
		send.setForeground(buttonsColour);
		
		send.addActionListener(this);
		
		back.setBounds(50, 630, 100, 20);
		back.setBackground(backgroundColour);
		back.setForeground(buttonsColour);
		
		back.addActionListener(this);
		
		
		// Adds each button to the background
		background.add(trending);
		background.add(parts);
		background.add(operating);
		background.add(cpu);
		background.add(gpu);
		background.add(processor);
		background.add(ram);
		background.add(storage);
		background.add(ports);
		background.add(send);
		background.add(back);

		
		// Sets the text area so that its contents cannot be changed by the user
		textArea.setEditable(false);
		
		// Sets the colour of the background of the text area to the background of the display
		textArea.setBackground(displayBackgroundColour);
		
		
		// Creates the scroll pane with the text area
		// Sets the bounds for the scroll pane
		// * Note: the text area will have the same bounds
		scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(15, 15, 800, 770);
		
		
		// Sets the display box's bounds, colour, and layout manager
		displayBox.setBounds(570, 25, 830, 800);
		displayBox.setBackground(displayBoxColour);
		displayBox.setLayout(null);
		
		
		// Adds the scroll pane to the display box
		// Then adds the display box to the frame
		displayBox.add(scrollPane);
		add(displayBox);
			
	
		// Adds a layer of background to add labels and buttons
		background.setBounds(0, 0, 1440, 900);
		background.setOpaque(true);
		background.setBackground(backgroundColour);
		add(background);
		
		
		// Makes the frame visible
		setVisible(true);
	
	}

	// Listens to the actions performed (e.g. clicking a button) and proceeds accordingly
	@Override
	public void actionPerformed(ActionEvent event) {
		
		// If user clicks on the "learn more" for the trending, display the top 5 trending laptops
		if (event.getSource() == trending) {
			
			// Macbook Air 13 Inch
			macbookAirLabel.setIcon(new ImageIcon("images/macbookair13.jpg"));
			macbookAirPanel.add(macbookAirLabel);
			
			macbookAirPanel.setBounds(630, 100, 300, 470);
						
			add(macbookAirPanel);

			
			// Macbook Pro 13 Inch
			macbookProLabel.setIcon(new ImageIcon("images/macbookpro13.jpg"));
			macbookProPanel.add(macbookProLabel);
			
			macbookProPanel.setBounds(630, 425, 300, 168);
			
			add(macbookProPanel);
			
			
			// ASUS ROG Zephyrus G14
			zephyrusLabel.setIcon(new ImageIcon("images/zephyrus.jpg"));
			zephyrusPanel.add(zephyrusLabel);
			
			zephyrusPanel.setBounds(630, 625, 300, 168);
			
			add(zephyrusPanel);

			
			// Lenovo Chromebook Duet 2-in-1
			lenovoLabel.setIcon(new ImageIcon("images/lenovochrome.png"));
			lenovoPanel.add(lenovoLabel);
			
			lenovoPanel.setBounds(1000, 100, 300, 300);
			
			add(lenovoPanel);
			
			// Microsoft Surface Laptop Go
			microsoftLabel.setIcon(new ImageIcon("images/microsoftsurface.jpg"));
			microsoftPanel.add(microsoftLabel);
			
			microsoftPanel.setBounds(1000, 450, 300, 200);
			
			add(microsoftPanel);
			
			validate();
		
		}
		
		// Otherwise, if the user clicks on parts, educate the user on the parts of the computer
		else if (event.getSource() == parts) {
									
			textArea.setText("LAPTOP PARTS \t \t DESCRIPTION\n\n" 
		+ "Display Screen \t                           - An output device used to display outputs\n" 
		+ "\t \t - May have touch screen compatibility\n"
		+ "\t \t - Touch screen allows users to navigate using their fingers\n\n" 
		
		+ "Keyboard \t \t - Most common input device used to input commands/data into the laptop/computer\n\n"
		
		+ "Base Panel \t \t - A place for the laptop parts to be installed (e.g. motherboard, RAM, hard drive, cooling fan, battery, CD, etc.\n\n" + "Top Panel \t \t - Provides installation place and support for laptop screen\n\n"
		+ "Cooling Fan \t \t - Allows interior ventilation to cool down the temperature of internal components such as CPU, GPU, etc.\n\n"
		
		+ "RAM \t \t - Short for Random Access Memory\n"
		+ "\t \t - Temporary memory that stores data and programs while they are being used\n"
		+ "\t \t - Computer must stay on to maintain data\n\n"
		
		+ "Hard Disk \t \t - Hard Disk Drive (HDD)\n"
		+ "\t \t - Non-volatile data storage device\n"
		+ "\t \t - Maintains data when turned off\n\n"
		
		+ "Touchpad \t \t - Also known as a trackpad\n"
		+ "\t \t - Uses finger touch sensor on a specific surface\n"
		+ "\t \t - Translates the motion and position of fingers on the surface to the cursor on the screen\n"
		+ "\t \t - Mostly used to substitute a mouse\n\n"
		
		+ "Palm Rest Assembly \t - Casing that surrounds the keyboard\n"
		+ "\t \t - Allows the user to place their hands/palms when operating the keyboard keys and touchpad\n\n"
		
		+ "Battery \t \t - Provides power for the laptop to run\n"
		+ "\t \t - Most common laptop battery voltages: 10.8V, 11.1V, or 14.8V\n"
		+ "\t \t - All laptop batteries are rechargeable to provide reusable technology\n\n"
		
		+ "Hinge \t \t - Allows the laptop screen to be rotated with respect to the keyboard\n"
		+ "\t \t - Provides space optimization, protection for the screen and other fragile components, and ergonomics\n\n"
		
		+ "Speaker \t \t - Used to produce sound\n"
		+ "\t \t - Allows the user to control the volume\n"
		+ "\t \t - Comes in power ratings of 2.6 watts or 5-watt\n\n"
		
		+ "Optical Drive \t \t - Can read and record data of CDs, DVDs, or Blu-Ray discs\n\n"
		
		+ "Antenna \t \t - Provides wireless connectivity in the laptop\n"
		+ "\t \t - Wifi internet, bluetooth, etc.\n"
		+ "\t \t - Most common antennas operate either in WLAN or bluetooth\n");
			
			textArea.setFont(new Font("Arial", Font.PLAIN, 17));
			textArea.setForeground(fontColour);
			textArea.setBackground(displayBackgroundColour);
			
			//textArea.setBounds(10, 10, 500, 500);
			

		}
		
		// Otherwise, if the user clicks on operating, educate the user on operating systems
		else if (event.getSource() == operating) {
			textArea.setText("To pick your operating system (OS), think what software you will use and which operating systems are compatible.\n\n"
					
					+ "    - Windows:\n            - The best choice if you need Microsoft apps like Words, Excel, Office, Outlook, etc.\n\n"
					
					+ "    - MacOS:\n            - Apple's operating system \n            - Windows's competitor! \n            - Must own an iPhone, iPad, or Macbook \n            - More beginner-friendly\n\n"
					
					+ "    - Chrome OS:\n            - Are more of your laptop tasks in a web browser like Google? Then, Chrome OS is a great choice!\n"
					+ "            - Chrome laptops (also called Chromebooks) are one of the cheapest and least powerful in the market\n"
					+ "            - Worth considering if you're on a tight budget");
			
			textArea.setFont(new Font("Arial", Font.PLAIN, 17));
			textArea.setForeground(fontColour);
			textArea.setBackground(displayBackgroundColour);
		
		}
		
		// Otherwise, if the user clicks on CPU, educate the user on the types of CPU
		else if (event.getSource() == cpu) {
			textArea.setText("After selecting your operating system, you can now figure out the hardware specifications you'll need! Let's take a look at the CPU.\n\n"
					
					+ "Two popular companies that make laptop processors: Intel and AMD.\n\n"
					
					+ "Intel Processors:\n"
					+ "    - Main processors in increasing order of power: Core i3, Core i5, Core i7, and Core i9\n"
					+ "    - Example: Intel Core i5-10510U\n"
					+ "          - First two numbers “10” refer to the generation. Thus, this chip is 10th-generation.\n"
					+ "          - Next two numbers “510” are related to the performance. The higher, the more powerful the chip is.\n" 
					+ "             However, just because these numbers could be higher than the ones in Core i7, does not mean Core i3 is more\n" 
					+ "             powerful. Therefore, this is only applicable within that chip line.\n"
					+ "          - The letter at the end of the chip’s name “U” is Intel’s classification for the chip’s purpose. For laptops, the\n"
					+ "            letters you'll see at the end are Y, U, and H. The only one you need to worry about is the letter Y, which is used\n"
					+ "            to optimize battery life.\n\n"
					
					+ "AMD Processors:\n"
					+ "    - Example: AMD Ryzen 5 3600 X\n"
					+ "          - “3” is the generation. Therefore, higher is better.\n"
					+ "          - “6” is how powerful it is. 6 is a medium-powered chip, whereas 3 or 4 is weaker/slower.\n"
					+ "          - The next two numbers “00” don’t really mean anything.\n"
					+ "          - The “X” at the end indicates high performance. There are other letter classifications like U, which indicates ultra-low power.");
			
			textArea.setFont(new Font("Arial", Font.PLAIN, 17));
			textArea.setForeground(fontColour);
			textArea.setBackground(displayBackgroundColour);

		}
		
		// Otherwise, if the user clicks on GPU, educate the user on the types of GPU
		else if (event.getSource() == gpu) {
			textArea.setText("Let's pick your graphics card!\n\n   - Also called GPU (Graphics Processing Units)\n   - Allows you to watch HD movies and play games\n\n"
					
					+ "   - If you’re a gamer or do a lot of video editing, you’ll need a powerful GPU\n"
					+ "         - Some good options are AMD and NVIDIA\n\n"
					
					+ "   - Most Intel-based laptops contain NVIDIA graphics card, usually one of the GeForce Max-Q cards\n"
					+ "         - Max-Q cards are miniatures of NVIDIA’s desktop cards. They are power-efficient and laptop-friendly.\n"
					+ "         - Example: GeForce GTX 1080 Max-Q\n"
					+ "              - Very powerful but may have worse battery life\n"
					+ "         - Max-Q cards are 15-25% less powerful than the desktop versions but are still powerful for gaming and video editing!\n\n"
					
					+ "   - AMD’s GPU is called Radeon, including Vega and RX cards, and the R-series cards\n"
					+ "         - R-series: Radeon R9 is faster and more powerful than the R7, which is more powerful than Radeon 5 series");
			
			textArea.setFont(new Font("Arial", Font.PLAIN, 17));
			textArea.setForeground(fontColour);
			textArea.setBackground(displayBackgroundColour);

		}
		
		// Otherwise, if the user clicks on processor, educate the user on the types of processor
		else if (event.getSource() == processor) {
			textArea.setText("Hmm... processor?\n\n      - If you’re a casual user who runs a web browser, Microsoft applications, and some photo editing software,\n"
					+ "           we recommend the Intel Core i5 eighth-generation or later processor.\n"
					+ "            - Example: Intel Core i5-8350U\n\n"
					
					+ "      - If you can consider a more expensive option, an Intel i7 is a nice upgrade! It will make your navigation more responsive.\n"
					+ "        However, the more power, the shorter the battery life.\n"
					+ "            - For example, a gaming laptop would use an i7 or i9, but for less demanding tasks, an i3 or i5 does the work!");
			
			textArea.setFont(new Font("Arial", Font.PLAIN, 17));
			textArea.setForeground(fontColour);
			textArea.setBackground(displayBackgroundColour);

		}
		
		// Otherwise, if the user clicks on RAM, educate the user on the types of RAM
		else if (event.getSource() == ram) {
			textArea.setText("How much RAM do I need?\n\n"
					
					+ "      - 8 GB of RAM should be good enough for an average Windows user\n\n"
					
					+ "      - Upgrading to 16 GB will make your laptop more powerful and is a necessity for gaming\n\n"
					
					+ "      - BEFORE you buy, check whether the RAM is soldered to the motherboard. If it’s soldered, you won’t be able to switch or upgrade the RAM by yourself.\n\n"
					
					+ "      - If you’re programming and/or editing video clips, you’ll need a minimum of 16 GB. Of course, if you can afford it, 32 GB of RAM would be much better.\n\n"
					
					+ "      - Chrome OS:\n"
					+ "                  - Requires fewer processors\n"
					+ "                  - 4 GB of RAM should be enough for a Chromebook. Though, upgrading to 8 GB will allow you to open more tabs in your browser.\n\n"
					
					+ "      - Look for RAM that has DDR4 next to it because it’s really fast! DDR3 RAM is older and less common nowadays.\n"
					+ "                  - DDR stands for Double Data Rate\n");
			
			textArea.setFont(new Font("Arial", Font.PLAIN, 17));
			textArea.setForeground(fontColour);
			textArea.setBackground(displayBackgroundColour);
			
		}
		
		// Otherwise, if the user clicks on Storage, educate the user on the types of Storage
		else if (event.getSource() == storage) {
			textArea.setText("Need storage? We got your back!\n\n"
					
					+ "      - The hard drive is like a filing cabinet. The most common one nowadays is a Solid State Drive (SSD)!\n\n"
					
					+ "      - The minimum amount of storage we recommend is 256 GB. If you store things in the cloud or are going for Chromebooks,\n" 
					+ "         you might not consume a lot of space, but it’s good to have more space than less.\n\n"
					
					+ "      - If you install a lot of games or software like Photoshop, or even save a lot of photos or videos, they will take up a ton of space.\n\n"
					
					+ "      - Sometimes, your hard drive doesn’t seem to contain the space written in the advertisement. For example, a hard drive\n" 
					+ "         is labelled 512 GB, but it only has 490 GB available in Windows. Don’t worry, you aren’t getting bamboozled! This has\n" 
					+ "         to do with binary and decimal byte size calculations. The drive makers use decimal bytes, but Windows uses binary,\n"
					+ "         which is why the outcomes are different.");
			
			textArea.setFont(new Font("Arial", Font.PLAIN, 17));
			textArea.setForeground(fontColour);
			textArea.setBackground(displayBackgroundColour);
		
		}
		
		// Otherwise, if the user clicks on Ports, educate the user on the types of ports
		else if (event.getSource() == ports) {
			textArea.setText("How many ports do I need?\n\n"
					
					+ "      - We recommend that you get at least one USB-C, USB-A, and a microphone/headset jack. Also, search for USB-C charging and an SD reader.\n\n"
					
					+ "      - We also recommend laptops that can charge via USB-C. This allows you to use a portable charger if you are\n" 
					+ "         working away from a power outlet (like working on a train or a bus).\n\n"
					
					+ "      - USB-C chargers are also cheaper to replace! However, just because they are cheap doesn’t necessarily mean they guarantee customer satisfaction.\n" 
					+ "         So make sure you buy from reputed brands!\n\n"
					
					+ "      - If you’re a photographer, make sure your laptop has an SD or MicroSD card reader to constantly download images from your camera.");
			
			textArea.setFont(new Font("Arial", Font.PLAIN, 17));
			textArea.setForeground(fontColour);
			textArea.setBackground(displayBackgroundColour);	
			
		}
		
		// Otherwise, if the user clicks on Send, pop up a frame
		else if (event.getSource() == send) {
			popUpFrame frame = new popUpFrame();
			
			frame.setVisible(true);
			
		}
		
		// Otherwise, if the user clicks on Back, display the title frame (main screen)
		else if (event.getSource() == back) {
			new TitleFrame();
			
		}
		
	} // End of action performed

} // End of class
