package com.greedy.section02.superkeyword;

import java.util.Date;

public class ProductDTO extends java.lang.Object {
	
	private String code;							//��ǰ�ڵ�
	private String brand;							//������
	private String name;							//��ǰ��
	private int price;								//��ǰ����
	private java.util.Date manufacturingDate;		//��������
	
	public ProductDTO() {
//		super();
		System.out.println("ProductDTO Ŭ������ �⺻������ ȣ����...");
	}

	public ProductDTO(String code, String brand, String name, int price, Date manufacturingDate) {
		
		super();
		this.code = code;
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
		
		System.out.println("ProductDTO Ŭ������ �Ű����� �ִ� ������ ȣ����...");
	}

	public String getCode() {
		return code;
	}

	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public java.util.Date getManufacturingDate() {
		return manufacturingDate;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setManufacturingDate(java.util.Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	
	public String getInformation() {
		
		return "ProductDTO [code=" + code + 
				", brand=" + brand + 
				", name=" + name + 
				", price=" + price +
				", manufacturingDate=" + manufacturingDate + 
				"]";
	}
}
