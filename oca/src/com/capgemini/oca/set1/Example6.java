package com.capgemini.oca.set1;

public class Example6 {

	private char var;
	public static void main(String[] args) {
		char var1='a';
		char var2=var1;
		var2='e';
		Example6 ex=new Example6();
		Example6 ex1=ex;
		ex.var='i';
		ex1.var='o';
		System.out.println(ex.var);
		System.out.println(ex1.var);
		System.out.println(var1);
		System.out.println(var2);
		

	}

}
