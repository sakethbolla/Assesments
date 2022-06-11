package com.assignment5.basic;

public class SimpleIntrest {
	int p,t,r;
	void Intrest() {
		int SI = (p*t*r)/100;
		int total = SI + p;
		System.out.println("Calculated simple intrest is "+ SI);
		System.out.println("Total amount to be paid is " + total);
	}

}
