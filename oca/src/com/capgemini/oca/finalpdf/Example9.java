package com.capgemini.oca.finalpdf;

public class Example9 {
   private char var;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char var1='a';
     char var2=var1;
     var2='e';
     Example9 obj1=new Example9();
     Example9 obj2=obj1;
     obj1.var='i';
     obj2.var='o';
     System.out.println(var1);
     System.out.println(var2);
     System.out.println(obj1.var);
     System.out.println(obj2.var);
	}

}
