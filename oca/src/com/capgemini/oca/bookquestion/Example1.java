package com.capgemini.oca.bookquestion;

public class Example1 {

	public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("abc");
	String s="abc";
	sb.reverse().append("d");
	s.toUpperCase().concat("d");
	System.out.println(sb);
	System.out.println(s);
	}

}
