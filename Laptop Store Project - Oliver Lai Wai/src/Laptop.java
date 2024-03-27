
public class Laptop {
	
	// Fields
	private String range;
	private String brand;
	private String model;
	private String type;
	
	private double price;

	private String cpuName;
	private double cpuGHz;
	
	private int storageRAM;
	private int storageSSD;

	private String gpuName;
	
	private String ports;
	private String operatingSystem;
	
	private int displayLength;
	private int displayWidth;
	private double displayInch;
	
	private String touchscreen;
	
	private double weight;
	
	private double cpuRating;
	private double gpuRating;
	private double laptopRating;
	private String imageIcon;

	// Constructors
	public Laptop(String range, String brand, String model, String type, double price, String cpuName, double cpuGHz,
			int storageRAM, int storageSSD, String gpuName, String ports, String operatingSystem, int displayLength,
			int displayWidth, double displayInch, String touchscreen, double weight, double cpuRating,
			double gpuRating, double laptopRating) {
		super();
		this.range = range;
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.price = price;
		this.cpuName = cpuName;
		this.cpuGHz = cpuGHz;
		this.storageRAM = storageRAM;
		this.storageSSD = storageSSD;
		this.gpuName = gpuName;
		this.ports = ports;
		this.operatingSystem = operatingSystem;
		this.displayLength = displayLength;
		this.displayWidth = displayWidth;
		this.displayInch = displayInch;
		this.touchscreen = touchscreen;
		this.weight = weight;
		this.cpuRating = cpuRating;
		this.gpuRating = gpuRating;
		this.laptopRating = laptopRating;
		
	}

	// Getters and Setters
	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCpuName() {
		return cpuName;
	}

	public void setCpuName(String cpuName) {
		this.cpuName = cpuName;
	}

	public double getCpuGHz() {
		return cpuGHz;
	}

	public void setCpuGHz(double cpuGHz) {
		this.cpuGHz = cpuGHz;
	}

	public int getStorageRAM() {
		return storageRAM;
	}

	public void setStorageRAM(int storageRAM) {
		this.storageRAM = storageRAM;
	}

	public int getStorageSSD() {
		return storageSSD;
	}

	public void setStorageSSD(int storageSSD) {
		this.storageSSD = storageSSD;
	}

	public String getGpuName() {
		return gpuName;
	}

	public void setGpuName(String gpuName) {
		this.gpuName = gpuName;
	}

	public String getPorts() {
		return ports;
	}

	public void setPorts(String ports) {
		this.ports = ports;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public int getDisplayLength() {
		return displayLength;
	}

	public void setDisplayLength(int displayLength) {
		this.displayLength = displayLength;
	}

	public int getDisplayWidth() {
		return displayWidth;
	}

	public void setDisplayWidth(int displayWidth) {
		this.displayWidth = displayWidth;
	}

	public double getDisplayInch() {
		return displayInch;
	}

	public void setDisplayInch(double displayInch) {
		this.displayInch = displayInch;
	}

	public String isTouchscreen() {
		return touchscreen;
	}

	public void setTouchscreen(String touchscreen) {
		this.touchscreen = touchscreen;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCpuRating() {
		return cpuRating;
	}

	public void setCpuRating(double cpuRating) {
		this.cpuRating = cpuRating;
	}

	public double getGpuRating() {
		return gpuRating;
	}

	public void setGpuRating(double gpuRating) {
		this.gpuRating = gpuRating;
	}

	public double getLaptopRating() {
		return laptopRating;
	}

	public void setLaptopRating(double laptopRating) {
		this.laptopRating = laptopRating;
	}

	// toString
	@Override
	public String toString() {
		return "Laptop [range=" + range + ", brand=" + brand + ", model=" + model + ", type=" + type + ", price="
				+ price + ", cpuName=" + cpuName + ", cpuGHz=" + cpuGHz + ", storageRAM=" + storageRAM + ", storageSSD="
				+ storageSSD + ", gpuName=" + gpuName + ", ports=" + ports + ", operatingSystem=" + operatingSystem
				+ ", displayLength=" + displayLength + ", displayWidth=" + displayWidth + ", displayInch=" + displayInch
				+ ", touchscreen=" + touchscreen + ", weight=" + weight + ", cpuRating=" + cpuRating + ", gpuRating="
				+ gpuRating + ", laptopRating=" + laptopRating + "]";
	}
	
	
	
	
	
	
	
	
	
	
} // End of laptop application