package org.krishna.advance.InterfaceUpdate;

public class ImpClass implements A,B{
	@Override
	public void m2() {
		B.super.m2();
		System.out.println("m2 in class");
	}

}