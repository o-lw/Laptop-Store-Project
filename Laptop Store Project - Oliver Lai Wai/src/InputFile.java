
//package Laptop;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputFile {
	
	static Laptop[] laptopArray = new Laptop[40];
	
	public static void main(String[] args) {
		
		// Fills data
		fillLibrary();
		
		//
		//for (Laptop i : laptopArray) {
			//
			//System.out.println();
		}
	//}
	
	
	 static void fillLibrary() {
		//
		try {
			//C:\Users\Aero\Desktop
			Scanner inputFile = new Scanner(new File("data/LaptopSpreadsheet - Sheet1.csv"));
			
			//
			inputFile.useDelimiter(",|\r\n");
			
			//
			inputFile.nextLine();
			
			//
			for (int index = 0; index < laptopArray.length; index++ ) {
				
				// 		
				String range = inputFile.next();
				String brand = inputFile.next();
				String model = inputFile.next();
				String type = inputFile.next();
				
				double price = inputFile.nextDouble();

				String cpuName = inputFile.next();
				double cpuGHz = inputFile.nextDouble();
				
				int storageRAM = inputFile.nextInt();
				int storageSSD = inputFile.nextInt();

				String gpuName = inputFile.next();
				
				String ports = inputFile.next();
				String operatingSystem = inputFile.next();
				
				int displayLength = inputFile.nextInt();
				int displayWidth = inputFile.nextInt();
				double displayInch = inputFile.nextDouble();
				
				String touchscreen = inputFile.next();
				
				double weight = inputFile.nextDouble();
				
				double cpuRating = inputFile.nextDouble();
				double gpuRating = inputFile.nextDouble();
				double laptopRating = inputFile.nextDouble();
				
				//
				laptopArray[index] = new Laptop(range, brand, model, type, price, cpuName, cpuGHz, storageRAM, storageSSD, gpuName, ports, operatingSystem, displayLength, displayWidth, displayInch, touchscreen, weight, cpuRating, gpuRating, laptopRating);
				System.out.println(laptopArray[index]);
			}
			
			//
			inputFile.close();
		
		} catch(FileNotFoundException e) {
			System.out.println("File Error");
		}
		
	}
}