package com.greedy.section03.overriding;

public class SubClass extends SuperClass {
	
	@Override
	public void method(int num) {}
	
	/* private method�� �������̵� �Ұ� */
//	@Override
//	private void privateMethod() {}
	
	/* final �޼ҵ� �������̵� �Ұ� */
//	@Override
//	public final void finalMethod() {}
	
	/* �θ� �޼ҵ��� ���������� ������ ���ų� �� ���� ������ �������̵� ���� */
//	@Override
//	void protectedMethod() {}					//�Ұ���
	
//	@Override
//	protected void protectedMethod() {}			//����
	
	@Override
	public void protectedMethod() {}			//����
}
