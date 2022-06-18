package com.assesment2.basic;

public class ConcreteDemo extends Demo{
	int Hi = 2;
	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("Hi im concrete class");
		
	}
	void hello() {
		System.out.println(super.Hi); //using super to call variable from other class
		System.out.println(Hi); //using same method variable 
	}

}
