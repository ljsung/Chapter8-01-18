package com.greedy.section01.extend;

public class RacingCar extends Car {
	
	public RacingCar() {
		System.out.println("RacingCar Ŭ������ �⺻������ ȣ���...");
	}
	
	@Override
	public void run() {
		
		System.out.println("���̽�ī�� ���ӷ����� �����մϴ�!!!!!!!");
	}
	
	@Override
	public void soundHorn() {}
	
	@Override
	public void stop() {
		
		System.out.println("���̽�Ű�� ����ϴ�!!");
	}
	
}
