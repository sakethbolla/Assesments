package com.assesment2.basic;

public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em = new Employee("saketh",22,"ASE");
		HR_Manager1 tc = new HR_Manager1();
		em = tc.process_Record(em);
		System.out.println(em.getAge());
		System.out.println(em.getDesignation());
		System.out.println(em.getName());
		System.out.println(em.getAge());
		System.out.println(em.getDesignation());
		System.out.println(em.getName());
		System.out.println(em.getAge());
		System.out.println(em.getDesignation());
		System.out.println(em.getName());
		System.out.println(em.getAge());
		System.out.println(em.getDesignation());
		System.out.println(em.getName());

	}

}
