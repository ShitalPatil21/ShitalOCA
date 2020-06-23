package com.capgemini.oca.finalpdf;

public class Example1 {
	private char var;
	public static void main(String[] args) {
		char var1='a';
		char var2= var1;
		var2='e';
		Example1 ex1=new Example1();
		Example1 ex2=ex1;
		ex1.var='i';
		
		ex2.var='o';
		System.out.println(var1);
		System.out.println(var2);
System.out.println(ex1.var);
System.out.println(ex2.var);}

}
