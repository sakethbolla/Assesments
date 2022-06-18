package com.assesment2.basic;

public class TesterDemonstarte {

	public static void main(String[] args) {
		//for abstract
		Demo dm;
		dm = new ConcreteDemo();
		Demo.process();
		dm.show();
		dm.process2();
		
		//for super. 
		ConcreteDemo cd = new ConcreteDemo();
		cd.hello();

	}

}
