package com.capgemini.oca.set1;

public class Example47 {
int num;
public static void marks(Example47 obj) {
	obj.num+=10;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example47 obj1=new Example47();
		Example47 obj2=obj1;
		Example47 obj3=null;
		
		obj2.num=47;
	}

}
