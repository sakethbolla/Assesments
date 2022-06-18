package com.assesment2.basic;

public abstract class Demo {
	int Hi = 1;
	abstract void show();
	static void process(){
		System.out.println("This is process");
	}
	final void process2() {
		System.out.println("I cannot be method overriden and my variables and class are fixed cant be changed");
	}
	
	

}
