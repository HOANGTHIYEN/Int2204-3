

public class Computer {
	public String model;
	public String cpu;
    public String gpu;
    public String ram;
    public String cost;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public Computer(String model, String cpu, String gpu, String ram, String cost) {
		super();
		this.model = model;
		this.cpu = cpu;
		this.gpu = gpu;
		this.ram = ram;
		this.cost = cost;
	}
    
}
