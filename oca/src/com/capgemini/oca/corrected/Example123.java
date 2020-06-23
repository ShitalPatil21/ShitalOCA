package com.capgemini.oca.corrected;

public class Example123 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("java");
		String s="java";
		if(sb.toString().equals(s)) {
			System.out.println("match1");
		}
		else if(sb.equals(s)) {
			System.out.println("match2");
		}else {
			System.out.println("No match");
		}
		}

}
