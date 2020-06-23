package com.capgemini.oca.finalpdf;
 class Example2 {

	public void display() {
		System.out.println("c2");
	}
}
 interface I{
	 public void displayI();
	 
 }
 class C1 extends Example2 implements I{

	@Override
	public void displayI() {
		System.out.println("c1");
		
	}
	
	Example1 obj1=new Example1();
	
	 
 }
