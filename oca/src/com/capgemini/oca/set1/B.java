package com.capgemini.oca.set1;

 class Base {

	

}
class A extends Base{
	public void test() {
		System.out.println("Derived A");
	}
}
class B extends A{
	public void test() {
		System.out.println("Derived B");
	}
	public static void main(String[] args) {
		B ex=new B();
		//B ex1=(B) new A();
		B ex2=new B();
		B ex3=ex2;
		ex.test();
		ex3.test();
		
		
	}
}