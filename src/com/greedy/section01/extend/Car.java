package com.greedy.section01.extend;

public class Car {
	
	private boolean isRunning;
	
	public Car() {
		System.out.println("Car Ŭ������ �⺻ ������ ȣ���...");
	}
	
	public void run() {
		isRunning = true;
		System.out.println("�ڵ����� �޸��ϴ�.");
	}
	
	public void soundHorn() {
		
		if(isRunning) {
			System.out.println("��!��!");			
		} else {
			System.out.println("�������� �ƴ� ���¿����� ������ �︱ �� �����ϴ�.");
		}
	}
	
	public void stop() {
		isRunning = false;
		System.out.println("�ڵ����� ����ϴ�.");
	}
	
	protected boolean isRunning() {
		return isRunning;
	}

}
