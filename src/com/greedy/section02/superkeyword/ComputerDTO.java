package com.greedy.section02.superkeyword;

public class ComputerDTO extends ProductDTO {
	
	private String cpu;					//cpu
	private int hdd;					//hdd
	private int ram;					//ram
	private String operationSystem;		//�ü��
	
	public ComputerDTO() {
		System.out.println("ComputerDTO Ŭ������ �⺻������ ȣ����...");
	}

	public ComputerDTO(String cpu, int hdd, int ram, String operationSystem) {
		super();
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
		
		System.out.println("ComputerDTO Ŭ������ ��� �ʵ带 �ʱ�ȭ�ϴ� ������ ȣ����...");
	}
	
	public ComputerDTO(String code, String brand, String name, int price, java.util.Date manufacturingDate,
			String cpu, int hdd, int ram, String operationSystem) {
		
		super(code, brand, name, price, manufacturingDate);
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
		
		System.out.println("ComputerDTO Ŭ������ �θ� �ʵ嵵 �ʱ�ȭ�ϴ� ������ ȣ����...");
	}

	public String getCpu() {
		return cpu;
	}

	public int getHdd() {
		return hdd;
	}

	public int getRam() {
		return ram;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}
	
	@Override
	public String getInformation() {
		/*
		 * return "ComputerDTO [code=" + super.getCode() + ", brand=" + super.getBrand()
		 * + ", name=" + super.getName() + ", price=" + super.getPrice() +
		 * ", manufacturingDate=" + super.getManufacturingDate() + ", cpu=" + this.cpu +
		 * ", hdd=" + this.hdd + ", ram=" + this.ram + ", operationSystem=" +
		 * this.operationSystem + "]";
		 */
		return super.getInformation() + 
				"ComputerDTO [cpu=" + cpu + 
				", hdd=" + hdd + 
				", ram=" + ram +
				", operationSystem=" + operationSystem
				+ "]";
				
	}
}
