package com.greedy.section01.extend;

public class FireCar extends Car {
	
	public FireCar() {
		/* �θ� ������ ȣ�� ����
		 * ��� ������ �� ù �ٿ� super()�� �����Ϸ��� �ڵ� �߰��Ѵ�.
		 * */
		super();
		System.out.println("FireCar Ŭ������ �⺻ ������ ȣ���...");
	}
	
	/* @Override ������̼�
	 * JDK 1.5���� �߰��� �������� �������̵� ���� ����� üũ�Ͽ� �������� �ʴ� ��� ������ ������ �߻���Ų��.
	 * */
	@Override
	public void soundHorn() {
		
		/* super.
		 * �θ� �ν��Ͻ��� �ּҸ� �����ϴ� ���۷��� �����̴�.
		 * this.�� �ڵ����� �����Ϸ��� �߰��������� ��������� �θ� ���� ����� �����ؾ� �ϴ°�� super.�� ����ؾ� �Ѵ�.
		 * */
		if(super.isRunning()) {
			System.out.println("���ƾƾƾƾƾƾ�~~~ ���ƾƾƾƾƾƾ�!!!!!");			
		} else {
			System.out.println("�ҹ����� ������ �� �� �����ϴ�~ ��Ű����~");
		}
	}
	
	public void sprayWater() {
		
		System.out.println("�ҳ� ���� �߰��߽��ϴ�. ���� �Ѹ��ϴ�. ======================>");
	}
}
