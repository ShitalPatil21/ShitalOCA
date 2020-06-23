package com.capgemini.oca.corrected;

public class Example54 {
	String msg; 
	public Example54(String msg) {
		this.msg=msg;
	}
	public static void main(String[] args) {
        
        System.out.println("Hello"+new StringBuilder("Java se 8"));
        System.out.println("Hello"+new Example54("Java SE 8"));
	}

}
